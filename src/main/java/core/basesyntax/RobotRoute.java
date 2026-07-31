package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction directionX = robot.getX() < toX ? Direction.RIGHT : Direction.LEFT;
        Direction directionY = robot.getY() < toY ? Direction.UP : Direction.DOWN;

        while (directionX != robot.getDirection()) {
            robot.turnRight();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        while (directionY != robot.getDirection()) {
            robot.turnRight();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
