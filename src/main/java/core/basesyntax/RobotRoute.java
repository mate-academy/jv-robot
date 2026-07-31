package core.basesyntax;

public class RobotRoute {
    private Robot robot;

    public void moveRobot(Robot robot, int toX, int toY) {
        this.robot = robot;
        Point goalPoint = new Point(toX, toY);

        while (!getPointOfRobot().equals(goalPoint)) {
            while (robot.getDirection() != getGoalDirection(goalPoint)) {
                robot.turnRight();
            }
            robot.stepForward();
        }
    }

    private Point getPointOfRobot() {
        return new Point(robot.getX(), robot.getY());
    }

    private Direction getGoalDirection(Point goalPoint) {
        Point currentPoint = getPointOfRobot();

        if (goalPoint.getX() > currentPoint.getX()) {
            return Direction.RIGHT;
        }
        if (goalPoint.getX() < currentPoint.getX()) {
            return Direction.LEFT;
        }
        if (goalPoint.getY() > currentPoint.getY()) {
            return Direction.UP;
        }
        return Direction.DOWN;
    }
}
