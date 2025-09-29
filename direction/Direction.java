package direction;

import rover.Rover;

public interface Direction {
    public int move(Rover rover, int elevationDiff);
    public int turnLeft(Rover rover);
    public int turnRight(Rover rover);
    public char getDir();
}
