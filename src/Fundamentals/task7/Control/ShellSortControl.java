package Fundamentals.task7.Control;

public class ShellSortControl {
    public double[] sort(double[] arr) {
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] <= arr[i + 1]) {
                i++;
            } else {
                swap(arr, i, i + 1);
                if (i > 0) i--;
            }
        }
        return arr;
    }

    private void swap(double[] arr, int i1, int i2) {
        double tmp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = tmp;
    }
}