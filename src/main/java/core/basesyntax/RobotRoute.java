package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getDirection() == Direction.UP
                || robot.getDirection() == Direction.RIGHT
                || robot.getDirection() == Direction.LEFT
                && toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }
        if (toY < robot.getY()) {
            robot.turnLeft();
        } else {
            robot.turnRight();
        }
        while (toY != robot.getY()) {
            robot.stepForward();
        }
        if (robot.getDirection() == Direction.DOWN && toX < robot.getX()) {
            robot.turnRight();
        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }
        if (toY < robot.getY()) {
            robot.turnLeft();
        } else {
            robot.turnRight();
        }
        while (toY != robot.getY()) {
            robot.stepForward();
        }
        if (robot.getDirection() == Direction.UP
                || robot.getDirection() == Direction.RIGHT
                || robot.getDirection() == Direction.LEFT
                && toX > robot.getX()) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }
        if (toY < robot.getY()) {
            robot.turnRight();
        } else {
            robot.turnLeft();
        }
        while (toY != robot.getY()) {
            robot.stepForward();
        }
        if (robot.getDirection() == Direction.DOWN && toX > robot.getX()) {
            robot.turnLeft();
        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }
        if (toY < robot.getY()) {
            robot.turnRight();
        } else {
            robot.turnLeft();
        }
        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }
}
