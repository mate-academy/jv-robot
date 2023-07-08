package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int pointX = toX - robot.getX();
        int pointY = toY - robot.getY();

        if (pointX != 0) {
            moveHorizont(robot, pointX);
        }
        if (pointY != 0) {
            moveVertical(robot, pointY);
        }
    }

    private void moveHorizont(Robot robot, int pointX) {
        Direction targetDirection = (pointX > 0) ? Direction.RIGHT : Direction.LEFT;
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
        for (int i = 0; i < Math.abs(pointX); i++) {
            robot.stepForward();
        }
    }

    private void moveVertical(Robot robot, int pointY) {
        Direction targetDirection = (pointY > 0) ? Direction.UP : Direction.DOWN;
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
        for (int i = 0; i < Math.abs(pointY); i++) {
            robot.stepForward();
        }
    }
}
