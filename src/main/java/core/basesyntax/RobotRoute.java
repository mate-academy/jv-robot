package core.basesyntax;

public class RobotRoute {
    private Robot robot;
    private int toX;
    private int toY;

    public void moveRobot(Robot robot, int toX, int toY) {
        this.robot = robot;
        this.toX = toX;
        this.toY = toY;

        if (checkFinished()) {
            return;
        }

        moveHorizontally();
        moveVertically();
    }

    private boolean checkFinished() {
        return robot.getX() == toX && robot.getY() == toY;
    }

    private Direction determineHorizontalDirection() {
        if (robot.getX() > toX) {
            return Direction.LEFT;
        } else {
            return Direction.RIGHT;
        }
    }

    private Direction determineVerticalDirection() {
        if (robot.getY() > toY) {
            return Direction.DOWN;
        } else {
            return Direction.UP;
        }
    }

    private void moveHorizontally() {
        Direction horizontalDirection = determineHorizontalDirection();
        setRobotDirection(horizontalDirection);

        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    private void moveVertically() {
        Direction verticalDirection = determineVerticalDirection();
        setRobotDirection(verticalDirection);

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void setRobotDirection(Direction direction) {
        while (!direction.equals(robot.getDirection())) {
            robot.turnLeft();
        }
    }
}
