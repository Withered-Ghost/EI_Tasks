package direction;

import customException.*;
import grid.*;
import rover.*;

public interface Direction {
    public void move(Rover rover, Grid grid) throws CollisionException, LowFuelException, OutOfBoundsException;
    public void turnLeft(Rover rover);
    public void turnRight(Rover rover);
    public char getDir();
}
