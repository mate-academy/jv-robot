package core.basesyntax;

public class RobotRoute {
    static private int stepsX;
    public void moveRobot(Robot robot, int toX, int toY) {
        turnXRobot(robot, toX);
        moveXRobot(robot, toX);

    }

    public void turnXRobot(Robot robot, int toX) {
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
        } else if (robot.getX() < toX) {
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
    }

    public void moveXRobot(Robot robot, int toX) {
        stepsX = Math.abs(robot.getX() - toX);
        for (int i = 0; i < stepsX; i++) {
            robot.stepForward();
        }
    }
}
