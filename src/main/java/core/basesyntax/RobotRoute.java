package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int deltaX = toX - robot.getX();
        int deltaY = toY - robot.getY();

        // Рух вздовж вісі X
        while (deltaX != 0) {
            if (deltaX > 0) {
                robot.turnRight();
                robot.stepForward();
                deltaX--;
            } else {
                robot.turnLeft();
                robot.stepForward();
                deltaX++;
            }
        }

        while (deltaY != 0) {
            if (deltaY > 0) {
                robot.turnRight();
                robot.stepForward();
                deltaY--;
            } else {
                robot.turnLeft();
                robot.stepForward();
                deltaY++;
            }
        }

        if (robot.getX() != toX || robot.getY() != toY) {
            throw new AssertionError("Robot is not in the expected position");
        }
    }
}


