package command;

import grid.*;
import rover.*;

public interface Command {
    public int execute(Rover rover, Grid grid);
}
