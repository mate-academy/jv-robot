package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction DirX = (robot.getX() - toX > 0) ? Direction.RIGHT : Direction.LEFT;
        Direction DirY = (robot.getY() - toY > 0) ? Direction.DOWN : Direction.UP;

        while (robot.getDirection() != DirX) {
            robot.turnRight();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        while (robot.getDirection() != DirY) {
            robot.turnLeft();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
