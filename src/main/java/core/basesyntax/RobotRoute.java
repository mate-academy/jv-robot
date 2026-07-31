package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveToX(robot, toX);
        moveToY(robot, toY);
    }

    private void moveToX(Robot robot, int x) {
        if (robot.getX() < x) {
            changeDirectionTo(robot, Direction.RIGHT);
        }
        if (robot.getX() > x) {
            changeDirectionTo(robot, Direction.LEFT);
        }

        while (robot.getX() != x) {
            robot.stepForward();
        }
    }

    private void moveToY(Robot robot, int y) {
        if (robot.getY() < y) {
            changeDirectionTo(robot, Direction.UP);
        }
        if (robot.getY() > y) {
            changeDirectionTo(robot, Direction.DOWN);
        }

        while (robot.getY() != y) {
            robot.stepForward();
        }
    }

    private void changeDirectionTo(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnRight();
        }
    }
}
