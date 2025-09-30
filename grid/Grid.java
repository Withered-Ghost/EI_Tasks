package grid;

import rover.*;

public class Grid {
    private int size;
    private Cell[][] cells;

    public Grid(int size) {
        this.size = size;
        this.cells = new Cell[size][size];
        for(int i = 0; i < this.size; ++i) {
            for(int j = 0; j < this.size; ++j) {
                this.cells[i][j] = new Cell();
            }
        }
    }
    public Grid(int size, int[][] elevationMap) {
        this.size = size;
        this.cells = new Cell[size][size];
        for(int i = 0; i < this.size; ++i) {
            for(int j = 0; j < this.size; ++j) {
                this.cells[i][j] = new Cell(elevationMap[i][j]);
            }
        }
    }

    public Cell getCell(int x, int y) {
        return this.cells[x][y];
    }
    public void setCell(int x, int y, Cell cell) {
        this.cells[x][y] = cell;
    }

    public void print(Rover rover) {
        for(int i = 0; i < this.size; ++i) {
            for(int j = 0; j < this.size; ++j) {
                if(i == rover.getX() && j == rover.getY()) {
                    System.out.print("R  ");
                    continue;
                }
                this.cells[i][j].print();
            }
            System.out.println();
        }
    }
}
