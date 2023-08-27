package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() != toX) {
            while (robot.getDirection() != findToXDirection(robot, toX)) {
                robot.turnRight();
            }

            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (robot.getY() != toY) {
            while (robot.getDirection() != findToYDirection(robot, toY)) {
                robot.turnRight();
            }

            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }

    private Direction findToXDirection(Robot robot, int toX) {
        if (robot.getX() > toX) {
            return Direction.LEFT;
        } else if (robot.getX() < toX) {
            return Direction.LEFT;
        }
        return null;
    }

    private Direction findToYDirection(Robot robot, int toY) {
        if (robot.getY() > toY) {
            return Direction.DOWN;
        } else if (robot.getY() < toY) {
            return Direction.UP;
        }
        return null;
    }
}
