package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction currentDirection;
        if (robot.getX() != toX) {
            currentDirection = (robot.getX() < toX) ? Direction.RIGHT : Direction.LEFT;
            while (robot.getDirection() != currentDirection) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (robot.getY() != toY) {
            currentDirection = (robot.getY() < toY) ? Direction.UP : Direction.DOWN;
            while (robot.getDirection()!= currentDirection) {
                robot.turnLeft();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }
}
