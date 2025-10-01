package command;

import customException.*;
import grid.*;
import rover.*;

public class Move implements Command {
    @Override
    public void execute(Rover rover, Grid grid) throws CollisionException, LowFuelException, OutOfBoundsException {
        try {
            rover.move(grid);
        }
        catch (CollisionException | LowFuelException | OutOfBoundsException e) {
            throw e;
        }
    }
}
