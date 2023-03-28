package core.basesyntax;

import static core.basesyntax.Direction.DOWN;
import static core.basesyntax.Direction.LEFT;
import static core.basesyntax.Direction.RIGHT;
import static core.basesyntax.Direction.UP;
import static java.lang.Math.abs;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        final int pathByX = toX - robot.getX();
        final int pathByY = toY - robot.getY();
        turnByX(pathByX, robot);
        moveByX(robot, toX, pathByX);

        turnByY(pathByY, robot);
        moveByY(robot, toY, pathByY);
    }

    private static void moveByY(Robot robot, int toY, int pathByY) {
        for (int i = 0; i < abs(pathByY); i++) {
            if (toY != robot.getY()) {
                robot.stepForward();
            }
        }
    }

    private static void moveByX(Robot robot, int toX, int pathByX) {
        for (int i = 0; i < abs(pathByX); i++) {
            if (toX != robot.getX()) {
                robot.stepForward();
            }
        }
    }

    public static void main(String[] args) {
        Robot robot = new Robot(DOWN, 1, 1);
        RobotRoute robotRoute = new RobotRoute();
        robotRoute.moveRobot(robot, 2, 2);
    }

    public void turnByX(int pathByX, Robot robot) {
        if (pathByX > 0) {
            if (robot.getDirection() == LEFT) {
                robot.turnRight();
                robot.turnRight();
            } else if (robot.getDirection() == UP) {
                robot.turnRight();
            } else if (robot.getDirection() == DOWN) {
                robot.turnLeft();
            }
        } else {
            if (robot.getDirection() == RIGHT) {
                robot.turnLeft();
                robot.turnLeft();
            } else if (robot.getDirection() == UP) {
                robot.turnLeft();
            } else if (robot.getDirection() == DOWN) {
                robot.turnRight();
            }
        }
    }

    public void turnByY(int pathByY, Robot robot) {
        if (pathByY > 0) {
            if (robot.getDirection() == DOWN) {
                robot.turnRight();
                robot.turnRight();
            } else if (robot.getDirection() == LEFT) {
                robot.turnRight();
            } else if (robot.getDirection() == RIGHT) {
                robot.turnLeft();
            }
        } else {
            if (robot.getDirection() == UP) {
                robot.turnLeft();
                robot.turnLeft();
            } else if (robot.getDirection() == LEFT) {
                robot.turnLeft();
            } else if (robot.getDirection() == RIGHT) {
                robot.turnRight();
            }
        }
    }
}
