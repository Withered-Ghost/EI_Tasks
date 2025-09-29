package direction;

import rover.Rover;

public class North implements Direction {
    private char dir;

    public North() {
        this.dir = 'N';
    }

    @Override
    public int move(Rover rover, int elevationDiff) {
        if(rover.useFuel(elevationDiff) != 0) {
            return 1;
        }
        rover.x -= 1;
        return 0;
    }
    @Override
    public int turnLeft(Rover rover) {
        rover.facing = new West();
        return 0;
    }
    @Override
    public int turnRight(Rover rover) {
        rover.facing = new East();
        return 0;
    }
    @Override
    public char getDir() {
        return this.dir;
    }
}
