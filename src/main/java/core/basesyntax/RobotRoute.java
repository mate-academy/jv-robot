package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        if (robot.getDirection() != Direction.DOWN) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        } else {
            robot.turnLeft();
        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }
        if (toY > robot.getY()) {
            robot.turnLeft();
        } else {
            robot.turnRight();
        }
        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }
}
