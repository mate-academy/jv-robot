package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        // movement along the X axis
        if (robot.getX() > toX) {
            turnRobot(robot, Direction.LEFT.ordinal());
        } else if (robot.getX() < toX) {
            turnRobot(robot, Direction.RIGHT.ordinal());
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }

        // movement along the Y axis
        if (robot.getY() > toY) {
            turnRobot(robot, Direction.DOWN.ordinal());
        } else if (robot.getY() < toY) {
            turnRobot(robot, Direction.UP.ordinal());
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void turnRobot(Robot robot, int rightDirection) {
        while (robot.getDirection().ordinal() != rightDirection) {
            robot.turnLeft();
        }
    }

}
