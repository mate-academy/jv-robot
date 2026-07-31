package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int deltaX = toX - robot.getX();
        while (deltaX > 0 && robot.getDirection() != Direction.RIGHT) {
            robot.turnRight();
        }
        while (deltaX < 0 && robot.getDirection() != Direction.LEFT) {
            robot.turnLeft();
        }
        while (deltaX != 0) {
            robot.stepForward();
            deltaX = toX - robot.getX();
        }
        int deltaY = toY - robot.getY();
        while (deltaY > 0 && robot.getDirection() != Direction.UP) {
            robot.turnLeft();
        }
        while (deltaY < 0 && robot.getDirection() != Direction.DOWN) {
            robot.turnRight();
        }

        while (deltaY != 0) {
            robot.stepForward();
            deltaY = toY - robot.getY();
        }
    }
}
