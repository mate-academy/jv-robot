package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveToY(robot, toY);
        moveToX(robot, toX);
    }

    private void setDirection(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnLeft();
        }
    }

    private void moveToY(Robot robot, int toY) {
        if (robot.getY() < toY) {
            setDirection(robot, Direction.UP);
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        } else if (robot.getY() > toY) {
            setDirection(robot, Direction.DOWN);
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void moveToX(Robot robot, int toX) {
        if (robot.getX() < toX) {
            setDirection(robot, Direction.RIGHT);
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        } else if (robot.getX() > toX) {
            setDirection(robot, Direction.LEFT);
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }
}
