package core.basesyntax;

import java.util.Random;

public class RobotRoute {
    public static void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX || robot.getY() != toY) {
            if (robot.getX() < toX) {
                moveToTarget(robot, Direction.RIGHT, toX, toY);
            } else if (robot.getX() > toX) {
                moveToTarget(robot, Direction.LEFT, toX, toY);
            }

            if (robot.getY() < toY) {
                moveToTarget(robot, Direction.UP, toX, toY);
            } else if (robot.getY() > toY) {
                moveToTarget(robot, Direction.DOWN, toX, toY);
            }
        }
    }

    private static void moveToTarget(Robot robot, Direction targetDirection, int toX, int toY) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
        robot.stepForward();
        printRobotState(robot);
    }

    private static void printRobotState(Robot robot) {
        System.out.println("Current Position: (" + robot.getX() + ", " + robot.getY()
                + "), Direction: "
                + robot.getDirection());
    }

    public static void main(String[] args) {
        Direction initialDirection = Direction.values()[new Random().nextInt(Direction.values()
                .length)];
        Robot robot = new Robot(initialDirection, 0, 0);

        System.out.println("Initial Position: (" + robot.getX() + ", "
                + robot.getY() + "), Direction: " + robot.getDirection());
        moveRobot(robot, 3, 4);
        System.out.println("Final Position: (" + robot.getX() + ", " + robot.getY()
                + "), Direction: " + robot.getDirection());
    }
}
