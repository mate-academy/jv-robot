package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
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
        // x> i y>
        if (robot.getX() <= toX && robot.getY() <= toY) {
            for (int i = robot.getX(); i < toX; i++) {
                robot.stepForward();
            }
            robot.turnLeft();
            for (int i = robot.getY(); i < toY; i++) {
                robot.stepForward();
            }
        }
        // x> i y<
        if (robot.getX() <= toX && robot.getY() >= toY) {
            for (int i = robot.getX(); i < toX; i++) {
                robot.stepForward();
            }
            robot.turnRight();
            for (int i = robot.getY(); i > toY; i--) {
                robot.stepForward();
            }
        }
        // x< i y>
        if (robot.getX() >= toX && robot.getY() <= toY) {
            robot.turnLeft();
            for (int i = robot.getY(); i < toY; i++) {
                robot.stepForward();
            }
            robot.turnLeft();
            for (int i = robot.getX(); i > toX; i--) {
                robot.stepForward();
            }
        }
        // x< i y<
        if (robot.getX() >= toX && robot.getY() >= toY) {
            robot.turnRight();
            for (int i = robot.getY(); i > toY; i--) {
                robot.stepForward();
            }
            robot.turnRight();
            for (int i = robot.getX(); i > toX; i--) {
                robot.stepForward();
            }
        }
    }
}
