package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here
        if (toX == robot.getX() && toY == robot.getY()) {
            return;
        }
        int xStart = robot.getX();
        int yStart = robot.getY();

        if (toX == robot.getX() && toY == robot.getY()) {
            return;
        }

        robot.stepForward();
        if (robot.getX() != xStart) {
            if (Math.abs(toX - robot.getX()) > Math.abs(xStart - toX)) {
                robot.turnRight();
                robot.turnRight();
            }
            for (; toX != robot.getX(); ) {
                robot.stepForward();
            }
            robot.turnRight();
        }

        if (Math.abs(toY - robot.getY()) > Math.abs(yStart - toY)) {
            robot.turnRight();
            robot.turnRight();
        }
        for (; toY != robot.getY(); ) {
            robot.stepForward();
        }

        robot.turnRight();
            if (Math.abs(toX - robot.getX()) > Math.abs(xStart - toX)) {
                robot.turnRight();
                robot.turnRight();
            }
            for (; toX != robot.getX(); ) {
                robot.stepForward();
            }
    }
}
