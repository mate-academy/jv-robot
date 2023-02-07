package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            turn(robot, Direction.RIGHT);
        } else {
            turn(robot, Direction.LEFT);
        }

        int distanceX = Math.abs(toX - robot.getX());
        for (int i = 0; i < distanceX; i++) {
            robot.stepForward();
        }

        if (robot.getY() < toY) {
            turn(robot, Direction.UP);
        } else {
            turn(robot, Direction.DOWN);
        }

        int distanceY = Math.abs(toY - robot.getY());
        for (int i = 0; i < distanceY; i++) {
            robot.stepForward();
        }
    }

    private void turn(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnLeft();
        }
    }
}
