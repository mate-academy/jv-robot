package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int UPPER_BOUND = 100;

    public static void main(String[] args) {

        int index = new Random().nextInt(Direction.values().length);
        int coordinateX = new Random().nextInt(UPPER_BOUND);
        int coordinateY = new Random().nextInt(UPPER_BOUND);
        Robot robot = new Robot(Direction.values()[index], coordinateX, coordinateY);
        RobotRoute robotRoute =new RobotRoute();
        robotRoute.moveRobot(robot, 20,30);
            System.out.println("Robot got to home successful!");
        }
    }

