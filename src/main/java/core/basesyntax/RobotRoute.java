package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            for (int i = robot.getX(); i > toX; i--) {
                robot.stepForward();
            }
        } else if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            for (int i = robot.getX(); i < toX; i++) {
                robot.stepForward();
            }
        }
        if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            for (int i = robot.getY(); i > toY; i--) {
                robot.stepForward();
            }
        } else if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            for (int i = robot.getY(); i < toY; i++) {
                robot.stepForward();
            }
        }
    }
}

