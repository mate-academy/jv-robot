package core.basesyntax;

public class RobotRoute {
    public static void moveRobot(Robot robot, int finishX, int finishY) {
        while (robot.getX() != finishX || robot.getY() != finishY) {
            switch (robot.getDirection()) {
                case UP:
                    if (robot.getY() < finishY) {
                        robot.stepForward();
                    } else if (robot.getX() > finishX) {
                        robot.turnLeft();
                    } else {
                        robot.turnRight();
                    }
                    break;
                case DOWN:
                    if (robot.getY() > finishY) {
                        robot.stepForward();
                    } else if (robot.getX() < finishX) {
                        robot.turnLeft();
                    } else {
                        robot.turnRight();
                    }
                    break;
                case LEFT:
                    if (robot.getX() > finishX) {
                        robot.stepForward();
                    } else if (robot.getY() > finishY) {
                        robot.turnLeft();
                    } else {
                        robot.turnRight();
                    }
                    break;
                case RIGHT:
                    if (robot.getX() < finishX) {
                        robot.stepForward();
                    } else if (robot.getY() < finishY) {
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
