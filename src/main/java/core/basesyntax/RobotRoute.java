package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        robot.setCoordinateX(toX);
        robot.setCoordinateY(toY);
    }
}
