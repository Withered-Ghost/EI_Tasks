package command;

import rover.Rover;

public class TurnLeft implements Command {
    @Override
    public int execute(Rover rover, int elevationDiff) {
        return rover.turnLeft();
    }
}
