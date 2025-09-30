package rover;

import direction.*;
import fuel.*;

public class Rover {
    private int x;
    private int y;
    private int fuel;
    private Direction facing;
    private FuelUsage fuelUsage;

    public Rover() {
        this.x = 0;
        this.y = 0;
        this.fuel = 20;
        this.facing = new North();
        this.fuelUsage = new FlatUsage();
    }

    public Rover(int x, int y, int fuel, Direction facing, FuelUsage fuelUsage) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        this.facing = facing;
        this.fuelUsage = fuelUsage;
    }

    public int move(int elevationDiff) {
        return this.facing.move(this, elevationDiff);
    }

    public int useFuel(int elevationDiff) {
        int fuelCost = this.fuelUsage.calcFuelUsage(elevationDiff);
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
    public FuelUsage getFuelUsage() {
        return this.fuelUsage;
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
    public void setFuelUsage(FuelUsage fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    public String getStats() {
        return "(" + this.x + ", " + this.y + ")\nFuel: " + this.fuel + "\nFacing: " + this.facing.getDir() + "\n";
    }
}
