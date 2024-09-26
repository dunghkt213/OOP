//
<<<<<<< HEAD
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class TetrisGrid {
    private boolean[][] grid;

    public TetrisGrid(boolean[][] grid) {
        this.grid = new boolean[grid.length][];

        for(int i = 0; i < grid.length; ++i) {
            this.grid[i] = (boolean[])grid[i].clone();
        }

    }

    public void clearRows() {
        for(int i = this.grid.length - 2; i >= 0; --i) {
            for(int j = 0; j < this.grid[i].length; ++j) {
                if (this.grid[i][j] && !this.grid[i + 1][j]) {
                    this.grid[i][j] = false;
                    this.grid[i + 1][j] = true;
                }
            }
        }

    }

    boolean[][] getGrid() {
        return this.grid;
    }

    public static void main(String[] args) {
        boolean[][] grid = new boolean[][]{{true, false, true}, {false, true, false}, {true, true, false}};
        TetrisGrid grid1 = new TetrisGrid(grid);
        grid1.clearRows();
        boolean[][] grid2 = grid1.getGrid();

        for(int i = 0; i < grid2.length; ++i) {
            for(int j = 0; j < grid2[i].length; ++j) {
                System.out.print(grid2[i][j] + " ");
            }

            System.out.println();
        }

    }
