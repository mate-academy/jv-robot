package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX != robot.getX()) {
            RobotRoute.moveRobotToX(robot, toX);
        }
        if (toY != robot.getY()) {
            RobotRoute.moveRobotToY(robot, toX, toY);
        }
    }

    public static void moveRobotToX(Robot robot, int toX) {
        int diffrenceX = toX - robot.getX();
        robot.stepForward();
        if (toX < robot.getX()) {
            while (toX - robot.getX() <= diffrenceX) {
                robot.turnLeft();
                diffrenceX = toX - robot.getX();
                robot.stepForward();
            }
        } else {
            while (toX - robot.getX() >= diffrenceX) {
                robot.turnLeft();
                diffrenceX = toX - robot.getX();
                robot.stepForward();
            }
        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }
    }

    public static void moveRobotToY(Robot robot, int toX, int toY) {
        int diffrenceY = toY - robot.getY();
        robot.turnLeft();
        robot.stepForward();
        if (toX != robot.getX()) {
            robot.turnLeft();
            robot.turnLeft();
            robot.stepForward();
            robot.turnLeft();
        }
        if (toY < robot.getY()) {
            while (toY - robot.getY() <= diffrenceY) {
                robot.turnLeft();
                robot.turnLeft();
                diffrenceY = toY - robot.getY();
                robot.stepForward();
            }
        } else {
            while (toY - robot.getY() >= diffrenceY) {
                robot.turnLeft();
                robot.turnLeft();
                diffrenceY = toY - robot.getY();
                robot.stepForward();
            }
        }
        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }
}
