package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() != toX) {
            Direction stepToXDirection = robot.getX() < toX ? Direction.RIGHT : Direction.LEFT;
            while (robot.getDirection() != stepToXDirection) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (robot.getY() != toY) {
            Direction stepToYDirection = robot.getY() < toY ? Direction.UP : Direction.DOWN;
            while (robot.getDirection() != stepToYDirection) {
                robot.turnRight();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }
}
