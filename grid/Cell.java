package grid;

public class Cell {
    private int elevation;

    public Cell() {
        this.elevation = 5;
    }
    public Cell(int elevation) {
        // elevation of -1 means cell is an obstacle
        this.elevation = elevation;
    }

    public int getElevation() {
        return this.elevation;
    }
    public boolean isObstacle() {
        return this.elevation == -1;
    }
    public void setElevation(int elevation) {
        this.elevation = elevation;
    }
    public int getElevationDiff(Cell cell) {
        return this.elevation - cell.elevation;
    }

    public void print() {
        if(this.elevation == -1) System.out.print("X  ");
        else System.out.print(this.elevation + "  ");
    }
}
