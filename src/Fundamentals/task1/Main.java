package Fundamentals.task1;

import Fundamentals.task1.Control.ExpressionCalcControl;

public class Main {
    public static void main(String[] args) {
        ExpressionCalcControl control = new ExpressionCalcControl();
        System.out.println(control.calc(1.23, -4.56));
        System.out.println(control.calc(0, 0));
        System.out.println(control.calc(73.25, -24.06));
    }
}