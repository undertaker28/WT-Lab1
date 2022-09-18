package ClassesObjects.task9.Entity;

import java.util.ArrayList;

public class Bucket {
    private double maxWeight;
    private double curWeight;
    private ArrayList<Ball> balls = new ArrayList<Ball>();

    {
        curWeight = 0;
    }

    public Bucket(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public boolean offerBall(Ball ball) {
        if (curWeight + ball.getWeight() <= maxWeight) {
            balls.add(ball);
            curWeight += ball.getWeight();
            return true;
        } else {
            return false;
        }

    }

    public int nBallsOfColor(Color color) {
        int i = 0;
        for (Ball ball : balls) {
            if (ball.getColor() == color)
                i++;
        }
        return i;
    }

    public double getWeight() {
        return curWeight;
    }
}