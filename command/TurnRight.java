package command;

import grid.*;
import rover.*;

public class TurnRight implements Command {
    @Override
    public int execute(Rover rover, Grid grid) {
        return rover.turnRight();
    }
}
