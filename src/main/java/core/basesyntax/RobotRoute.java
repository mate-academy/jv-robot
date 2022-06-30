package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if(toX < robot.getX()) {
            robot.turnLeft();
            while (toX != robot.getX()) {
                robot.stepForward();
            }
        } else {
            robot.turnRight();
            while (toX != robot.getX()) {
                robot.stepForward();
            }
        }
        if(toY < robot.getY()) {
            robot.turnLeft();
            while (toY != robot.getY()) {
                robot.stepForward();
            }
        } else {
            robot.turnRight();
            while (toY != robot.getY()) {
                robot.stepForward();
            }
        }
    }
}
