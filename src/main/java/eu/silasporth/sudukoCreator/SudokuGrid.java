package eu.silasporth.sudukoCreator;

public class SudokuGrid {
    private int[][] grid = new int[9][9];

    public int[][] getGrid() {
        return grid;
    }

    public int getNumber(int column, int line) {
        return grid[column][line];
    }

    public void setNumber(int column, int line, int number){
        if (0 < number && number < 10)
            grid[column][line] = number;
        else
            throw new NullPointerException();
    }

    public enum Difficulty{
        EASY(36, 38),
        MEDIUM(30, 32),
        HARD(23, 28),
        EXTREME(20, 22);

        private final int givenNumbersMin;
        private final int givenNumbersMax;


        Difficulty(int givenNumbersMin, int givenNumbersMax){
            this.givenNumbersMin = givenNumbersMin;
            this.givenNumbersMax = givenNumbersMax;
        }

        public int getGivenNumbersMin() {return givenNumbersMin;}

        public int getGivenNumbersMax() {return givenNumbersMax;}
    }
}