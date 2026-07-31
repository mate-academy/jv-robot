package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() != toX) {
            turnRobotByAxisX(robot, toX);
            takeSteps(robot, robot.getX(), toX);
        }
        if (robot.getY() != toY) {
            turnRobotByAxisY(robot, toY);
            takeSteps(robot, robot.getY(), toY);
        }
    }

    private void takeSteps(Robot robot, int current, int target) {
        int movesAmount = Math.abs(target - current);
        for (int i = 0; i < movesAmount; i++) {
            robot.stepForward();
        }
    }

    private void turnRobotByAxisX(Robot robot, int toX) {
        Direction direction = robot.getDirection();
        switch (direction) {
            case UP:
                if (robot.getX() < toX) {
                    robot.turnRight();
                } else if (robot.getX() > toX) {
                    robot.turnLeft();
                }
                break;
            case DOWN:
                if (robot.getX() < toX) {
                    robot.turnLeft();
                } else if (robot.getX() > toX) {
                    robot.turnRight();
                }
                break;
            case LEFT:
                if (robot.getX() < toX) {
                    robot.turnRight();
                    robot.turnRight();
                }
                break;
            case RIGHT:
                if (robot.getX() > toX) {
                    robot.turnRight();
                    robot.turnRight();
                }
                break;
            default:
                break;
        }
    }

    private void turnRobotByAxisY(Robot robot, int toY) {
        Direction direction = robot.getDirection();
        switch (direction) {
            case UP:
                if (robot.getY() > toY) {
                    robot.turnRight();
                    robot.turnRight();
                }
                break;
            case DOWN:
                if (robot.getY() < toY) {
                    robot.turnRight();
                    robot.turnRight();
                }
                break;
            case RIGHT:
                if (robot.getY() < toY) {
                    robot.turnLeft();
                } else if (robot.getY() > toY) {
                    robot.turnRight();
                }
                break;
            case LEFT:
                if (robot.getY() < toY) {
                    robot.turnRight();
                } else if (robot.getY() > toY) {
                    robot.turnLeft();
                }
                break;
            default:
                break;
        }
    }
}
