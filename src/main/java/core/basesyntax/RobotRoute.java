package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();
        Direction forwardX;
        Direction forwardY;
        Direction forwardActual;

        if (x != toX) {
            if (x > toX) {
                forwardX = Direction.LEFT;
                boolean xline = (true);
                while (xline) {
                    robot.turnRight();
                    forwardActual = robot.getDirection();
                    xline = (forwardX != forwardActual);
                }
                for (int i = x; i != toX; i--) {
                    robot.stepForward();
                }
            } else {
                forwardX = Direction.RIGHT;
                boolean xine = true;
                while (xine) {
                    robot.turnRight();
                    forwardActual = robot.getDirection();
                    xine = (forwardX != forwardActual);
                }
                for (int i = x; i != toX; i++) {
                    robot.stepForward();
                }
            }
        }

        if (y != toY) {
            if (y > toY) {
                forwardY = Direction.DOWN;
                boolean yline = true;
                while (yline) {
                    robot.turnLeft();
                    forwardActual = robot.getDirection();
                    yline = (forwardY != forwardActual);
                }
                for (int i = y; i != toY; i--) {
                    robot.stepForward();
                }
            } else {
                forwardY = Direction.UP;
                boolean yline = true;
                while (yline) {
                    robot.turnLeft();
                    forwardActual = robot.getDirection();
                    yline = (forwardY != forwardActual);
                }
                for (int i = y; i != toY; i++) {
                    robot.stepForward();
                }
            }
        }
    }
}

