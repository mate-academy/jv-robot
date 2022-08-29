package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        // At first, we need to define in which area point is
        if (robot.getX() >= toX && robot.getY() <= toY) { // Top left
            rotateRobot(robot, Direction.UP);
            moveY(robot, toY);
            rotateRobot(robot, Direction.LEFT);
            moveX(robot, toX);
        } else if (robot.getX() <= toX && robot.getY() <= toY) { // Top right
            rotateRobot(robot, Direction.UP);
            moveY(robot, toY);
            rotateRobot(robot, Direction.RIGHT);
            moveX(robot, toX);
        } else if (robot.getX() >= toX && robot.getY() >= toY) { // Bottom left
            rotateRobot(robot, Direction.DOWN);
            moveY(robot, toY);
            rotateRobot(robot, Direction.LEFT);
            moveX(robot, toX);
        } else { // Bottom right
            rotateRobot(robot, Direction.DOWN);
            moveY(robot, toY);
            rotateRobot(robot, Direction.RIGHT);
            moveX(robot, toX);
        }
    }

    // Rotate robot in order to given direction
    public void rotateRobot(Robot robot, Direction toDirection) {
        while (robot.getDirection() != toDirection) {
            robot.turnRight();
        }
    }

    public void moveX(Robot robot, int toX) { // Move robot to X
        int count = Math.abs(toX - robot.getX());
        for (int i = 0; i < count; i++) {
            robot.stepForward();
        }
    }

    public void moveY(Robot robot, int toY) {  // Move robot to Y
        int count = Math.abs(toY - robot.getY());
        for (int i = 0; i < count; i++) {
            robot.stepForward();
        }
    }
}
