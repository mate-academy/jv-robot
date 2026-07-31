package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction wolkDirection;
        if (robot.getX() > toX) {
            wolkDirection = Direction.LEFT;
        } else {
            wolkDirection = Direction.RIGHT;
        }
        turnRobotUntil(wolkDirection, robot);
        while ((robot.getX() != toX)) {
            robot.stepForward();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        if (robot.getY() > toY) {
            wolkDirection = Direction.DOWN;
        } else {
            wolkDirection = Direction.UP;
        }
        turnRobotUntil(wolkDirection, robot);
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    public void turnRobotUntil(Direction d, Robot r) {
        while (d != r.getDirection()) {
            r.turnLeft();
        }
    }
}
