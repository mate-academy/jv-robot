package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        int horDiff = robot.getX() - toX;
        Direction reqDirection;

        if (horDiff < 0) {
            reqDirection = Direction.RIGHT;
            horDiff *= -1;
        } else {
            reqDirection = Direction.LEFT;
        }

        while (!robot.getDirection().equals(reqDirection)) {
            robot.turnLeft();
        }

        for (int i = 0; i < horDiff; i++) {
            robot.stepForward();
        }

        int verDiff = robot.getY() - toY;

        if (verDiff < 0) {
            reqDirection = Direction.UP;
            verDiff *= -1;
        } else {
            reqDirection = Direction.DOWN;
        }

        while (!robot.getDirection().equals(reqDirection)) {
            robot.turnLeft();
        }

        for (int i = 0; i < verDiff; i++) {
            robot.stepForward();
        }
    }
}
