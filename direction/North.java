package direction;

import grid.*;
import rover.*;

public class North implements Direction {
    private char dir;

    public North() {
        this.dir = 'N';
    }

    @Override
    public int move(Rover rover, Grid grid) {
        int x = rover.getX();
        int y = rover.getY();
        int elevationDiff = grid.getCell(x, y).getElevationDiff(grid.getCell(x-1, y));

        if(rover.useFuel(elevationDiff) != 0) {
            return 1;
        }
        rover.setX(x - 1);
        return 0;
    }
    @Override
    public int turnLeft(Rover rover) {
        rover.setFacing(new West());
        return 0;
    }
    @Override
    public int turnRight(Rover rover) {
        rover.setFacing(new East());
        return 0;
    }
    @Override
    public char getDir() {
        return this.dir;
    }
}
