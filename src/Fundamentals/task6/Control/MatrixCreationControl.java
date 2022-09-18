package Fundamentals.task6.Control;

public class MatrixCreationControl {
    public int[][] toSquareMatrix(int[] arr) {
        if (arr == null || arr.length == 0) throw new RuntimeException("Array must be initialized with numers!");

        int[][] res = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) { //row
            for (int j = i; j < i + arr.length; j++) {
                res[i][j - i] = arr[j % arr.length];
            }
        }

        return res;
    }
}