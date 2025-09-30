package direction;

import rover.Rover;

public class East implements Direction {
    private char dir;

    public East() {
        this.dir = 'E';
    }

    @Override
    public int move(Rover rover, int elevationDiff) {
        if(rover.useFuel(elevationDiff) != 0) {
            return 1;
        }
        rover.setY(rover.getY() + 1);
        return 0;
    }
    @Override
    public int turnLeft(Rover rover) {
        rover.setFacing(new North());
        return 0;
    }
    @Override
    public int turnRight(Rover rover) {
        rover.setFacing(new South());
        return 0;
    }
    @Override
    public char getDir() {
        return this.dir;
    }
}
