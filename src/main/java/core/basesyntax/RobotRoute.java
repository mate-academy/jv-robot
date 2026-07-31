package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        WayRobotToX.moveToX(robot, toX);
        WayRobotToY.moveToY(robot, toY);
    }
}
