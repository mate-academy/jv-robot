package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            robot.setDirection(Direction.LEFT);
        }

        if (robot.getX() < toX) {
            robot.setDirection(Direction.RIGHT);
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }

        if (robot.getY() > toY) {
            robot.setDirection(Direction.DOWN);
        }

        if (robot.getY() < toY) {
            robot.setDirection(Direction.UP);
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
