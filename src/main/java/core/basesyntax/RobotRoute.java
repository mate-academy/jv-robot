package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        robot.ifXmoreToX(toX, toY);
        robot.ifXlessToX(toX, toY);
        robot.ifXequalsToX(toX, toY);
        robot.ifYequalsToY(toX, toY);
    }
}
