package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        if (robot.getX() > toX) {
            while (!robot.getDirection().equals(Direction.LEFT)) {
                robot.turnLeft();
            }
        } else {
            while (!robot.getDirection().equals(Direction.RIGHT)) {
                robot.turnRight();
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        if (robot.getY() > toY) {
            while (!robot.getDirection().equals(Direction.DOWN)) {
                robot.turnLeft();
            }
        } else {
            while (!robot.getDirection().equals(Direction.DOWN)) {
                robot.turnRight();
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
