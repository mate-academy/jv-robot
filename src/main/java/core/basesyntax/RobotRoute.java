package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            if (robot.getX() > toX) {
                robot.turnLeft();
                robot.stepForward();
            }
            if (robot.getX() < toX) {
                robot.turnRight();
                robot.stepForward();
            }
            while (robot.getY() != toY) {
                if (robot.getY() > toY) {
                    robot.turnLeft();
                    robot.stepForward();
                }
                if (robot.getY() < toY) {
                    robot.turnRight();
                    robot.stepForward();
                }
            }
        }
    }
}
