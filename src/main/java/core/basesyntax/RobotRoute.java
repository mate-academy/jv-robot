package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        if (robot.getX() < toX) {
            turnToDirection(robot, Direction.RIGHT);

            while (robot.getX() < toX) {
                robot.stepForward();
            }
        } else if (robot.getX() > toX) {
            turnToDirection(robot, Direction.LEFT);

            while (robot.getX() > toX) {
                robot.stepForward();
            }
        }

        if (robot.getY() < toY) {
            turnToDirection(robot, Direction.UP);

            while (robot.getY() < toY) {
                robot.stepForward();
            }
        } else if (robot.getY() > toY) {
            turnToDirection(robot, Direction.DOWN);

            while (robot.getY() > toY) {
                robot.stepForward();
            }
        }

    }

    private void turnToDirection(Robot robot, Direction requiredDirection) {
        if (robot.getDirection() == requiredDirection) {
            return;
        }

        if ((robot.getDirection() == Direction.UP
                && requiredDirection == Direction.LEFT)
                || (robot.getDirection() == Direction.LEFT
                && requiredDirection == Direction.DOWN)
                || (robot.getDirection() == Direction.DOWN
                && requiredDirection == Direction.RIGHT)
                || (robot.getDirection() == Direction.RIGHT
                && requiredDirection == Direction.UP)) {
            robot.turnLeft();
        } else {
            while (robot.getDirection() != requiredDirection) {
                robot.turnRight();
            }
        }
    }
}

