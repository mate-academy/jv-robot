package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            if (robot.getX() < toX) {
                switch (robot.getDirection()) {
                    case UP:
                        robot.turnRight();
                        break;
                    case LEFT:
                        robot.turnRight();
                        robot.turnRight();
                        break;
                    case DOWN:
                        robot.turnLeft();
                        robot.turnLeft();
                        break;
                    default:
                        robot.stepForward();
                        break;
                }
            } else if (robot.getX() > toX) {
                switch (robot.getDirection()) {
                    case UP:
                        robot.turnLeft();
                        break;
                    default:
                        robot.stepForward();
                        break;
                    case DOWN:
                        robot.turnRight();
                        break;
                    case RIGHT:
                        robot.turnRight();
                        robot.turnRight();
                        break;
                }
            }
        }

        while (robot.getY() != toY) {
            if (robot.getY() < toY) {
                switch (robot.getDirection()) {
                    case RIGHT:
                        robot.turnLeft();
                        break;
                    case LEFT:
                        robot.turnRight();
                        break;
                    default:
                        robot.stepForward();
                        break;
                    case DOWN:
                        robot.turnRight();
                        robot.turnRight();
                        break;
                }
            } else if (robot.getY() > toY) {
                switch (robot.getDirection()) {
                    default:
                        robot.stepForward();
                        break;
                    case UP:
                        robot.turnRight();
                        robot.turnRight();
                        break;
                    case LEFT:
                        robot.turnLeft();
                        break;
                    case RIGHT:
                        robot.turnRight();
                        break;
                }
            }
        }
    }
}
