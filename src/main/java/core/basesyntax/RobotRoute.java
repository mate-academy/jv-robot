package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currrentX = robot.getX();
        int currentY = robot.getY();
        int deltaX = toX - robot.getX();
        while (deltaX > 0 && robot.getDirection() != Direction.RIGHT) {
            robot.turnRight();
        }
        while (deltaX < 0 && robot.getDirection() != Direction.LEFT) {
            robot.turnLeft();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        int deltaY = toY - robot.getY();
        while (deltaY > 0 && robot.getDirection() != Direction.UP) {
            robot.turnRight();
        }
        while (deltaY < 0 && robot.getDirection() != Direction.DOWN) {
            robot.turnLeft();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
