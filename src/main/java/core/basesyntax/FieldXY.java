package core.basesyntax;

public class FieldXY {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (toX > robot.getX()) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            robot.stepForward();
        }
        while (toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            robot.stepForward();
        }
        while (toY > robot.getY()) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            robot.stepForward();
        }
        while (toY < robot.getY()) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            robot.stepForward();
        }
    }
}