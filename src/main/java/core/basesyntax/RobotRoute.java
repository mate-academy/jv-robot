package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        Direction firstDirection = toX > robot.getX() ? Direction.RIGHT : Direction.LEFT;
        Direction secondDirection = toY > robot.getY() ? Direction.UP : Direction.DOWN;

        while (robot.getDirection() != firstDirection) {
            robot.turnLeft();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        while (robot.getDirection() != secondDirection) {
            robot.turnRight();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
