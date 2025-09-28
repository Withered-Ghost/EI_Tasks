package rover;

public class North implements Direction {
    private char dir;

    public North() {
        this.dir = 'N';
    }

    @Override
    public Direction turnLeft() {
        return new West();
    }
    @Override
    public Direction turnRight() {
        return new East();
    }
    @Override
    public char getDir() {
        return this.dir;
    }
}
