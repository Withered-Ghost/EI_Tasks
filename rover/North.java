package rover;

public class North implements Direction {
    private char dir;

    public North() {
        this.dir = 'N';
    }

    @Override
    public void move(Rover rover) {
        rover.x -= 1;
    }
    @Override
    public void turnLeft(Rover rover) {
        rover.facing = new West();
    }
    @Override
    public void turnRight(Rover rover) {
        rover.facing = new East();
    }
    @Override
    public char getDir() {
        return this.dir;
    }
}
