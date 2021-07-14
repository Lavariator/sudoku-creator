package eu.silasporth.sudukoCreator;

import eu.silasporth.sudukoCreator.SudokuGrid.Difficulty;

import java.util.Random;

public class SudokuBuilder {
    private final SudokuGrid sudokuGrid = new SudokuGrid();
    private int numberOfNumbers;

    public SudokuBuilder(Difficulty difficulty){
        setDifficulty(difficulty);
        assignRandomNumbers();
    }

    public int[][] getSudokuGrid() {
        return sudokuGrid.getGrid();
    }

    private void setDifficulty(Difficulty difficulty){
        Random random = new Random();
        this.numberOfNumbers = random.nextInt(difficulty.getGivenNumbersMax() - difficulty.getGivenNumbersMin()) + difficulty.getGivenNumbersMin();
    }

    private void assignRandomNumbers(){
        Random random = new Random();
        int i = numberOfNumbers;
        while (i > 0){
            int x, y;
            while (true){
                x = random.nextInt(9);
                y = random.nextInt(9);
                if (sudokuGrid.getNumber(x,y) == 0) break;
            }
            int number = random.nextInt(9) + 1;
            sudokuGrid.setNumber(x, y, number);
            i--;
        }

    }
}
