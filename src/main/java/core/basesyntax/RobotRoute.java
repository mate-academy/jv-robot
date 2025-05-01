package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        if (robot.getY() < toY) {
            switch (robot.getDirection()) {
                case UP:
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    break;
                case RIGHT:
                    robot.turnLeft();
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    break;
                case LEFT:
                    robot.turnRight();
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    break;
                case DOWN:
                    robot.turnRight();
                    robot.turnRight();
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    break;
                default:
                    break;
            }
        }

        if (robot.getY() > toY) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnRight();
                    robot.turnRight();
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    break;
                case RIGHT:
                    robot.turnRight();
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    break;
                case LEFT:
                    robot.turnLeft();
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    break;
                case DOWN:
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    break;
                default:
                    break;
            }
        }

        if (robot.getX() < toX && robot.getY() == toY) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnRight();
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                    break;
                case RIGHT:
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                    break;
                case LEFT:
                    robot.turnLeft();
                    robot.turnLeft();
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                    break;
                case DOWN:
                    robot.turnLeft();
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                    break;
                default:
                    break;
            }
        }

        if (robot.getX() > toX && robot.getY() == toY) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                    break;
                case RIGHT:
                    robot.turnLeft();
                    robot.turnLeft();
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                    break;
                case LEFT:
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                    break;
                case DOWN:
                    robot.turnRight();
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
