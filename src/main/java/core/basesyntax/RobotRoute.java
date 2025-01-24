package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveX(robot, toX);
        moveY(robot, toY);
    }

    private void moveX(Robot robot, int toX) {
        if (robot.getX() > toX) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                default:
                    break;
            }
        }
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
                    break;
                default:
                    break;
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    private void moveY(Robot robot, int toY) {
        if (robot.getY() > toY) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnRight();
                    break;
                case LEFT:
                    robot.turnLeft();
                    break;
                default:
                    break;
            }
        }
        if (robot.getY() < toY) {
            switch (robot.getDirection()) {
                case DOWN:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnRight();
                    break;
                default:
                    break;
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
