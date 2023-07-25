package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() >= toX && robot.getY() >= toY) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
            }

            if (robot.getDirection() == Direction.LEFT) {
                leftCornerMove(robot, toX, toY);
            } else if (robot.getDirection() == Direction.DOWN) {
                rightCornerMove(robot, toY, toX);
            }
        } else if (robot.getX() <= toX && robot.getY() >= toY) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
            }

            if (robot.getDirection() == Direction.RIGHT) {
                rightCornerMove(robot, toX, toY);
            } else if (robot.getDirection() == Direction.DOWN) {
                leftCornerMove(robot, toY, toX);
            }
        } else if (robot.getX() <= toX && robot.getY() <= toY) {
            if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
            }

            if (robot.getDirection() == Direction.RIGHT) {
                leftCornerMove(robot, toX, toY);
            } else if (robot.getDirection() == Direction.UP) {
                rightCornerMove(robot, toY, toX);
            }
        } else {
            if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
            }

            if (robot.getDirection() == Direction.LEFT) {
                rightCornerMove(robot, toX, toY);
            } else if (robot.getDirection() == Direction.UP) {
                leftCornerMove(robot, toY, toX);
            }
        }
    }

    private void axialMove(Robot robot, int point) {
        if (robot.getDirection() == Direction.LEFT || robot.getDirection() == Direction.RIGHT) {
            while (point != robot.getX()) {
                robot.stepForward();
            }
        } else {
            while (point != robot.getY()) {
                robot.stepForward();
            }
        }
    }

    private void leftCornerMove(Robot robot, int pointA, int pointB) {
        axialMove(robot, pointA);
        robot.turnLeft();
        axialMove(robot, pointB);
    }

    private void rightCornerMove(Robot robot, int pointA, int pointB) {
        axialMove(robot, pointA);
        robot.turnRight();
        axialMove(robot, pointB);
    }
}
