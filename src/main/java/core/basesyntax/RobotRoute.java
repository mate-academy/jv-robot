package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction direction;
        int distanceX = Math.abs(toX - robot.getX());
        int distanceY = Math.abs(toY - robot.getY());
        if (distanceX > 0) {
            direction = toX > robot.getX() ? Direction.RIGHT : Direction.LEFT;
            while (robot.getDirection() != direction) {
                robot.turnRight();
            }
            while (distanceX > 0) {
                robot.stepForward();
                distanceX--;
            }
        }
        if (distanceY > 0) {
            direction = toY > robot.getY() ? Direction.UP : Direction.DOWN;
            while (direction != robot.getDirection()) {
                robot.turnRight();
            }
            while (distanceY > 0) {
                robot.stepForward();
                distanceY--;
            }
        }
    }
}


