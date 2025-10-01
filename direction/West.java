package direction;

import customException.*;
import grid.*;
import rover.*;

public class West implements Direction {
    private char dir;

    public West() {
        this.dir = 'W';
    }

    @Override
    public void move(Rover rover, Grid grid) throws CollisionException, LowFuelException, OutOfBoundsException {
        int x = rover.getX();
        int y = rover.getY();
        int newX = x;
        int newY = y - 1;
        int elevationDiff = 0;

        try {
            elevationDiff = grid.getCell(x, y).getElevationDiff(grid.getCell(newX, newY));
            rover.useFuel(elevationDiff);
            rover.setY(newY);
        }
        catch (CollisionException | LowFuelException | OutOfBoundsException e) {
            if(e instanceof CollisionException) {
                throw new CollisionException("Colliding with: (" + newX + ", " + newY + ")");
            }
            throw e;
        }
    }
    @Override
    public void turnLeft(Rover rover) {
        rover.setFacing(new South());
    }
    @Override
    public void turnRight(Rover rover) {
        rover.setFacing(new North());
    }
    @Override
    public char getDir() {
        return this.dir;
    }
}
