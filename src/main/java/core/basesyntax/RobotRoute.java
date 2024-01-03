package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        while (robot.getX() > toX && robot.getDirection() != Direction.LEFT) {
            robot.turnLeft();
        }
        while (robot.getX() < toX && robot.getDirection() != Direction.RIGHT) {
            robot.turnRight();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        while (robot.getY() > toY && robot.getDirection() != Direction.DOWN) {
            robot.turnLeft();
        }
        while (robot.getY() < toY && robot.getDirection() != Direction.UP) {
            robot.turnRight();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
