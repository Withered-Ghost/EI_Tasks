package rover;

import command.*;
import customException.*;
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

    public void executeCommands(String cmds, Grid grid) throws CollisionException, InvalidCommandException, LowFuelException, OutOfBoundsException {
        Scanner sc = new Scanner(System.in);

        grid.print(this);
        System.out.print(this.getStats());
        System.out.println("Elevation: " + grid.getCell(this.x, this.y).getElevation());

        for(char c : cmds.toCharArray()) {
            System.out.println("\nExecuting: " + c);
            // sc.nextLine();

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
                    throw new InvalidCommandException("Invalid command: " + c);
            }

            try {
                cmd.execute(this, grid);
            }
            catch (CollisionException | LowFuelException | OutOfBoundsException e) {
                throw e;
            }

            grid.print(this);
            System.out.print(this.getStats());
            System.out.println("Elevation: " + grid.getCell(this.x, this.y).getElevation());
        }
    }

    public void move(Grid grid) throws CollisionException, LowFuelException, OutOfBoundsException {
        try {
            this.facing.move(this, grid);
        }
        catch (CollisionException | LowFuelException | OutOfBoundsException e) {
            throw e;
        }
    }

    public void useFuel(int elevationDiff) throws LowFuelException {
        int fuelCost = 0;

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
            throw new LowFuelException("Insufficient fuel: " + this.fuel + "\nFuel cost: " + fuelCost);
        }
        this.fuel -= fuelCost;
    }

    public void turnLeft() {
        this.facing.turnLeft(this);
    }

    public void turnRight() {
        this.facing.turnRight(this);
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
