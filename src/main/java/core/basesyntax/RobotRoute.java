package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction directionToX = toX > robot.getX() ? Direction.RIGHT : Direction.LEFT;
        while (robot.getDirection() != directionToX) {
            robot.turnLeft();
        }
        int moveX = Math.abs(toX - robot.getX());
        for (int i = 0; i < moveX; i++) {
            robot.stepForward();
        }

        Direction directionToY = toY > robot.getY() ? Direction.UP : Direction.DOWN;
        while (robot.getDirection() != directionToY) {
            robot.turnLeft();
        }
        int moveY = Math.abs(toY - robot.getY());
        for (int i = 0; i < moveY; i++) {
            robot.stepForward();
        }
    }
}
