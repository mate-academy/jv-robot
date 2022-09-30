package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        WayRobotToX.MoveTox(robot, toX);
        WayRobotToY.MoveToy(robot, toY);
    }
}
