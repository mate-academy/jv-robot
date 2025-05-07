package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction requiredDirection;

        requiredDirection = (robot.getX() < toX) ? Direction.RIGHT : Direction.LEFT;
        changeXDirection(robot, requiredDirection);
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        requiredDirection = (robot.getY() < toY) ? Direction.UP : Direction.DOWN;
        changeYDirection(robot, requiredDirection);
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private static void changeXDirection(Robot robot, Direction requiredDirection) {
        if (requiredDirection == Direction.LEFT) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
                robot.turnRight();
            }
        } else if (requiredDirection == Direction.RIGHT) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
                robot.turnLeft();
            }
        }
    }

    private static void changeYDirection(Robot robot, Direction requiredDirection) {
        if (requiredDirection == Direction.UP) {
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
                robot.turnRight();
            }
        } else if (requiredDirection == Direction.DOWN) {
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
                robot.turnLeft();
            }
        }
    }
}
