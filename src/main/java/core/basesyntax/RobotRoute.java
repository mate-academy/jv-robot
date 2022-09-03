package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int stepsCount;
        if (robot.getX() != toX) {
            switch (robot.getDirection()) {
                case UP: {
                    if (robot.getX() < toX) {
                        robot.turnRight();
                    } else {
                        robot.turnLeft();
                    }
                    break;
                }
                case DOWN: {
                    if (robot.getX() > toX) {
                        robot.turnRight();
                    } else {
                        robot.turnLeft();
                    }
                    break;
                }
                case LEFT: {
                    if (robot.getX() < toX) {
                        robot.turnRight();
                        robot.turnRight();
                    }
                    break;
                }
                case RIGHT: {
                    if (robot.getX() > toX) {
                        robot.turnLeft();
                        robot.turnLeft();
                    }
                    break;
                }
                default: {
                    break;
                }
            }
            stepsCount = Math.abs(robot.getX() - toX);
            for (int i = 0; i < stepsCount; i++) {
                robot.stepForward();
            }
        }
        if (robot.getY() != toY) {
            switch (robot.getDirection()) {
                case LEFT: {
                    if (robot.getY() < toY) {
                        robot.turnRight();
                    } else {
                        robot.turnLeft();
                    }
                    break;
                }
                case RIGHT: {
                    if (robot.getY() > toY) {
                        robot.turnRight();
                    } else {
                        robot.turnLeft();
                    }
                    break;
                }
                default: {
                    break;
                }
            }
            stepsCount = Math.abs(robot.getY() - toY);
            for (int i = 0; i < stepsCount; i++) {
                robot.stepForward();
            }
        }
    }
}
