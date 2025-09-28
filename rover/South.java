package rover;

public class South implements Direction {
    private char dir;

    public South() {
        this.dir = 'S';
    }

    @Override
    public void move(Rover rover) {
        rover.x += 1;
    }
    @Override
    public void turnLeft(Rover rover) {
        rover.facing = new East();
    }
    @Override
    public void turnRight(Rover rover) {
        rover.facing = new West();
    }
    @Override
    public char getDir() {
        return this.dir;
    }
}
