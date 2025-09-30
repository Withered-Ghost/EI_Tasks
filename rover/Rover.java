package rover;

import command.*;
import direction.*;
import grid.*;
import java.util.*;

public class Rover {
    private int x;
    private int y;
    private int fuel;
    private Direction facing;

    public Rover() {
        this.x = 0;
        this.y = 0;
        this.fuel = 50;
        this.facing = new North();
    }

    public Rover(int x, int y, int fuel, Direction facing) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        this.facing = facing;
    }

    public void executeCommands(String cmds, Grid grid) {
        Scanner sc = new Scanner(System.in);

        for(char c : cmds.toCharArray()) {
            grid.print(this);
            System.out.print(this.getStats());
            System.out.println("Elevation: " + grid.getCell(this.x, this.y).getElevation());
            sc.nextLine();

            int success;
            Command cmd;

            switch(c) {
                case 'M':
                    cmd = new Move();
                    break;
                case 'L':
                    cmd = new TurnLeft();
                    break;
                case 'R':
                    cmd = new TurnRight();
                    break;
                default:
                    System.out.println("Command not found:" + c);
                    return;
            }

            success = cmd.execute(this, grid);

            if(success != 0) {
                System.out.println("Stopping execution");
                return;
            }
        }
        System.out.println("All commands executed");
    }

    public int move(Grid grid) {
        return this.facing.move(this, grid);
    }

    public int useFuel(int elevationDiff) {
        int fuelCost;

        if(elevationDiff > 0) {
            fuelCost = -1 * elevationDiff;
        }
        else if(elevationDiff == 0) {
            fuelCost = 1;
        }
        else {
            fuelCost = 2 * elevationDiff;
        }

        if(this.fuel - fuelCost < 0) {
            return 1;
        }
        this.fuel -= fuelCost;
        return 0;
    }

    public int turnLeft() {
        return this.facing.turnLeft(this);
    }

    public int turnRight() {
        return this.facing.turnRight(this);
    }

    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public int getFuel() {
        return this.fuel;
    }
    public Direction getFacing() {
        return this.facing;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setFacing(Direction facing) {
        this.facing = facing;
    }

    public String getStats() {
        return "(" + this.x + ", " + this.y + ")\nFuel: " + this.fuel + "\nFacing: " + this.facing.getDir() + "\n";
    }
}
