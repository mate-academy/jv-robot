package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() == toX && robot.getY() == toY) {
            System.out.println("Robot stays on the same place");
        }
        if (toX > 0) {
            if (robot.getDirection() == Direction.RIGHT) {
                moveRobotByAxis(robot, robot.getX(), toX);
            } else if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
                robot.turnLeft();
                moveRobotByAxis(robot, robot.getX(), toX);
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
                moveRobotByAxis(robot, robot.getX(), toX);
            } else {
                robot.turnRight();
                moveRobotByAxis(robot, robot.getX(), toX);
            }
        }
        if (toX < 0) {
            if (robot.getDirection() == Direction.LEFT && robot.getX() > toX) {
                moveRobotByAxis(robot, robot.getX(), toX);
            }
            if (robot.getDirection() == Direction.LEFT && robot.getX() < toX) {
                robot.turnLeft();
                robot.turnLeft();
                moveRobotByAxis(robot, robot.getX(), toX);
            } else if (robot.getDirection() == Direction.RIGHT && robot.getX() > toX) {
                robot.turnRight();
                robot.turnRight();
                moveRobotByAxis(robot, robot.getX(), toX);
            } else if (robot.getDirection() == Direction.RIGHT && robot.getX() < toX) {
                moveRobotByAxis(robot, robot.getX(), toX);
            } else if (robot.getDirection() == Direction.DOWN && robot.getX() > toX) {
                robot.turnRight();
                moveRobotByAxis(robot, robot.getX(), toX);
            } else if (robot.getDirection() == Direction.DOWN && robot.getX() < toX) {
                robot.turnLeft();
                moveRobotByAxis(robot, robot.getX(), toX);
            } else if (robot.getDirection() == Direction.UP && robot.getX() > toX) {
                robot.turnLeft();
                moveRobotByAxis(robot, robot.getX(), toX);
            } else if (robot.getDirection() == Direction.UP && robot.getX() < toX) {
                robot.turnRight();
                moveRobotByAxis(robot, robot.getX(), toX);
            }
        }
        if (toY < 0) {
            if (robot.getDirection() == Direction.UP && robot.getY() < toY) {
                moveRobotByAxis(robot, robot.getY(), toY);
            } else if (robot.getDirection() == Direction.UP && robot.getY() > 0) {
                robot.turnRight();
                robot.turnRight();
                moveRobotByAxis(robot, robot.getY(), toY);
            } else if (robot.getDirection() == Direction.LEFT && robot.getY() < toY) {
                robot.turnRight();
                moveRobotByAxis(robot, robot.getY(), toY);
            } else if (robot.getDirection() == Direction.LEFT && robot.getY() > toY) {
                robot.turnLeft();
                moveRobotByAxis(robot, robot.getY(), toY);
            } else if (robot.getDirection() == Direction.DOWN && robot.getY() > toY) {
                moveRobotByAxis(robot, robot.getY(), toY);
            } else if (robot.getDirection() == Direction.DOWN && robot.getY() < toY) {
                robot.turnLeft();
                robot.turnLeft();
                moveRobotByAxis(robot, robot.getY(), toY);
            } else if (robot.getDirection() == Direction.RIGHT && robot.getY() > toY) {
                robot.turnRight();
                moveRobotByAxis(robot, robot.getY(), toY);
            } else {
                robot.turnLeft();
                moveRobotByAxis(robot, robot.getY(), toY);
            }
        }
        if (toY > 0) {
            if (robot.getDirection() == Direction.UP && robot.getY() < toY) {
                moveRobotByAxis(robot, robot.getY(), toY);
            } else if (robot.getDirection() == Direction.UP && robot.getY() > toY) {
                robot.turnLeft();
                robot.turnLeft();
                moveRobotByAxis(robot, robot.getY(), toY);
            } else if (robot.getDirection() == Direction.RIGHT && robot.getY() < toY) {
                robot.turnLeft();
                moveRobotByAxis(robot, robot.getY(), toY);
            } else if (robot.getDirection() == Direction.RIGHT && robot.getY() > toY) {
                robot.turnRight();
                moveRobotByAxis(robot, robot.getY(), toY);
            } else if (robot.getDirection() == Direction.DOWN && robot.getY() < toY) {
                robot.turnLeft();
                robot.turnLeft();
                moveRobotByAxis(robot, robot.getY(), toY);
            } else if (robot.getDirection() == Direction.DOWN && robot.getY() > toY) {
                moveRobotByAxis(robot, robot.getY(), toY);
            } else if (robot.getDirection() == Direction.LEFT && robot.getY() < toY) {
                robot.turnRight();
                moveRobotByAxis(robot, robot.getY(), toY);
            } else if (robot.getDirection() == Direction.LEFT && robot.getY() > toY) {
                robot.turnLeft();
                moveRobotByAxis(robot, robot.getY(), toY);
            }
        }
    }

    private void moveRobotByAxis(Robot robot, int coordinate, int coordinateTo) {
        if (coordinate > coordinateTo) {
            for (int i = coordinate; i > coordinateTo; i--) {
                robot.stepForward();
            }
        } else {
            for (int i = coordinate; i < coordinateTo; i++) {
                robot.stepForward();
            }
        }
    }
}
