package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() < toX && robot.getDirection() != Direction.RIGHT) {
            robot.turnRight();
        }
        while (robot.getX() > toX && robot.getDirection() != Direction.LEFT) {
            robot.turnLeft();
        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }
        while (robot.getY() < toY && robot.getDirection() != Direction.UP) {
            robot.turnRight();
        }
        while (robot.getY() > toY && robot.getDirection() != Direction.DOWN) {
            robot.turnRight();
        }
        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }
}
