package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //move toX
        if (toX > robot.getX()) {
            while (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        } else {
            while (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
            }
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        }
        //move toY
        if (toY > robot.getY()) {
            while (robot.getDirection() == Direction.UP) {
                robot.turnRight();
            }
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        } else {
            while (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
            }
            while (robot.getY() > toY) {
                robot.stepForward();
            }
        }
        //write your solution here
    }
}
