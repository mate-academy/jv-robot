package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            turnRobot(robot, Direction.RIGHT);
        } else {
            turnRobot(robot, Direction.LEFT);
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }

        if (robot.getY() < toY) {
            turnRobot(robot, Direction.UP);
        } else {
            turnRobot(robot, Direction.DOWN);
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void turnRobot(Robot robot, Direction target) {
        while (robot.getDirection() != target) {
            robot.turnRight();
        }
    }
}

// -2 :x
// -4 :y
// result: 32 - x
