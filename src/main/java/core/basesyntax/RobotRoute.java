package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            goDirectly(robot, Direction.RIGHT, toX, true);
        } else if (robot.getX() > toX) {
            goDirectly(robot, Direction.LEFT, toX, true);
        }
        if (robot.getY() > toY) {
            goDirectly(robot, Direction.DOWN, toY, false);
        } else if (robot.getY() < toY) {
            goDirectly(robot, Direction.UP, toY, false);
        }
    }

    private void goDirectly(Robot robot, Direction direction,
                            int value, boolean isX) {
        findDirection(robot, direction);
        goToPoint(robot, value, isX);
    }

    private void findDirection(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnLeft();
        }
    }

    private void goToPoint(Robot robot, int value, boolean isX) {
        if (isX) {
            while (robot.getX() != value) {
                robot.stepForward();
            }
        } else {
            while (robot.getY() != value) {
                robot.stepForward();
            }
        }
    }
}
