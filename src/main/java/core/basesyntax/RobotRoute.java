package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        routeToX(robot, toX);
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        routeToY(robot, toY);
        while ((robot.getY() != toY)) {
            robot.stepForward();
        }
    }

    private void routeToX(Robot robot, int toX) {
        Direction correctDirection;
        if (robot.getX() > toX) {
            correctDirection = Direction.LEFT;
        } else {
            correctDirection = Direction.RIGHT;
        }
        while (!robot.getDirection().equals(correctDirection)) {
            robot.turnRight();
        }
    }

    private void routeToY(Robot robot, int toY) {
        Direction correctDirection;
        if (robot.getY() > toY) {
            correctDirection = Direction.DOWN;
        } else {
            correctDirection = Direction.UP;
        }
        while (!robot.getDirection().equals(correctDirection)) {
            robot.turnRight();
        }
    }
}
