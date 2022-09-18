package Fundamentals.task3.Control;

import Fundamentals.task3.Control.FunctionCalculator.AbstractCalculator;
import Fundamentals.task3.Control.FunctionCalculator.TanCalculator;
import Fundamentals.task3.Model.TableRow;

public class TableCreationControl {
    public String createTable(double a, double b, double h) {
        if (b < a)
            throw new RuntimeException(String.format("Invalid values: a must be <= b!\n Current a = %f, b = %f", a, b));
        if (h <= 0) throw new RuntimeException("Invalid values: h must be positive!");

        TableRow[] tableRows = new TableRow[calcTableSize(a, b, h)];
        int i = 0;
        AbstractCalculator calculator = new TanCalculator();
        for (double x = a; x < b; x += h) {
            tableRows[i] = new TableRow(x, calculator.calculateFunction(x));
            i++;
        }

        StringBuilder builder = new StringBuilder("    x      |       f(x)\n");
        for (i = 0; i < calcTableSize(a, b, h); i++) {
            builder.append(tableRows[i]);
            builder.append('\n');
        }
        return builder.toString();
    }

    private int calcTableSize(double a, double b, double h) {
        return (int) ((b - a) / h) + 1;
    }
}