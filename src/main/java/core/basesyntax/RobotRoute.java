package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        WayRobotToX.MoveToX(robot, toX);
        WayRobotToY.MoveToY(robot, toY);
    }
}
