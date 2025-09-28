package rover;

public class South implements Direction {
    private char dir;

    public South() {
        this.dir = 'S';
    }

    @Override
    public Direction turnLeft() {
        return new East();
    }
    @Override
    public Direction turnRight() {
        return new West();
    }
    @Override
    public char getDir() {
        return this.dir;
    }
}
