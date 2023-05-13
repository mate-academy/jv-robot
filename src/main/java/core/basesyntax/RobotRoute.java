package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveToXCoordinate(robot, toX);
        moveToYCoordinate(robot, toY);
    }

    private void moveToXCoordinate(Robot robot, int toX) {
        if (robot.getX() < toX) {
            turnToTargetDirection(robot, Direction.RIGHT);
        } else {
            turnToTargetDirection(robot, Direction.LEFT);
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    private void moveToYCoordinate(Robot robot, int toY) {
        if (robot.getY() < toY) {
            turnToTargetDirection(robot, Direction.UP);
        } else {
            turnToTargetDirection(robot, Direction.DOWN);
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void turnToTargetDirection(Robot robot, Direction target) {
        while (robot.getDirection() != target) {
            robot.turnRight();
        }
    }
}
