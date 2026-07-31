package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();
        int stepsOnX = toX - currentX;
        int stepsOnY = toY - currentY;
        if (stepsOnX > 0) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        } else {
            stepsOnX = - stepsOnX;
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        }
        for (int i = 0; i < stepsOnX; i++) {
            robot.stepForward();
        }
        if (stepsOnY > 0) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        } else {
            stepsOnY = - stepsOnY;
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        }
        for (int i = 0; i < stepsOnY; i++) {
            robot.stepForward();
        }
    }
}
