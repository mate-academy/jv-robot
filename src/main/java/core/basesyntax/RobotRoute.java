package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction newDirectionX = (robot.getX() < toX) ? Direction.RIGHT : Direction.LEFT;
        while (robot.getDirection() != newDirectionX) {
            robot.turnRight();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }

        Direction newDirectionY = (robot.getY() < toY) ? Direction.UP : Direction.DOWN;
        while (robot.getDirection() != newDirectionY) {
            robot.turnRight();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
