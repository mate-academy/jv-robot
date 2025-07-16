package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction forX = robot.getX() < toX ? Direction.RIGHT : Direction.LEFT;
        Direction forY = robot.getY() < toY ? Direction.UP : Direction.DOWN;

        while (robot.getDirection() != forX) {
            robot.turnRight();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        while (robot.getDirection() != forY) {
            robot.turnRight();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
