package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        if (toX - robot.getX() > 0) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (toX - robot.getX() != 0) {
                robot.stepForward();
            }
        }
        if (toX - robot.getX() < 0) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (toX - robot.getX() != 0) {
                robot.stepForward();
            }
        }
        if (toY - robot.getY() > 0) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
            while (toY - robot.getY() != 0) {
                robot.stepForward();
            }
        }
        if (toY - robot.getY() < 0) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            while (toY - robot.getY() != 0) {
                robot.stepForward();
            }
        }
    }
}
