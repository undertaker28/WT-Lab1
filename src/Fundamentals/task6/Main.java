package Fundamentals.task6;

import java.util.Arrays;

import Fundamentals.task6.Control.MatrixCreationControl;

public class Main {
    public static void main(String[] args) {
        MatrixCreationControl control = new MatrixCreationControl();
        try {
            int[][] matrix = control.toSquareMatrix(new int[]{1});
            System.out.println(Arrays.deepToString(matrix));

            matrix = control.toSquareMatrix(new int[]{9, 8, 7, 6});
            System.out.println(Arrays.deepToString(matrix));
        } catch (RuntimeException e) {
            e.printStackTrace();
		}
    }
}