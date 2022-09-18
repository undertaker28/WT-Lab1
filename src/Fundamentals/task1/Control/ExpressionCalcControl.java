package Fundamentals.task1.Control;

public class ExpressionCalcControl {
    public double calc(double x, double y) {
        double dividable = 1 + square(Math.sin(x + y));
        return dividable / (2 + Math.abs(x - 2 * x / (1 + square(x * y)))) + x;
    }

    private double square(double val) {
        return val * val;
    }
}