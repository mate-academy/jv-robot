package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        if (robot.getX() < toX) {
            moveRight(robot, toX);
        } else if (robot.getX() > toX) {
            moveLeft(robot, toX);
        }
        if (robot.getY() < toY) {
            moveUP(robot, toY);
        } else if (robot.getY() > toY) {
            moveDown(robot, toY);
        }
    }

    private void moveRight(Robot robot, int toX) {
        while (robot.getX() < toX) {
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
        while (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                if (robot.getDirection() == Direction.DOWN) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
            }

            robot.stepForward();
        }
    }

    private void moveDown(Robot robot, int toY) {
        while (robot.getY() > toY) {
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

    private void moveUP(Robot robot, int toY) {
        while (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                if (robot.getDirection() == Direction.LEFT) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
            }

            robot.stepForward();
        }
    }
}
