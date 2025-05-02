package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        if (currentX < toX) {
            turnRobot(robot, Direction.RIGHT);
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        } else if (currentX > toX) {
            turnRobot(robot, Direction.LEFT);
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        }

        if (currentY < toY) {
            turnRobot(robot, Direction.UP);
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        } else if (currentY > toY) {
            turnRobot(robot, Direction.DOWN);
            while (robot.getY() > toY) {
                robot.stepForward();
            }
        }
    }

    private void turnRobot(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
    }
}
