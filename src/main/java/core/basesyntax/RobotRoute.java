package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction buildDirection;
        if (robot.getX() != toX) {
            buildDirection = robot.getX() - toX > 0 ? Direction.LEFT : Direction.RIGHT;
            while (robot.getDirection() != buildDirection) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }
        if (robot.getY() != toY) {
            buildDirection = robot.getY() - toY > 0 ? Direction.DOWN : Direction.UP;
            while (robot.getDirection() != buildDirection) {
                robot.turnRight();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }
}
