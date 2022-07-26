package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        robot.turnLeft();
        while (toX != robot.getX()) {
            robot.stepForward();
        }
        robot.turnRight();
        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }
}
