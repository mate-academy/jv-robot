package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();
        int deltaX = toX - currentX;
        int deltaY = toY - currentY;
        Direction x = (deltaX > 0) ? Direction.RIGHT : Direction.LEFT;
        Direction y = (deltaY > 0) ? Direction.UP : Direction.DOWN;
        while (robot.getDirection() != x) {
            robot.turnRight();
        }
        for (int i = 0; i < Math.abs(deltaX); i++) {
            robot.stepForward();
        }
        while (robot.getDirection() != y) {
            robot.turnRight();
        }
        for (int i = 0; i < Math.abs(deltaY); i++) {
            robot.stepForward();
        }
    }
}

