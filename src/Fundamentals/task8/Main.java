package Fundamentals.task8;

import java.util.Arrays;

import Fundamentals.task8.Control.ElementsInsertControl;

public class Main {
    public static void main(String[] args) {
        ElementsInsertControl control = new ElementsInsertControl();
        try {
            System.out.println(Arrays.toString(control.getPositionsToInsert(new double[]{-1, 2, 3, 5, 8}, new double[]{-0.5, 4, 6.5}))); //[1, 3, 4]
            System.out.println(Arrays.toString(control.getPositionsToInsert(new double[]{-2, -1, 1}, new double[]{-0.5, 0.5}))); //[2, 2]
        } catch (RuntimeException e) {
            e.printStackTrace();
		}
    }
}