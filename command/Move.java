package command;

import grid.*;
import rover.*;

public class Move implements Command {
    @Override
    public int execute(Rover rover, Grid grid) {
        return rover.move(grid);
    }
}
