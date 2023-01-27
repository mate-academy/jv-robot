package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int UPPER_BOUND = 100;
    Random random = new Random();
    public void main(String[] args) {
        int index = random.nextInt(Direction.values().length);
        int toX = new Random().nextInt(UPPER_BOUND);
        int toY = new Random().nextInt(UPPER_BOUND);
        Robot robot = new Robot(Direction.values()[index], toX, toY);
        RobotRoute robotRoute =new RobotRoute();
        robotRoute.moveRobot(robot, toX,toY);
        System.out.println("Robot got to home successful!");
    }
}
