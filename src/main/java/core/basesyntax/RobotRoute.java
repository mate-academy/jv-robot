package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        moveInXAxis(robot, toX);
        moveInYAxis(robot, toY);
    }

    private void moveInXAxis(Robot robot, int toX) {
        if (robot.getX() < toX) {
            turnToDirection(robot, Direction.RIGHT);
            moveToPosition(robot, toX, 'X');
        } else if (robot.getX() > toX) {
            turnToDirection(robot, Direction.LEFT);
            moveToPosition(robot, toX, 'X');
        }
    }

    private void moveInYAxis(Robot robot, int toY) {
        if (robot.getY() < toY) {
            turnToDirection(robot, Direction.UP);
            moveToPosition(robot, toY, 'Y');
        } else if (robot.getY() > toY) {
            turnToDirection(robot, Direction.DOWN);
            moveToPosition(robot, toY, 'Y');
        }
    }

    private void turnToDirection(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
    }

    private void moveToPosition(Robot robot, int targetPosition, char axis) {
        while ((axis == 'X' && robot.getX() != targetPosition)
                || (axis == 'Y' && robot.getY() != targetPosition)) {
            robot.stepForward();
        }
    }
}

