package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        final int deltaX = toX - robot.getX();
        final int deltaY = toY - robot.getY();

        // Adjust the direction to move horizontally
        while (deltaX > 0 && robot.getDirection() != Direction.RIGHT) {
            robot.turnRight();
        }
        while (deltaX < 0 && robot.getDirection() != Direction.LEFT) {
            robot.turnLeft();
        }

        // Move horizontally
        while (robot.getX() != toX) {
            robot.stepForward();
        }

        // Adjust the direction to move vertically
        while (deltaY > 0 && robot.getDirection() != Direction.UP) {
            robot.turnRight();
        }
        while (deltaY < 0 && robot.getDirection() != Direction.DOWN) {
            robot.turnLeft();
        }

        // Move vertically
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
