package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() >= toX) {
            while (robot.getDirection() != (Direction.LEFT)) {
                robot.turnLeft();
            }
        } else {
            while (robot.getDirection() != (Direction.RIGHT)) {
                robot.turnRight();
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        if (robot.getY() < toY) {
            while (robot.getDirection() != (Direction.UP)) {
                robot.turnRight();
            }
        } else {
            while (robot.getDirection() != (Direction.DOWN)) {
                robot.turnLeft();
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
