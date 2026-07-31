package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveHorizontally(robot, toX);
        moveVertically(robot, toY);
    }

    private void moveHorizontally(Robot robot, int toX) {
        if (robot.getX() > toX) {
            turnIfFacingDirection(robot, Direction.RIGHT, Direction.UP, Direction.DOWN);
        } else if (robot.getX() < toX) {
            turnIfFacingDirection(robot, Direction.LEFT, Direction.UP, Direction.DOWN);
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    private void moveVertically(Robot robot, int toY) {
        if (robot.getY() > toY) {
            turnIfFacingDirection(robot, Direction.UP, Direction.RIGHT, Direction.LEFT);
        } else if (robot.getY() < toY) {
            turnIfFacingDirection(robot, Direction.DOWN, Direction.RIGHT, Direction.LEFT);
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void turnIfFacingDirection(Robot robot, Direction direction,
                                       Direction leftDirection, Direction rightDirection) {
        if (robot.getDirection() == direction) {
            robot.turnRight();
            robot.turnRight();
        } else if (robot.getDirection() == leftDirection) {
            robot.turnLeft();
        } else if (robot.getDirection() == rightDirection) {
            robot.turnRight();
        }
    }
}


