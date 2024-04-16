package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        // Calculate the differences in X and Y coordinates
        int diffX = toX - currentX;
        int diffY = toY - currentY;

        // Move in the X direction
        while (currentX != toX) {
            if (currentX < toX) {
                // Turn right to face towards positive X
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
                robot.stepForward(); // Move one step in the X direction
                currentX++;
            } else {
                // Turn left to face towards negative X
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
                robot.stepForward(); // Move one step in the X direction
                currentX--;
            }
        }

        // Move in the Y direction
        while (currentY != toY) {
            if (currentY < toY) {
                // Turn right to face towards positive Y
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
                robot.stepForward(); // Move one step in the Y direction
                currentY++;
            } else {
                // Turn right to face towards negative Y
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();
                }
                robot.stepForward(); // Move one step in the Y direction
                currentY--;
            }
        }
    }
}

