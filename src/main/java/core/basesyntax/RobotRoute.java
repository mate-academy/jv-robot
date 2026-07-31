package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        String leftigth = (robot.getX() > toX) ? Direction.LEFT.name() : Direction.RIGHT.name();
        while (leftigth != robot.getDirection().name()) {
            robot.turnLeft();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }

        String upDown = (robot.getY() > toY) ? Direction.DOWN.name() : Direction.UP.name();
        while (upDown != robot.getDirection().name()) {
            robot.turnLeft();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
