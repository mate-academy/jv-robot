package core.basesyntax;

import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Robot robot = new Robot(Direction.UP, 0, 0);
        RobotRoute route = new RobotRoute();

        int toX = random.nextInt(21) - 10;
        int toY = random.nextInt(21) - 10;

        route.moveRobot(robot, toX, toY);

        System.out.println("Starting position: " + robot);
        System.out.println("Target coordinates: (" + toX + ", " + toY + ")");
        System.out.println("After moving: " + robot);
    }
}
