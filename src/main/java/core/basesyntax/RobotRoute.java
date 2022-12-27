package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() > toX) {
            switch (robot.getDirection()) {    // Разворачиваемся вверх
                case UP:
                    robot.turnLeft();
                    robot.stepForward();
                    break;
                case DOWN:
                    robot.turnRight();
                    robot.stepForward();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    robot.turnLeft();
                    robot.stepForward();
                    break;
                case LEFT:
                    robot.stepForward();
                    break;
                default:
                    break;
            }
        }
        while (robot.getX() < toX) {
            switch (robot.getDirection()) {    // Разворачиваемся вверх
                case UP:
                    robot.turnRight();
                    robot.stepForward();
                    break;
                case DOWN:
                    robot.turnLeft();
                    robot.stepForward();
                    break;
                case RIGHT:
                    robot.stepForward();
                    break;
                case LEFT:
                    robot.turnLeft();
                    robot.turnLeft();
                    robot.stepForward();
                    break;
                default:
                    break;
            }
        }
        while (robot.getY() > toY) {
            switch (robot.getDirection()) {    // Разворачиваемся вверх
                case UP:
                    robot.turnLeft();
                    robot.turnLeft();
                    robot.stepForward();
                    break;
                case DOWN:
                    robot.stepForward();
                    break;
                case RIGHT:
                    robot.turnRight();
                    robot.stepForward();
                    break;
                case LEFT:
                    robot.turnLeft();
                    robot.stepForward();
                    break;
                default:
                    break;
            }
        }
        while (robot.getY() < toX) {
            switch (robot.getDirection()) {    // Разворачиваемся вверх
                case UP:
                    robot.stepForward();
                    break;
                case DOWN:
                    robot.turnLeft();
                    robot.turnLeft();
                    robot.stepForward();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    robot.stepForward();
                    break;
                case LEFT:
                    robot.turnRight();
                    robot.stepForward();
                    break;
                default:
                    break;
            }
        }
    }
}
