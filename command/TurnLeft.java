package command;

import grid.*;
import rover.*;

public class TurnLeft implements Command {
    @Override
    public int execute(Rover rover, Grid grid) {
        return rover.turnLeft();
    }
}
