package Fundamentals.task7;

import java.util.Arrays;

import Fundamentals.task7.Control.ShellSortControl;

public class Main {
    public static void main(String[] args) {
        ShellSortControl control = new ShellSortControl();
        try {
            System.out.println(Arrays.toString(control.sort(new double[]{0, -1, -2, -3.1, 5, 2, 8, 4})));
            System.out.println(Arrays.toString(control.sort(new double[]{0, 1, 2, 3, 4.5})));
        } catch (RuntimeException e) {
            e.printStackTrace();
		}
    }
}