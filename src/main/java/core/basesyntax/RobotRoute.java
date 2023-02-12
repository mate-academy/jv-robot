package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            while (robot.getDirection() != (robot.getX() > toX ? Direction.LEFT : Direction.RIGHT)) {
                robot.turnRight();
            }
            robot.stepForward();
        }
        while (robot.getY() != toY) {
            while (robot.getDirection() != (robot.getY() > toY ? Direction.DOWN : Direction.UP)) {
                robot.turnLeft();
            }
            robot.stepForward();
        }
    }
}
