package rover;

public class Rover {
    private int x;
    private int y;
    private Direction facing;
    private int fuel;

    public Rover() {
        this.x = 0;
        this.y = 0;
        this.facing = new North();
        this.fuel = 20;
    }
    public Rover(int x, int y, Direction facing, int fuel) {
        this.x = x;
        this.y = y;
        this.facing = facing;
        this.fuel = fuel;
    }

    public void setState(int x, int y, Direction facing, int fuel) {
    }
}
