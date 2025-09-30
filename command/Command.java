package command;

import rover.Rover;

public interface Command {
    public int execute(Rover rover, int elevationDiff);
}
