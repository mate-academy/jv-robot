package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getY() < toY) {
            goUpY(robot, toX, toY);
        }

        if (robot.getY() > toY) {
            goDownY(robot, toX, toY);
        }

        if (robot.getX() < toX) {
            goUpX(robot, toX, toY);
        }

        if (robot.getX() > toX) {
            goDownX(robot, toX, toY);
        }
    }

    private void goUpY(Robot robot, int toX, int toY) {
        if (robot.getDirection() == Direction.UP) {
            robot.stepForward();
            moveRobot(robot, toX, toY);
        }

        if (robot.getY() == toY && robot.getDirection() == Direction.UP) {
            robot.turnRight();
        }

        if (robot.getX() < toX && robot.getDirection() == Direction.RIGHT) {
            robot.stepForward();
            moveRobot(robot, toX, toY);
        }

        if (robot.getY() < toY && robot.getDirection() == Direction.RIGHT) {
            robot.turnLeft();
            moveRobot(robot, toX, toY);
        }

        if (robot.getY() < toY && robot.getDirection() == Direction.LEFT) {
            robot.turnRight();
            moveRobot(robot, toX, toY);
        }

        if (robot.getY() < toY && robot.getDirection() == Direction.DOWN) {
            robot.turnRight();
            robot.turnRight();
            moveRobot(robot, toX, toY);
        }
    }

    private void goDownY(Robot robot, int toX, int toY) {
        if (robot.getDirection() == Direction.DOWN) {
            robot.stepForward();
            moveRobot(robot, toX, toY);
        }

        if (robot.getY() == toY && robot.getDirection() == Direction.DOWN) {
            robot.turnRight();
        }

        if (robot.getX() > toX && robot.getDirection() == Direction.LEFT) {
            robot.stepForward();
            moveRobot(robot, toX, toY);
        }

        if (robot.getY() > toY && robot.getDirection() == Direction.LEFT) {
            robot.turnLeft();
            moveRobot(robot, toX, toY);
        }

        if (robot.getY() > toY && robot.getDirection() == Direction.RIGHT) {
            robot.turnRight();
            moveRobot(robot, toX, toY);
        }

        if (robot.getY() > toY && robot.getDirection() == Direction.UP) {
            robot.turnRight();
            robot.turnRight();
            moveRobot(robot, toX, toY);
        }
    }

    private void goUpX(Robot robot, int toX, int toY) {
        if (robot.getDirection() == Direction.RIGHT) {
            robot.stepForward();
            moveRobot(robot, toX, toY);
        }

        if (robot.getX() == toX && robot.getDirection() == Direction.RIGHT) {
            robot.turnRight();
        }

        if (robot.getY() < toY && robot.getDirection() == Direction.DOWN) {
            robot.stepForward();
        }

        if (robot.getX() < toX && robot.getDirection() == Direction.UP) {
            robot.turnRight();
            moveRobot(robot, toX, toY);
        }

        if (robot.getX() < toX && robot.getDirection() == Direction.DOWN) {
            robot.turnLeft();
            moveRobot(robot, toX, toY);
        }

        if (robot.getX() < toX && robot.getDirection() == Direction.LEFT) {
            robot.turnRight();
            robot.turnRight();
            moveRobot(robot, toX, toY);
        }
    }

    private void goDownX(Robot robot, int toX, int toY) {
        if (robot.getDirection() == Direction.LEFT) {
            robot.stepForward();
            moveRobot(robot, toX, toY);
        }

        if (robot.getX() == toX && robot.getDirection() == Direction.LEFT) {
            robot.turnRight();
        }

        if (robot.getY() > toY && robot.getDirection() == Direction.UP) {
            robot.stepForward();
        }

        if (robot.getX() > toX && robot.getDirection() == Direction.DOWN) {
            robot.turnRight();
            moveRobot(robot, toX, toY);
        }

        if (robot.getX() > toX && robot.getDirection() == Direction.UP) {
            robot.turnLeft();
            moveRobot(robot, toX, toY);
        }

        if (robot.getX() > toX && robot.getDirection() == Direction.RIGHT) {
            robot.turnLeft();
            robot.turnLeft();
            moveRobot(robot, toX, toY);
        }
    }
}
