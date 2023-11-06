package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getY() < toY) {
            switch (robot.getDirection()) {
                case UP:
                    break;
                case DOWN:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case LEFT:
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    break;
                default:
                    break;
            }
        } else if (robot.getY() > toY) {
            switch (robot.getDirection()) {
                case DOWN:
                    break;
                case UP:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case LEFT:
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    break;
                default:
                    break;
            }
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }

        if (robot.getX() < toX) {
            switch (robot.getDirection()) {
                case RIGHT:
                    break;
                case LEFT:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnLeft();
                    break;
                case UP:
                    robot.turnLeft();
                    break;
                default:
                    break;
            }
        } else if (robot.getX() > toX) {
            switch (robot.getDirection()) {
                case LEFT:
                    break;
                case UP:
                    robot.turnLeft();
                    break;
                case RIGHT:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnRight();
                    break;
                default:
                    break;
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }
}
