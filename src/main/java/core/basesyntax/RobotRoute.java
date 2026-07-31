package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toY > robot.getY()) {
            moveUp(robot, toY);
        } else if (toY < robot.getY()) {
            moveDown(robot, toY);
        }
        if (toX > robot.getX()) {
            moveRight(robot, toX);
        } else if (toX < robot.getX()) {
            moveLeft(robot, toX);
        }
    }

    private void moveUp(Robot robot, int toY) {
        while (toY > robot.getY()) {
            while (robot.getDirection() != Direction.UP) {
                if (robot.getDirection() == Direction.RIGHT) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
            }
            robot.stepForward();
        }
    }

    private void moveDown(Robot robot, int toY) {
        while (toY < robot.getY()) {
            while (robot.getDirection() != Direction.DOWN) {
                if (robot.getDirection() == Direction.LEFT) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
            }
            robot.stepForward();
        }
    }

    private void moveRight(Robot robot, int toX) {
        while (toX > robot.getX()) {
            while (robot.getDirection() != Direction.RIGHT) {
                if (robot.getDirection() == Direction.DOWN) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
            }
            robot.stepForward();
        }
    }

    private void moveLeft(Robot robot, int toX) {
        while (toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                if (robot.getDirection() == Direction.UP) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
            }
            robot.stepForward();
        }
    }
}
