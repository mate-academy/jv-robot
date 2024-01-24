package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() == toX && robot.getY() == toY) {
            return;
        }

        rotateRobot(robot, findHorizontalDirection(robot, toX));
        while (robot.getX() != toX) {
            robot.stepForward();
        }

        rotateRobot(robot, findVerticalDirection(robot, toY));
        while (robot.getY() != toY) {
            robot.stepForward();
        }
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

}
