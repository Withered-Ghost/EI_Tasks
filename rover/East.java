package rover;

public class East implements Direction {
    private char dir;

    public East() {
        this.dir = 'E';
    }

    @Override
    public void move(Rover rover) {
        rover.y += 1;
    }
    @Override
    public void turnLeft(Rover rover) {
        rover.facing = new North();
    }
    @Override
    public void turnRight(Rover rover) {
        rover.facing = new South();
    }
    @Override
    public char getDir() {
        return this.dir;
    }
}
