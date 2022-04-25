package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            while (Direction.LEFT != robot.getDirection()) {
                robot.turnLeft();
            }
        } else {
            while (Direction.RIGHT != robot.getDirection()) {
                robot.turnRight();
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        if (robot.getY() > toY) {
            while (Direction.DOWN != robot.getDirection()) {
                robot.turnLeft();
            }
        } else {
            while (Direction.UP != robot.getDirection()) {
                robot.turnRight();
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
