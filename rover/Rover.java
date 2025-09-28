package rover;

public class Rover {
    public int x;
    public int y;
    public Direction facing;
    public int fuel;

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
}
