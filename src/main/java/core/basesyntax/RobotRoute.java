package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        if (robot.getX() > toX) {
            robot.turnLeft();
        } else if (robot.getX() < toX) {
            robot.turnRight();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }

        if (robot.getY() > toY) {
            robot.turnLeft();
        } else if (robot.getY() < toY) {
            robot.turnRight();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
