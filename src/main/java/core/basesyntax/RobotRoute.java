package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        String leftOrRight = (robot.getX() > toX) ? Direction.LEFT.name() : Direction.RIGHT.name();
        while (leftOrRight != robot.getDirection().name()) {
            robot.turnLeft();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }

        String upOrDown = (robot.getY() > toY) ? Direction.DOWN.name() : Direction.UP.name();
        while (upOrDown != robot.getDirection().name()) {
            robot.turnLeft();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
