package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        final int differenceX = toX - robot.getX();
        int differenceY = toY - robot.getY();

        Direction directionX = differenceX > 0 ? Direction.RIGHT : Direction.LEFT;
        int absDifferenceX = Math.abs(differenceX);
        while (robot.getDirection() != directionX) {
            robot.turnRight();
        }
        for (int i = 0; i < absDifferenceX; i++) {
            robot.stepForward();
        }

        Direction directionY = differenceY > 0 ? Direction.UP : Direction.DOWN;
        differenceY = Math.abs(differenceY);
        while (robot.getDirection() != directionY) {
            robot.turnRight();
        }
        for (int i = 0; i < differenceY; i++) {
            robot.stepForward();
        }
    }
}
