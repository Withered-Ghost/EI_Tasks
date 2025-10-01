package command;

import customException.*;
import grid.*;
import rover.*;

public class TurnLeft implements Command {
    @Override
    public void execute(Rover rover, Grid grid) throws CollisionException, LowFuelException, OutOfBoundsException {
        rover.turnLeft();
    }
}
