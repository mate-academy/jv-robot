package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction leftOrRight = robot.getX() >= toX ? Direction.RIGHT : Direction.LEFT;
        Direction upOrDown = robot.getY() >= toY ? Direction.DOWN : Direction.UP;
        while (robot.getX() != toX) {
            while (leftOrRight != robot.getDirection()) {
                robot.turnRight();
            }
            robot.stepForward();
        }
        while (robot.getY() != toY) {
            while (upOrDown != robot.getDirection()) {
                robot.turnRight();
            }
            robot.stepForward();
        }
    }
}
