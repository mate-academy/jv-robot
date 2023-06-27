package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
            if (robot.getX() < toX) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
        } else {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
            if (robot.getX() < toX) {
                robot.turnLeft();
            } else {
                robot.turnRight();
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }
}
