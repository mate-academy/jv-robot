package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();

        switch (robot.getDirection()) {
            case UP:
                if (toX > x) {
                    robot.turnRight();
                } else if (toX < x) {
                    robot.turnLeft();
                }
                break;
            case DOWN:
                if (toX > x) {
                    robot.turnLeft();
                } else if (toX < x) {
                    robot.turnRight();
                }
                break;
            case LEFT:
                if (toX > x) {
                    robot.turnRight();
                    robot.turnRight();
                }
                break;
            case RIGHT:
                if (toX > x) {
                    robot.turnLeft();
                    robot.turnLeft();
                }
                break;
            default: break;

        }
        while (toX != x) {
            robot.stepForward();
        }
        switch (robot.getDirection()) {
            case RIGHT:
                if (toY > y) {
                    robot.turnLeft();
                } else if (toY < y) {
                    robot.turnRight();
                }
                break;
            case LEFT:
                if (toY > y) {
                    robot.turnRight();
                } else if (toY < y) {
                    robot.turnLeft();
                }
                break;
            default: break;
        }
        while (toY != y) {
            robot.stepForward();
        }

    }
}
