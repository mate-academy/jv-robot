package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int startX = robot.getX();
        int startY = robot.getY();

        if (startX > toX) {
            while (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
            }
            while (startX == toX) {
                robot.stepForward();
            }
        } else {
            while (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
            }
            while (startX == toX) {
                robot.stepForward();
            }
        }
        if (startY > toY) {
            while (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
            }
            while (startY == toY) {
                robot.stepForward();
            }
        } else {
            while (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
            }
            while (startY == toY) {
                robot.stepForward();
            }
        }
    }
}
