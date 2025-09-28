package rover;

public interface Direction {
    public void move(Rover rover);
    public void turnLeft(Rover rover);
    public void turnRight(Rover rover);
    public char getDir();
}
