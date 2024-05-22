package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        if (robot.getX() == toX && robot.getY() == toY) {
            return;
        }
        moveX(robot, toX);
        moveY(robot, toY);
        moveRobot(robot, toX, toY);

    }

    private void moveX(Robot robot, int toX) {
        if (robot.getX() == toX) {
            return;
        }
        if (toX < robot.getX()) {
            robot.setDirection(Direction.LEFT);

        } else {
            robot.setDirection(Direction.RIGHT);
        }
        robot.stepForward();
    }

    private void moveY(Robot robot, int toY) {
        if (robot.getY() == toY) {
            return;
        }
        if (toY < robot.getY()) {
            robot.setDirection(Direction.DOWN);
        } else {
            robot.setDirection(Direction.UP);
        }
        robot.stepForward();
    }
}
