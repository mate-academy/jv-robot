package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        if (robot.getX() > toX) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                default:
                    break;
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }
        if (robot.getX() < toX) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                default:
                    break;
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }
        if (robot.getY() > toY) {
            switch (robot.getDirection()) {
                case LEFT:
                    robot.turnLeft();
                    break;
                case RIGHT:
                    robot.turnRight();
                    break;
                case UP:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                default:
                    break;
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
        if (robot.getY() < toY) {
            switch (robot.getDirection()) {
                case RIGHT:
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                default:
                    break;
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }
}
