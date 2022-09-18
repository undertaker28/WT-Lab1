package Fundamentals.task4;

import java.util.Arrays;

import Fundamentals.task4.Control.PrimaryCheckingControl;

public class Main {
    public static void main(String[] args) {
        PrimaryCheckingControl control = new PrimaryCheckingControl();
        try {
            int[] primeIndexes = control.findPrimeNumbersIndexes(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
            System.out.println(Arrays.toString(primeIndexes)); //[1, 2, 4, 6]

            primeIndexes = control.findPrimeNumbersIndexes(new int[]{12, 14, 18, 21});
            System.out.println(Arrays.toString(primeIndexes)); //[]
        } catch (RuntimeException e) {
            e.printStackTrace();
		}
    }
}