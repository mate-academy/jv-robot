package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() >= toX && robot.getY() >= toY) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                    robot.turnLeft();

                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    break;
                case DOWN:
                    robot.turnRight();
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                    robot.turnLeft();
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    break;
                case LEFT:
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                    robot.turnLeft();
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    break;
                default:
                    robot.turnLeft();
                    robot.turnLeft();
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                    robot.turnLeft();
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    break;

            }
        }
        if (robot.getX() <= toX && robot.getY() <= toY) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnRight();
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                    robot.turnRight();
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    break;
                case DOWN:
                    robot.turnLeft();
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                    robot.turnRight();
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    break;
                case LEFT:
                    robot.turnRight();
                    robot.turnRight();
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                    robot.turnRight();
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    break;
                default:
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                    robot.turnRight();
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    break;
            }
        }
        if (robot.getX() >= toX && robot.getY() <= toY) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                    robot.turnRight();
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    break;
                case DOWN:
                    robot.turnRight();
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                    robot.turnRight();
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    break;
                case RIGHT:
                    robot.turnLeft();
                    robot.turnLeft();
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                    robot.turnRight();
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    break;
                default:
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                    robot.turnRight();
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    break;
            }
        }
        if (robot.getX() <= toX && robot.getY() >= toY) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnRight();
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                    robot.turnRight();
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    break;
                case DOWN:
                    robot.turnLeft();
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                    robot.turnRight();
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    break;
                case LEFT:
                    robot.turnRight();
                    robot.turnRight();
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                    robot.turnRight();
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    break;
                default:
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                    robot.turnRight();
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    break;
            }
        }
    }
}
