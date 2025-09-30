package direction;

import grid.*;
import rover.*;

public interface Direction {
    public int move(Rover rover, Grid grid);
    public int turnLeft(Rover rover);
    public int turnRight(Rover rover);
    public char getDir();
}
