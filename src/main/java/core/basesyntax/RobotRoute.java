package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveByX(robot, toX);
        moveByY(robot, toY);
    }

    private static void turn(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnRight();
        }
    }

    private static void moveByX(Robot robot, int toX) {
        if (toX < robot.getX()) {
            turn(robot, Direction.LEFT);
        } else {
            turn(robot, Direction.RIGHT);
        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }
    }

    private static void moveByY (Robot robot, int toY) {
        if (toY < robot.getY()) {
            turn(robot, Direction.DOWN);
        } else {
            turn(robot, Direction.UP);
        }
        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }
}

