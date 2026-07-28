package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveAlongX(robot, toX);
        moveAlongY(robot, toY);
    }

    private void moveAlongX(Robot robot, int toX) {
        int distanceByX = toX - robot.getX();
        Direction properDirection = (distanceByX > 0) ? Direction.RIGHT : Direction.LEFT;

        while (robot.getDirection() != properDirection) {
            robot.turnRight();
        }

        for (int i = 0; i < Math.abs(distanceByX); i++) {
            robot.stepForward();
        }
    }

    private void moveAlongY(Robot robot, int toY) {
        int distanceByY = toY - robot.getY();
        Direction properDirection = (distanceByY > 0) ? Direction.UP : Direction.DOWN;

        while (robot.getDirection() != properDirection) {
            robot.turnRight();
        }

        for (int i = 0; i < Math.abs(distanceByY); i++) {
            robot.stepForward();
        }
    }
}
