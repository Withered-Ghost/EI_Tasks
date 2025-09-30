package command;

import rover.Rover;

public class Move implements Command {
    @Override
    public int execute(Rover rover, int elevationDiff) {
        return rover.move(elevationDiff);
    }
}
