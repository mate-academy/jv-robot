package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX > robot.getX()) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }
        if (toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        }
        if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.stepForward();
            }
        }
        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.stepForward();
            }
        }
    }
}
