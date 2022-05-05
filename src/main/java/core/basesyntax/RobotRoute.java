package core.basesyntax;

public class RobotRoute {
    public static void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX || robot.getY() != toY) {
            switch (robot.getDirection()) {
                case UP:
                    if (robot.getY() < toY) {
                        robot.stepForward();
                    }
                    else if (robot.getX() > toX) {
                        robot.turnLeft();
                    } else {
                        robot.turnRight();
                    }
                    break;
                case DOWN:
                    if (robot.getY() > toY) {
                        robot.stepForward();
                    } else if (robot.getX() < toX) {
                        robot.turnLeft();
                    } else {
                        robot.turnRight();
                    }
                    break;
                case LEFT:
                    if (robot.getX() > toX) {
                        robot.stepForward();
                    } else if (robot.getY() > toY) {
                        robot.turnLeft();
                    } else {
                        robot.turnRight();
                    }
                    break;
                case RIGHT:
                    if (robot.getX() < toX) {
                        robot.stepForward();
                    } else if (robot.getY() < toY) {
                        robot.turnLeft();
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
