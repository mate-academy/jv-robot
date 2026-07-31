package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (true) {
            if (robot.getX() > toX) {
                switch (robot.getDirection()) {
                    case UP:
                        robot.turnLeft();
                        continue;
                    case LEFT:
                        robot.stepForward();
                        continue;
                    case DOWN:
                        robot.turnLeft();
                        continue;
                    case RIGHT:
                        robot.turnLeft();
                        continue;
                    default:
                        break;
                }
            }
            if (robot.getX() < toX) {
                switch (robot.getDirection()) {
                    case UP:
                        robot.turnRight();
                        continue;
                    case LEFT:
                        robot.turnRight();
                        continue;
                    case DOWN:
                        robot.turnRight();
                        continue;
                    case RIGHT:
                        robot.stepForward();
                        continue;
                    default:
                        break;
                }
            }
            if (robot.getY() > toY && robot.getX() == toX) {
                switch (robot.getDirection()) {
                    case LEFT:
                        robot.turnLeft();
                        break;
                    case DOWN:
                        robot.stepForward();
                        break;
                    case UP:
                        robot.turnLeft();
                        break;
                    case RIGHT:
                        robot.turnRight();
                        break;
                    default:
                        break;
                }
            }
            if (robot.getY() < toY && robot.getX() == toX) {
                switch (robot.getDirection()) {
                    case RIGHT:
                        robot.turnRight();
                        break;
                    case UP:
                        robot.stepForward();
                        break;
                    case LEFT:
                        robot.turnRight();
                        break;
                    case DOWN:
                        robot.turnRight();
                        break;
                    default:
                        break;
                }
            }
            if (robot.getX() == toX && robot.getY() == toY) {
                break;
            }
        }
    }
}
