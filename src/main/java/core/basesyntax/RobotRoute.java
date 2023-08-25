package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (toX != robot.getX() || toY != robot.getY()) {
            if (robot.getX() < toX) {
                robot.turnLeft();
                robot.stepForward();
            } else if (robot.getX() > toX) {
                robot.turnRight();
                robot.stepForward();
            }
            if (robot.getY() < toY) {
                robot.turnLeft();
                robot.stepForward();
            } else if (robot.getY() > toY) {
                robot.turnRight();
                robot.stepForward();

            }
        }
    }
}
