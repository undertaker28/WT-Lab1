package Fundamentals.task5;

import Fundamentals.task5.Control.ElementsKickControl;

public class Main {
    public static void main(String[] args) {
        ElementsKickControl control = new ElementsKickControl();
        try {
            System.out.println(control.findLeastK(new int[]{1, 2, 3, 4, 5, 6, 7, 8})); //0
            System.out.println(control.findLeastK(new int[]{9, 8, 7, 6, 5, 4}));     //5
            System.out.println(control.findLeastK(new int[]{1, -1, 2, -2, 3, -3}));  //3
        } catch (RuntimeException e) {
            e.printStackTrace();
		}
    }
}