package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            if (robot.getX() < toX) {
                Direction directionr = Direction.RIGHT;
            } else {
                Direction directionl = Direction.LEFT;
            }
            robot.stepForward();
        }
        while (robot.getY() != toY) {
            if (robot.getY() < toY) {
                Direction directionu = Direction.UP;
            } else {
                Direction directiond = Direction.DOWN;
            }
            robot.stepForward();
        }
    }
}
