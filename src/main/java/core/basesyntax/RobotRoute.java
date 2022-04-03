package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        if (robot.getX() != toX) {
            if (robot.getX() > toX) {
                if (robot.getDirection() != Direction.LEFT) {
                    absoluteTurnLeft(robot);
                }
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            }
            if (robot.getX() < toX) {
                if (robot.getDirection() != Direction.RIGHT) {
                    absoluteTurnRight(robot);
                }
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            }
        }
        if (robot.getY() != toY) {
            if (robot.getY() > toY) {
                if (robot.getDirection() != Direction.DOWN) {
                    absoluteTurnDown(robot);
                }
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
            if (robot.getY() < toY) {
                if (robot.getDirection() != Direction.UP) {
                    absoluteTurnUp(robot);
                }
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        }
    }

    private void absoluteTurnLeft(Robot robot) {
        if (robot.getDirection() == Direction.UP) {
            robot.turnLeft();
        }
        if (robot.getDirection() == Direction.DOWN) {
            robot.turnRight();
        }
        if (robot.getDirection() == Direction.RIGHT) {
            robot.turnRight();
            robot.turnRight();
        }
    }

    private void absoluteTurnRight(Robot robot) {
        if (robot.getDirection() == Direction.UP) {
            robot.turnRight();
        }
        if (robot.getDirection() == Direction.DOWN) {
            robot.turnLeft();
        }
        if (robot.getDirection() == Direction.LEFT) {
            robot.turnRight();
            robot.turnRight();
        }
    }

    private void absoluteTurnUp(Robot robot) {
        if (robot.getDirection() == Direction.LEFT) {
            robot.turnRight();
        }
        if (robot.getDirection() == Direction.RIGHT) {
            robot.turnLeft();
        }
        if (robot.getDirection() == Direction.DOWN) {
            robot.turnRight();
            robot.turnRight();
        }
    }

    private void absoluteTurnDown(Robot robot) {
        if (robot.getDirection() == Direction.LEFT) {
            robot.turnLeft();
        }
        if (robot.getDirection() == Direction.RIGHT) {
            robot.turnRight();
        }
        if (robot.getDirection() == Direction.UP) {
            robot.turnRight();
            robot.turnRight();
        }
    }
}
