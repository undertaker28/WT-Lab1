package Fundamentals.task3;

import Fundamentals.task3.Control.TableCreationControl;

public class Main {
    public static void main(String[] args) {
        TableCreationControl control = new TableCreationControl();
        try {
            System.out.println(control.createTable(-1.2, 15.7, 0.5));
        } catch (RuntimeException e) {
            e.printStackTrace();
		}
    }
}