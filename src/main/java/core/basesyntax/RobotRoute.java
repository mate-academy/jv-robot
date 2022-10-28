package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        if (robot.getY() > toY) {
            robot.turnLeft();
        } else {
            robot.turnRight();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
