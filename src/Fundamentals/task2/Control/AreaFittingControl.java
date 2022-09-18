package Fundamentals.task2.Control;

public class AreaFittingControl {
    public boolean checkInsideArea(int x, int y) {
        return checkTop(x, y) || checkBot(x, y);
    }

    public boolean checkTop(int x, int y) {
        return x >= -4 && x <= 4 && y >= 0 && y <= 5;
    }

    public boolean checkBot(int x, int y) {
        return x >= -6 && x <= 6 && y >= -3 && y < 0;
    }
}