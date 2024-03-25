package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        /* while (robot.getX() != toX) {
            if (robot.getX() < toX) {
                if (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                    robot.setDirection(Direction.RIGHT);
                }
                robot.stepForward();
                robot.setX(robot.getX() + 1);
            } else {
                if (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                    robot.setDirection(Direction.LEFT);
                }
                robot.stepForward();
                robot.setX(robot.getX() - 1);
            }
        }
        while (robot.getY() != toY) {
            if (robot.getY() < toY) {
                if (robot.getDirection() != Direction.UP) {
                    robot.turnLeft();
                    robot.turnLeft();
                    robot.setDirection(Direction.UP);
                }
                robot.stepForward();
                robot.setY(robot.getY() + 1);
            } else {
                if (robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();
                    robot.turnRight();
                    robot.setDirection(Direction.DOWN);
                }
                robot.stepForward();
                robot.setY(robot.getY() - 1);
            }
        }
    }*/
        int currentX = robot.getX();
        int currentY = robot.getY();
        Direction horizontalDirection;
        if (toX > currentX) {
            horizontalDirection = Direction.RIGHT;
        } else {
            horizontalDirection = Direction.LEFT;
        }
        Direction verticalDirection;
        if (toY > currentY) {
            verticalDirection = Direction.UP;
        } else {
            verticalDirection = Direction.DOWN;
        }
        while (currentX != toX) {
            if (robot.getDirection() != horizontalDirection) {
                robot.setDirection(horizontalDirection);
            }
            robot.stepForward();
            if (horizontalDirection == Direction.RIGHT) {
                currentX++;
            } else {
                currentX--;
            }
        }
        while (currentY != toY) {
            if (robot.getDirection() != verticalDirection) {
                robot.setDirection(verticalDirection);
            }
            robot.stepForward();
            if (verticalDirection == Direction.UP) {
                currentY++;
            } else {
                currentY--;
            }
        }
    }
}
