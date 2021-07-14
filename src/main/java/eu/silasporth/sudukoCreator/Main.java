package eu.silasporth.sudukoCreator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SudokuBuilder sudokuBuilder = new SudokuBuilder(SudokuGrid.Difficulty.EASY);
        for (int[] line : sudokuBuilder.getSudokuGrid()) {
            System.out.println(Arrays.toString(line));
        }
    }
}