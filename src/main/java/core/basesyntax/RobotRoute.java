package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX > robot.getX()) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            for (; robot.getX() < toX; robot.stepForward()) {

            }
        } else {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
            for (; robot.getX() > toX; robot.stepForward()) {

            }
        }
        if (toY > robot.getY()) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            for (; robot.getY() < toY; robot.stepForward()) {

            }

        } else {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }

            for (; robot.getY() > toY; robot.stepForward()) {

            }
        }
    }
}
