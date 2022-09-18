package Fundamentals.task2;

import Fundamentals.task2.Control.AreaFittingControl;

public class Main {
    public static void main(String[] args) {
        AreaFittingControl control = new AreaFittingControl();
        System.out.println(control.checkInsideArea(2, -1));
        System.out.println(control.checkInsideArea(7, -2));
        System.out.println(control.checkInsideArea(0, 3));
    }
}