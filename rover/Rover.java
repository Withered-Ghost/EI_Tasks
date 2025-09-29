package rover;

import direction.*;
import fuel.*;

public class Rover {
    public int x = 0;
    public int y = 0;
    public int fuel = 20;
    public Direction facing = new North();
    public FuelUsage fuelUsage = new FlatUsage();

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

    public String getStats() {
        return "x: " + this.x + "\ny: " + this.y + "\nFuel: " + this.fuel + "\nFacing: " + this.facing.getDir() + "\n";
    }
}
