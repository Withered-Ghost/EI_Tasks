package rover;

public class East implements Direction {
    private char dir;

    public East() {
        this.dir = 'E';
    }

    @Override
    public Direction turnLeft() {
        return new North();
    }
    @Override
    public Direction turnRight() {
        return new South();
    }
    @Override
    public char getDir() {
        return this.dir;
    }
}
