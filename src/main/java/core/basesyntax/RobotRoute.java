package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        while (robot.getX() != toX && robot.getY() != toY) {
            int x = robot.getX();
            int y = robot.getY();
            if (x > toX) {
                if (!robot.getDirection().equals(Direction.LEFT)) {
                    robot.turnLeft();
                }
                if (robot.getDirection().equals(Direction.LEFT)) {
                    robot.stepForward();
                }
            }
            if (x < toX) {
                if (!robot.getDirection().equals(Direction.RIGHT)) {
                    robot.turnLeft();
                }
                if (robot.getDirection().equals(Direction.RIGHT)) {
                    robot.stepForward();
                }
            }
            if (y < toY) {
                if (!robot.getDirection().equals(Direction.UP)) {
                    robot.turnRight();
                }
                if (robot.getDirection().equals(Direction.UP)) {
                    robot.stepForward();
                }
            }
            if (y > toY) {
                if (!robot.getDirection().equals(Direction.DOWN)) {
                    robot.turnRight();
                }
                if (robot.getDirection().equals(Direction.DOWN)) {
                    robot.stepForward();
                }
            }
        }
    }
}
