package core.basesyntax;

public class RobotRoute {
    private void moveHorizontally(Robot robot, int toX) {
        int currentX = robot.getX();
        Direction targetDirection = (currentX < toX) ? Direction.RIGHT : Direction.LEFT;
        while (robot.getX() != toX && robot.getDirection() != targetDirection) {
            if (targetDirection == Direction.RIGHT) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
            robot.stepForward();
        }
    }

    private void moveVertically(Robot robot, int toY) {
        int currentY = robot.getY();
        Direction targetDirection = (currentY < toY) ? Direction.UP : Direction.DOWN;
        while (robot.getY() != toY && robot.getDirection() != targetDirection) {
            if (targetDirection == Direction.RIGHT) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
            robot.stepForward();
        }
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        moveHorizontally(robot, toX);
        moveVertically(robot, toY);
    }
}
