package direction;

import customException.*;
import grid.*;
import rover.*;

public class North implements Direction {
    private char dir;

    public North() {
        this.dir = 'N';
    }

    @Override
    public void move(Rover rover, Grid grid) throws CollisionException, LowFuelException, OutOfBoundsException {
        int x = rover.getX();
        int y = rover.getY();
        int newX = x - 1;
        int newY = y;
        int elevationDiff = 0;

        try {
            elevationDiff = grid.getCell(x, y).getElevationDiff(grid.getCell(newX, newY));
            rover.useFuel(elevationDiff);
            rover.setX(newX);
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
        rover.setFacing(new West());
    }
    @Override
    public void turnRight(Rover rover) {
        rover.setFacing(new East());
    }
    @Override
    public char getDir() {
        return this.dir;
    }
}
