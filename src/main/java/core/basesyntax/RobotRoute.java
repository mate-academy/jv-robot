package core.basesyntax;

public class RobotRoute {
    private Robot robot;

    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX > robot.getX()) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (toX > robot.getX()) {
                robot.stepForward();
            }
        } else if (toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (toX < robot.getX()) {
                robot.stepForward();
            }
        }
        if (toY > robot.getY()) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (toY > robot.getY()) {
                robot.stepForward();
            }
        } else if (toY < robot.getY()) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            while (toY < robot.getY()) {
                robot.stepForward();
            }
        }
    }
}
