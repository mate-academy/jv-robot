package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int RANGE_LIMIT = 10;

    public static void main(String[] args) {
        int min = RANGE_LIMIT * (-1);
        int max = RANGE_LIMIT;
        int x = randomBetween(min, max);
        int y = randomBetween(min, max);
        int toX = randomBetween(min, max);
        int toY = randomBetween(min, max);

        Robot chaffy = new Robot(Direction.UP, x, y);
        RobotRoute route = new RobotRoute();
        route.moveRobot(chaffy, toX, toY);
    }

    private static int randomBetween(int min, int max) {
        Random rd = new Random();
        return rd.nextInt(max - min + 1) + min;
    }
}
