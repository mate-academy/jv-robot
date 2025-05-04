package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (toX < robot.getX() && robot.getDirection() != Direction.LEFT) {
            robot.turnLeft();
        }
        while (toX > robot.getX() && robot.getDirection() != Direction.RIGHT) {
            robot.turnRight();
        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }

        while (toY < robot.getY() && robot.getDirection() != Direction.DOWN) {
            robot.turnLeft();
        }
        while (toY > robot.getY() && robot.getDirection() != Direction.UP) {
            robot.turnRight();
        }
        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }
}
