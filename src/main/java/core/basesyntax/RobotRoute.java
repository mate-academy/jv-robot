package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            for (int i = robot.getX(); i > toX; i--) {
                robot.stepForward();
            }
        } else if (toX > robot.getX()) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            for (int i = robot.getX(); i < toX; i++) {
                robot.stepForward();
            }
        }
        if (toY < robot.getY()) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            for (int i = robot.getY(); i > toY; i--) {
                robot.stepForward();
            }
        } else if (toY > robot.getY()) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            for (int i = robot.getY(); i < toY; i++) {
                robot.stepForward();
            }
        }
    }
}
