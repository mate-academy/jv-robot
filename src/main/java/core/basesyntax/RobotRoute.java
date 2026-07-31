package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int x = toX - robot.getX();

        if (x > 0) {
            turnTo(robot, Direction.RIGHT);
            moveByX(robot, toX);
        } else if (x < 0) {
            turnTo(robot, Direction.LEFT);
            moveByX(robot, toX);
        }

        int y = toY - robot.getY();

        if (y > 0) {
            turnTo(robot, Direction.UP);
            moveByY(robot, toY);
        } else if (y < 0) {
            turnTo(robot, Direction.DOWN);
            moveByY(robot, toY);
        }
    }

    private static void moveByX(Robot robot, int toX) {
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    private static void moveByY(Robot robot, int toY) {
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private static void turnTo(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
    }
}
