package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() < toX) {
            if (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            robot.stepForward();
        }
        while (robot.getY() < toY) {
            if (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
            robot.stepForward();
        }
        while (robot.getX() > toX) {
            if (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            robot.stepForward();
        }
        while (robot.getY() > toY) {
            if (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            } else {
                robot.stepForward();
            }
        }
    }
}

