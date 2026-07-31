package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX || robot.getY() != toY) {
            if (robot.getX() < toX) {
                setDirection(robot, Direction.RIGHT);
                robot.stepForward();
            } else if (robot.getX() > toX) {
                setDirection(robot, Direction.LEFT);
                robot.stepForward();
            } else if (robot.getY() < toY) {
                setDirection(robot, Direction.UP);
                robot.stepForward();
            } else if (robot.getY() > toY) {
                setDirection(robot, Direction.DOWN);
                robot.stepForward();
            }
        }
    }

    private void setDirection(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
    }
}
