package eu.silasporth.sudukoCreator;

public class sudokuGrid {
    private int[][] grid = new int[9][9];

    public int getNumber(int column, int line) {
        return grid[column][line];
    }

    public void setNumber(int column, int line, int number){
        if (0 < number && number < 10)
            grid[column][line] = number;
        else
            throw new NullPointerException();
    }
}
