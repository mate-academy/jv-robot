package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        Direction horizontalDirection = currentX < toX ? Direction.RIGHT : Direction.LEFT;
        Direction verticalDirection = currentY < toY ? Direction.UP : Direction.DOWN;

        while (robot.getDirection() != horizontalDirection) {
            if (horizontalDirection == Direction.RIGHT) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }

        while (robot.getDirection() != verticalDirection) {
            if (verticalDirection == Direction.UP) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
