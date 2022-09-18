package Fundamentals.task3.Model;

public class TableRow {
    double x, func;

    public TableRow(double x, double func) {
        this.x = x;
        this.func = func;
    }

    @Override
    public String toString() {
        return String.format("%10.3f | %10.3f", x, func);
    }
}