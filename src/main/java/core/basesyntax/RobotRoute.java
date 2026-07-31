package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX || robot.getY() != toY) {
            switch (robot.getDirection()) {
                case UP:
                    if (robot.getY() < toY) {
                        while (robot.getY() != toY) {
                            robot.stepForward();
                        }
                    } else {
                        robot.turnRight();
                    }
                    break;
                case DOWN:
                    if (robot.getY() > toY) {
                        while (robot.getY() != toY) {
                            robot.stepForward();
                        }
                    } else {
                        robot.turnRight();
                    }
                    break;
                case RIGHT:
                    if (robot.getX() < toX) {
                        while (robot.getX() != toX) {
                            robot.stepForward();
                        }
                    } else {
                        robot.turnRight();
                    }
                    break;
                case LEFT:
                    if (robot.getX() > toX) {
                        while (robot.getX() != toX) {
                            robot.stepForward();
                        }
                    } else {
                        robot.turnRight();
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
