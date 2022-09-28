package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction turnDirX = robot.getX() < toX ? Direction.RIGHT : Direction.LEFT;
        Direction turnDirY = robot.getY() < toY ? Direction.UP : Direction.DOWN;

        while (robot.getX() != toX || robot.getY() != toY) {
            if (turnDirX == robot.getDirection()) {
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            }
            if (turnDirY == robot.getDirection()) {
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
            robot.turnRight();
        }
    }
}
