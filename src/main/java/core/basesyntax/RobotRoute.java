package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) throws AssertionError {
        int deltaX = toX - robot.getX();
        int deltaY = toY - robot.getY();

        while (deltaX != 0) {
            if (deltaX > 0) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
                robot.stepForward();
                deltaX--;
            } else {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
                robot.stepForward();
                deltaX++;
            }
        }

        while (deltaY != 0) {
            if (deltaY > 0) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnLeft();
                }
                robot.stepForward();
                deltaY--;
            } else {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();
                }
                robot.stepForward();
                deltaY++;
            }
        }

        if (robot.getX() != toX || robot.getY() != toY) {
            throw new AssertionError("Robot is not in the expected position");
        }
    }
}



