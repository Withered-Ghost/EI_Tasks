package command;

import rover.Rover;

public class TurnRight implements Command {
    @Override
    public int execute(Rover rover, int elevationDiff) {
        return rover.turnRight();
    }
}
