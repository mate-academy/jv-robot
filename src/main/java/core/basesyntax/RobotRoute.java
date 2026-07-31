package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        for (int i = robot.getX(); i > toX; i--) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            robot.stepForward();
        }
        for (int i = robot.getX(); i < toX; i++) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            robot.stepForward();
        }
        for (int i = robot.getY(); i > toY; i--) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            robot.stepForward();
        }
        for (int i = robot.getY(); i < toY; i++) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            robot.stepForward();
        }

    }
}
