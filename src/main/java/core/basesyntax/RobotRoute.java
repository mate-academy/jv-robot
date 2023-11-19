package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        turnToDirection(robot, directionForMovingToX(robot, toX));
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        turnToDirection(robot, directionForMovingToY(robot, toY));
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private Direction directionForMovingToX(Robot robot, int toX) {
        if (robot.getX() < toX) {
            return Direction.RIGHT;
        } else {
            return Direction.LEFT;
        }
    }

    private Direction directionForMovingToY(Robot robot, int toY) {
        if (robot.getY() < toY) {
            return Direction.UP;
        } else {
            return Direction.DOWN;
        }
    }

    private void turnToDirection(Robot robot, Direction direction) {
        if (robot.getDirection() != direction) {
            if (direction == Direction.UP || direction == Direction.RIGHT && robot.getDirection()
                    == Direction.LEFT || robot.getDirection() == Direction.UP) {
                while (robot.getDirection() != direction) {
                    robot.turnRight();
                }
            } else {
                while (robot.getDirection() != direction) {
                    robot.turnLeft();
                }
            }
        }
    }
}
