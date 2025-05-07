package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            while (!robot.getDirection().toString().equalsIgnoreCase("left")) {
                robot.turnLeft();
            }
        } else if (robot.getX() < toX) {
            while (!robot.getDirection().toString().equalsIgnoreCase("right")) {
                robot.turnRight();
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }

        if (robot.getY() > toY) {
            while (!robot.getDirection().toString().equalsIgnoreCase("down")) {
                robot.turnLeft();
            }
        } else if (robot.getY() < toY) {
            while (!robot.getDirection().toString().equalsIgnoreCase("up")) {
                robot.turnRight();
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
        //write your solution here
    }
}
