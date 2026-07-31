package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction direction = robot.getX() < toX ? Direction.RIGHT : Direction.LEFT;
        while (robot.getX() != toX && robot.getDirection() != direction) {
            robot.turnLeft();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        direction = robot.getY() < toY ? Direction.UP : Direction.DOWN;
        while (robot.getY() != toY && robot.getDirection() != direction) {
            robot.turnLeft();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
