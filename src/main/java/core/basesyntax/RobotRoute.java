package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            if (robot.getDirection() != Direction.LEFT) {
                goXLeft(robot);
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        } else if (robot.getX() > toX) {
            if (robot.getDirection() != Direction.RIGHT) {
                goXRight(robot);
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }
        if (robot.getY() < toY) {
            if (robot.getDirection() != Direction.UP) {
                goYUp(robot);
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        } else if (robot.getY() > toY) {
            if (robot.getDirection() != Direction.DOWN) {
                goYDown(robot);
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }

    private void goXLeft(Robot robot) {
        if (robot.getDirection() == Direction.UP) {
            robot.turnLeft();
        } else if (robot.getDirection() == Direction.RIGHT) {
            robot.turnLeft();
            robot.turnLeft();
        } else if (robot.getDirection() == Direction.DOWN) {
            robot.turnRight();
        }
    }

    private void goXRight(Robot robot) {
        if (robot.getDirection() == Direction.UP) {
            robot.turnRight();
        } else if (robot.getDirection() == Direction.DOWN) {
            robot.turnLeft();
        } else if (robot.getDirection() == Direction.LEFT) {
            robot.turnLeft();
            robot.turnLeft();
        }
    }

    private void goYUp(Robot robot) {
        if (robot.getDirection() == Direction.LEFT) {
            robot.turnRight();
        } else if (robot.getDirection() == Direction.RIGHT) {
            robot.turnLeft();
        } else if (robot.getDirection() == Direction.DOWN) {
            robot.turnLeft();
            robot.turnLeft();
        }
    }

    private void goYDown(Robot robot) {
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
