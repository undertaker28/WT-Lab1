package Fundamentals.task4.Control;

import java.util.ArrayList;

public class PrimaryCheckingControl {
    public int[] findPrimeNumbersIndexes(int[] arr) {
        if (arr == null || arr.length == 0) throw new RuntimeException("Array must be initialized with numers!");

        ArrayList<Integer> indexes = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (testPrime(arr[i]))
                indexes.add(i);
        }
        return convertToIntArr(indexes);
    }

    private boolean testPrime(int number) {
        if (number <= 0)
            throw new RuntimeException(String.format("No unnatural numbers are available!\n input: %d", number));
        if (number == 1) return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    private int[] convertToIntArr(ArrayList<Integer> list) {
        int[] res = new int[list.size()];
        int i = 0;
        for (Integer val : list) {
            res[i] = val;
            i++;
        }
        return res;
    }
}