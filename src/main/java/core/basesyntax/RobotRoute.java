package core.basesyntax;

public class RobotRoute {
    public RobotRoute() {
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            new RobotOnTheRight().onTheRight(robot, toX, toY);
        }
        if (robot.getX() < toX) {
            new RobotOnTheLeft().onTheLeft(robot, toX, toY);
        }
        if (robot.getX() == toX) {
            new RobotOnSameLine().onSameLine(robot, toX, toY);
        }
    }
}
