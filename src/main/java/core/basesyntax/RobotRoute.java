package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int deltaX = toX - currentX;
        while (deltaX > 0 && robot.getDirection() != Direction.RIGHT) {
            robot.turnRight();
        }
        while (deltaX < 0 && robot.getDirection() != Direction.LEFT) {
            robot.turnLeft();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        int currentY = robot.getY();
        int deltaY = toY - currentY;
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
