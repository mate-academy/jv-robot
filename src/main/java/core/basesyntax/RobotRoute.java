package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        final int startPositionX = robot.getX();
        final int startPositionY = robot.getY();
        robot.stepForward();
        if (robot.getX() > startPositionX && startPositionX > toX) {
            robot.turnRight();
            robot.turnRight();
        } else if (robot.getX() < startPositionX && startPositionX < toX) {
            robot.turnLeft();
            robot.turnLeft();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        if (robot.getY() > startPositionY && startPositionY > toY) {
            robot.turnRight();
            robot.turnRight();
        } else if (robot.getY() < startPositionY && startPositionY < toY) {
            robot.turnLeft();
            robot.turnLeft();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
