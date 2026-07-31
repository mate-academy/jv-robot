package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();

        int deltaX = currentX - toX;

        if (deltaX > 0) {
            robot.turnRight();
        }

        if (deltaX < 0) {
            robot.turnLeft();
        }

        while (deltaX != 0) {
            robot.stepForward();
        }
        int currentY = robot.getY();
        int deltaY = currentY - toY;

        if (deltaY > 0) {
            robot.turnLeft();
        }

        if (deltaY < 0) {
            robot.turnRight();
        }

        while (deltaY != 0) {
            robot.stepForward();
        }
    }
}
