package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX == robot.getX() && toY == robot.getY()) {
            return;
        }
        int initialValueOfX = robot.getX();
        int initialValueOfY = robot.getY();

        robot.stepForward();
        if (robot.getX() != initialValueOfX) {
            moveX(robot, toX, initialValueOfX);
            robot.turnRight();
        }

        moveY(robot, toY, initialValueOfY);
        robot.turnRight();
        moveX(robot, toX, initialValueOfX);
    }

    private void moveX(Robot robot, int toX, int initialValueOfX) {
        if (Math.abs(toX - robot.getX()) > Math.abs(initialValueOfX - toX)) {
            robot.turnRight();
            robot.turnRight();
        }
        for (; toX != robot.getX(); ) {
            robot.stepForward();
        }
    }

    private void moveY(Robot robot, int toY, int initialValueOfY) {
        if (Math.abs(toY - robot.getY()) > Math.abs(initialValueOfY - toY)) {
            robot.turnRight();
            robot.turnRight();
        }
        for (; toY != robot.getY(); ) {
            robot.stepForward();
        }
    }
}
