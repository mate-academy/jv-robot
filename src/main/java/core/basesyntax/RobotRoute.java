package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() == toX && robot.getY() == toY) {
            return;
        }

        rotateRobot(robot, findHorizontalDirection(robot, toX));
        moveForward(robot, robot.getX(), toX);

        rotateRobot(robot, findVerticalDirection(robot, toY));
        moveForward(robot, robot.getY(), toY);
    }

    private Direction findHorizontalDirection(Robot robot, int targetX) {
        if (robot.getX() < targetX) {
            return Direction.RIGHT;
        } else {
            return Direction.LEFT;
        }
    }

    private Direction findVerticalDirection(Robot robot, int targetY) {
        if (robot.getY() < targetY) {
            return Direction.UP;
        } else {
            return Direction.DOWN;
        }
    }

    private void rotateRobot(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnLeft();
        }
    }

    private void moveForward(Robot robot, int currentPosition, int targetPosition) {
        while (currentPosition != targetPosition) {
            robot.stepForward();
        }
    }
}
