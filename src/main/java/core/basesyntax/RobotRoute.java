package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        if (robot.getX() < toX) {
            if (robot.getDirection() == Direction.RIGHT) {
                for (int i = robot.getX(); i < toX; i++) {
                    robot.stepForward();
                }
            } else if (robot.getDirection() != Direction.RIGHT) {
                for (int i = 0; i < 6; i++) {
                    robot.turnRight();
                    if (robot.getDirection() == Direction.RIGHT) {
                        break;
                    }
                }
                for (int i = robot.getX(); i < toX; i++) {
                    robot.stepForward();
                }
            }
        }

        if (robot.getX() > toX) {
            if (robot.getDirection() == Direction.LEFT) {
                for (int i = robot.getX(); i > toX; i--) {
                    robot.stepForward();
                }
            } else if (robot.getDirection() != Direction.LEFT) {
                for (int i = 0; i < 6; i++) {
                    robot.turnRight();
                    if (robot.getDirection() == Direction.LEFT) {
                        break;
                    }
                }
                for (int i = robot.getX(); i > toX; i--) {
                    robot.stepForward();
                }
            }
        }

        if (robot.getY() < toY) {
            if (robot.getDirection() == Direction.UP) {
                for (int i = robot.getY(); i < toY; i++) {
                    robot.stepForward();
                }
            } else if (robot.getDirection() != Direction.UP) {
                for (int i = 0; i < 6; i++) {
                    robot.turnRight();
                    if (robot.getDirection() == Direction.UP) {
                        break;
                    }
                }
                for (int i = robot.getY(); i < toY; i++) {
                    robot.stepForward();
                }
            }
        }

        if (robot.getY() > toY) {
            if (robot.getDirection() == Direction.DOWN) {
                for (int i = robot.getY(); i > toY; i--) {
                    robot.stepForward();
                }
            } else if (robot.getDirection() != Direction.DOWN) {
                for (int i = 0; i < 6; i++) {
                    robot.turnRight();
                    if (robot.getDirection() == Direction.DOWN) {
                        break;
                    }
                }
                for (int i = robot.getY(); i > toY; i--) {
                    robot.stepForward();
                }
            }
        }
    }
}

