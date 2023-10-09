package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX || robot.getY() != toY) {
            if (robot.getX() < toX) {
                robot.turnRight();
                robot.stepForward();
            } else if (robot.getX() > toX) {
                robot.turnLeft();
                robot.stepForward();
            } else if (robot.getY() < toY) {
                robot.stepForward();
            } else if (robot.getY() > toY) {
                robot.turnLeft();
                robot.turnLeft();
                robot.stepForward();
            }
        }
    }
}
