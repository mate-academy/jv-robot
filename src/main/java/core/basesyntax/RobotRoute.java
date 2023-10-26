package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            while (!robot.getDirection().equals(Direction.LEFT)) {
                robot.turnLeft();
            }
            for (int i = robot.getX(); i > toX; i--) {
                robot.stepForward();
            }
        }
        if (robot.getX() < toX) {
            while (!robot.getDirection().equals(Direction.RIGHT)) {
                robot.turnLeft();
            }
            for (int i = robot.getX(); i < toX; i++) {
                robot.stepForward();
            }
        }
        if (robot.getY() > toY) {
            while (!robot.getDirection().equals(Direction.DOWN)) {
                robot.turnLeft();
            }
            for (int i = robot.getY(); i > toY; i--) {
                robot.stepForward();
            }
        }
        if (robot.getY() < toY) {
            while (!robot.getDirection().equals(Direction.UP)) {
                robot.turnLeft();
            }
            for (int i = robot.getY(); i < toY; i++) {
                robot.stepForward();
            }
        }
    }
}
