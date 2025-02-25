package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        // Move along X axis
        if (currentX != toX) {
            if (currentX < toX) {
                turnRobot(robot, Direction.RIGHT);
            } else {
                turnRobot(robot, Direction.LEFT);
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        // Move along Y axis
        if (currentY != toY) {
            if (currentY < toY) {
                turnRobot(robot, Direction.UP);
            } else {
                turnRobot(robot, Direction.DOWN);
            }
            while (robot.getY() != toY) {
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
