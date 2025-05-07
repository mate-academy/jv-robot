package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            moveByAxisX(robot, toX);
        }
        while (robot.getY() != toY) {
            moveByAxisY(robot, toY);
        }
    }

    private void moveByAxisY(Robot robot, int toY) {
        if (toY > robot.getY()) {
            moveUpByAxisY(robot);
        } else {
            moveDownByAxisY(robot);
        }
    }

    private void moveByAxisX(Robot robot, int toX) {
        if (toX > robot.getX()) {
            moveRightByAxisX(robot);
        } else {
            moveLeftByAxisX(robot);
        }
    }

    private void moveDownByAxisY(Robot robot) {
        if (robot.getDirection() == Direction.DOWN) {
            robot.stepForward();
        } else if (robot.getDirection() == Direction.LEFT) {
            robot.turnLeft();
            robot.stepForward();
        } else if (robot.getDirection() == Direction.RIGHT) {
            robot.turnRight();
            robot.stepForward();
        } else if (robot.getDirection() == Direction.UP) {
            robot.turnRight();
            robot.turnRight();
            robot.stepForward();
        }
    }

    private void moveUpByAxisY(Robot robot) {
        if (robot.getDirection() == Direction.UP) {
            robot.stepForward();
        } else if (robot.getDirection() == Direction.DOWN) {
            robot.turnLeft();
            robot.turnLeft();
            robot.stepForward();
        } else if (robot.getDirection() == Direction.LEFT) {
            robot.turnRight();
            robot.stepForward();
        } else if (robot.getDirection() == Direction.RIGHT) {
            robot.turnLeft();
            robot.stepForward();
        }
    }

    private void moveLeftByAxisX(Robot robot) {
        if (robot.getDirection() == Direction.LEFT) {
            robot.stepForward();
        } else if (robot.getDirection() == Direction.DOWN) {
            robot.turnRight();
            robot.stepForward();
        } else if (robot.getDirection() == Direction.UP) {
            robot.turnLeft();
            robot.stepForward();
        } else if (robot.getDirection() == Direction.RIGHT) {
            robot.turnLeft();
            robot.turnLeft();
            robot.stepForward();
        }
    }

    private void moveRightByAxisX(Robot robot) {
        if (robot.getDirection() == Direction.RIGHT) {
            robot.stepForward();
        } else if (robot.getDirection() == Direction.DOWN) {
            robot.turnLeft();
            robot.stepForward();
        } else if (robot.getDirection() == Direction.UP) {
            robot.turnRight();
            robot.stepForward();
        } else if (robot.getDirection() == Direction.LEFT) {
            robot.turnLeft();
            robot.turnLeft();
            robot.stepForward();
        }
    }
}
