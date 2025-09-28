package rover;

public class West implements Direction {
    private char dir;

    public West() {
        this.dir = 'W';
    }

    @Override
    public void move(Rover rover) {
        rover.y -= 1;
    }
    @Override
    public void turnLeft(Rover rover) {
        rover.facing = new South();
    }
    @Override
    public void turnRight(Rover rover) {
        rover.facing = new North();
    }
    @Override
    public char getDir() {
        return this.dir;
    }
}
