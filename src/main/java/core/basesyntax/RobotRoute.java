package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        robot.initialDirection();
        int stepsX = toX - robot.getX();
        if (toX < 0) {
            robot.turnLeft();
        }
        if (toX > 0) {
            robot.turnRight();
        }
        if (stepsX < 0) {
            stepsX *= -1;
        }
        for (int i = 0; i < stepsX; i++) {
            robot.stepForward();
        }
        int stepsY = toY - robot.getY();
        if (toY > 0 && stepsY < 0 && toX > 0 || toY > 0 && stepsY > 0 && toX < 0
                || toY < 0 && stepsY > 0 && toX < 0 || toY < 0 && stepsY < 0 && toX > 0) {
            robot.turnRight();
        }
        if (toY > 0 && stepsY > 0 && toX > 0 || toY > 0 && stepsY < 0 && toX < 0
                || toY < 0 && stepsY < 0 && toX < 0 || toY < 0 && stepsY > 0 && toX > 0) {
            robot.turnLeft();
        }
        if (stepsY < 0) {
            stepsY *= -1;
        }
        for (int i = 0; i < stepsY; i++) {
            robot.stepForward();
        }
    }
}
