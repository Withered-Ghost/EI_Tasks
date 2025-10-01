package command;

import customException.*;
import grid.*;
import rover.*;

public interface Command {
    public void execute(Rover rover, Grid grid) throws CollisionException, LowFuelException, OutOfBoundsException;
}
