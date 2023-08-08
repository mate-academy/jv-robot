package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int deltaX = toX - currentX; // Calculate the differences between the current position by X

        // Move the robot horizontally
        while (deltaX > 0 && robot.getDirection() != Direction.RIGHT) {
            robot.turnRight();
        }
        while (deltaX < 0 && robot.getDirection() != Direction.LEFT) {
            robot.turnLeft();
        }
        while (deltaX != 0) {
            robot.stepForward();
            if (deltaX > 0) {
                deltaX--;
            } else {
                deltaX++;
            }
        }

        int currentY = robot.getY();
        int deltaY = toY - currentY; // Calculate the differences between the current position by Y

        // Move the robot vertically
        while (deltaY > 0 && robot.getDirection() != Direction.UP) {
            robot.turnLeft();
        }
        while (deltaY < 0 && robot.getDirection() != Direction.DOWN) {
            robot.turnRight();
        }
        while (deltaY != 0) {
            robot.stepForward();
            if (deltaY > 0) {
                deltaY--;
            } else {
                deltaY++;
            }
        }
    }
}
