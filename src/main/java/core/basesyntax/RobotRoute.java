package core.basesyntax;

public class RobotRoute {
    private int currentX;
    private int currentY;

    public void moveRobot(Robot robot, int toX, int toY) {
        currentX = robot.getX();
        currentY = robot.getY();
        Direction desiredDirectionX = currentX < toX ? Direction.RIGHT : Direction.LEFT;
        Direction desiredDirectionY = currentY < toY ? Direction.UP : Direction.DOWN;
        while (robot.getDirection() != desiredDirectionX) {
            if (desiredDirectionX == Direction.RIGHT) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        while (robot.getDirection() != desiredDirectionY) {
            if (desiredDirectionY == Direction.UP) {
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
