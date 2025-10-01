package command;

import customException.*;
import grid.*;
import rover.*;

public class TurnRight implements Command {
    @Override
    public void execute(Rover rover, Grid grid) throws CollisionException, LowFuelException, OutOfBoundsException {
        rover.turnRight();
    }
}
