package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getDirection() != Direction.LEFT) {
            robot.turnLeft();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        robot.turnLeft();
        while (robot.getY() != toY) {
            robot.stepForward();
        }

    }
}
