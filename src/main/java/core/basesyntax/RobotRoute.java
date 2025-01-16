package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        while (currentX != toX || currentY != toY) {
            int deltaX = toX - currentX;
            int deltaY = toY - currentY;

            // Determine which way to turn and move
            if (deltaX > 0) {
                // Robot needs to move right
                if (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
            } else if (deltaX < 0) {
                // Robot needs to move left
                if (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
            }

            if (deltaY > 0) {
                // Robot needs to move up
                if (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
            } else if (deltaY < 0) {
                // Robot needs to move down
                if (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
            }

            // Move the robot one step forward
            robot.stepForward();

            // Update current coordinates
            currentX = robot.getX();
            currentY = robot.getY();
        }
    }
}