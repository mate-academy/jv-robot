package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction goHomeToX = toX > robot.getX() ? Direction.RIGHT : Direction.LEFT;

        while (robot.getDirection() != goHomeToX) {
            robot.turnLeft();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }

        Direction goHomeToY = toY > robot.getY() ? Direction.UP : Direction.DOWN;

        while (robot.getDirection() != goHomeToY) {
            robot.turnRight();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
