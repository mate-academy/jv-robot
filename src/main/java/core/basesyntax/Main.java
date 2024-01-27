package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        RobotRoute robotRoute = new RobotRoute();

        Robot robot1 = new Robot(
                Direction.values()[new Random().nextInt(Direction.values().length)],
                new Random().nextInt(100),
                new Random().nextInt(100));

        int coordinateX = new Random().nextInt(100);
        int coordinateY = new Random().nextInt(100);

        System.out.println("Current direction and  position:"
                + robot1.getDirection() + " " + robot1.getX() + " " + robot1.getY());

        System.out.println("Target position: " + coordinateX + " " + coordinateY);

        robotRoute.moveRobot(robot1, coordinateX, coordinateY);

        System.out.println("Current direction and  position:"
                + robot1.getDirection() + " " + robot1.getX() + " " + robot1.getY());

    }
}
