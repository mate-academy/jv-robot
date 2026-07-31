package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveRobotToTheVerticalPoint(robot, toY);
        moveRobotToTheHorizontalPoint(robot, toX);
    }

    private void moveRobotToTheVerticalPoint(Robot robot, int toY) {
        if (robot.getY() == toY) {
            return;
        }

        int verticalDistanceToTheTarget = robot.getY() - toY;
        if (verticalDistanceToTheTarget < 0) {
            turnRobotToTheDirection(robot, Direction.UP);
            verticalDistanceToTheTarget *= -1;
        } else {
            turnRobotToTheDirection(robot, Direction.DOWN);
        }

        stepForwardToTheTarget(robot, verticalDistanceToTheTarget);
    }

    private void moveRobotToTheHorizontalPoint(Robot robot, int toX) {
        if (robot.getX() == toX) {
            return;
        }

        int horizontalDistanceToTheTarget = robot.getX() - toX;
        if (horizontalDistanceToTheTarget < 0) {
            turnRobotToTheDirection(robot, Direction.RIGHT);
            horizontalDistanceToTheTarget *= -1;
        } else {
            turnRobotToTheDirection(robot, Direction.LEFT);
        }

        stepForwardToTheTarget(robot, horizontalDistanceToTheTarget);
    }

    private void turnRobotToTheDirection(Robot robot, Direction neededDirection) {
        while (robot.getDirection() != neededDirection) {
            robot.turnRight();
        }
    }

    private void stepForwardToTheTarget(Robot robot, int stepsQuantity) {
        while (stepsQuantity > 0) {
            robot.stepForward();
            stepsQuantity--;
        }
    }
}
