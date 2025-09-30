package direction;

import grid.*;
import rover.*;

public class West implements Direction {
    private char dir;

    public West() {
        this.dir = 'W';
    }

    @Override
    public int move(Rover rover, Grid grid) {
        int x = rover.getX();
        int y = rover.getY();
        int elevationDiff = grid.getCell(x, y).getElevationDiff(grid.getCell(x, y-1));

        if(rover.useFuel(elevationDiff) != 0) {
            return 1;
        }
        rover.setY(y - 1);
        return 0;
    }
    @Override
    public int turnLeft(Rover rover) {
        rover.setFacing(new South());
        return 0;
    }
    @Override
    public int turnRight(Rover rover) {
        rover.setFacing(new North());
        return 0;
    }
    @Override
    public char getDir() {
        return this.dir;
    }
}
