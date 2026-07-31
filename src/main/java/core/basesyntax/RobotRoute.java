package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        findXCoordinate(robot, toX);
        findYCoordinate(robot, toY);
    }

    public void findXCoordinate(Robot robot, int toX) {
        robot.turnRight();
        int findDirectionX = Math.abs(toX - robot.getX());
        robot.stepForward();
        if (Math.abs(robot.getX() - toX) == findDirectionX) {
            robot.turnRight();
            robot.stepForward();
        }
        if (Math.abs(robot.getX() - toX) < findDirectionX) {
            robot.turnRight();
            robot.turnRight();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    public void findYCoordinate(Robot robot, int toY) {
        robot.turnRight();
        int findDirectionY = Math.abs(toY - robot.getY());
        robot.stepForward();
        if (Math.abs(robot.getY() - toY) == findDirectionY) {
            robot.turnRight();
            robot.stepForward();
        }
        if (Math.abs(robot.getY() - toY) < findDirectionY) {
            robot.turnRight();
            robot.turnRight();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
