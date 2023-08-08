package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int startX = robot.getX();
        robot.stepForward();
        if (startX - toX == robot.getX() - toX) {
            robot.turnLeft();
            startX = robot.getX();
            robot.stepForward();
        }
        turnInTrueDirection(startX, toX, robot.getX(), robot);
        while (robot.getX() - toX != 0) {
            robot.stepForward();
        }
        robot.turnLeft();
        int startY = robot.getY();
        robot.stepForward();
        turnInTrueDirection(startY, toY, robot.getY(), robot);
        while (robot.getY() - toY != 0) {
            robot.stepForward();
        }
    }

    private void turnInTrueDirection(int startCoordinate, int toCoordinate,
                                     int getCoordinate, Robot robot) {
        if (startCoordinate - toCoordinate < getCoordinate - toCoordinate) {
            robot.turnLeft();
            robot.turnLeft();
        }
    }
}
