package ClassesObjects.task9;

import ClassesObjects.task9.Entity.Color;
import ClassesObjects.task9.Entity.Ball;
import ClassesObjects.task9.Entity.Bucket;

public class Main {
    public static void main(String[] args) {
        Bucket bucket = new Bucket(12.37);
        for (int i = 0; bucket.offerBall(new Ball(getColorByIndex(i), i / 18d + 0.32)); i++) {}
        System.out.printf("Total weight: %f; Blue balls: %d\n", bucket.getWeight(), bucket.nBallsOfColor(Color.BLUE));
    }

    private static Color getColorByIndex(int i) {
        return Color.values()[i % Color.values().length];
    }
}