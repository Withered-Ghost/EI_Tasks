package rover;

public class West implements Direction {
    private char dir;

    public West() {
        this.dir = 'W';
    }

    @Override
    public Direction turnLeft() {
        return new South();
    }
    @Override
    public Direction turnRight() {
        return new North();
    }
    @Override
    public char getDir() {
        return this.dir;
    }
}
