package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            while (!robot.getDirection().equals(Direction.LEFT)) {
                robot.turnRight();
            }
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        } else {
            while (!robot.getDirection().equals(Direction.RIGHT)) {
                robot.turnLeft();
            }
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        }
        if (robot.getY() > toY) {
            while (!robot.getDirection().equals(Direction.DOWN)) {
                robot.turnRight();
            }
            while (robot.getY() > toY) {
                robot.stepForward();
            }
        } else {
            while (!robot.getDirection().equals(Direction.UP)) {
                robot.turnRight();
            }
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        }
    }
}

