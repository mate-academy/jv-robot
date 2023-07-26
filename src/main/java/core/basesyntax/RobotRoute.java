package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        directionX(robot, toX);
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        directionY(robot,toY);
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void directionX(Robot robot, int toX) {
        if (robot.getX() > toX) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
            }
        }
        if (robot.getX() < toX) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
                robot.turnRight();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
            }
        }
    }

    private void directionY(Robot robot, int toY) {
        if (robot.getY() > toY) {
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
                robot.turnRight();
            } else if (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
            }
        }
        if (robot.getY() < toY) {
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
            }
        }
    }
}

