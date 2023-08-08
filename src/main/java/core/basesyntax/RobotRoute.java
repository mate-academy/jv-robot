package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        final int stepsX = robot.getX() >= toX ? robot.getX() - toX : toX - robot.getX();
        final int stepsY = robot.getY() >= toY ? robot.getY() - toY : toY - robot.getY();
        if (robot.getX() > toX) {
            while (!robot.getDirection().equals(Direction.LEFT)) {
                robot.turnLeft();
            }
        } else {
            while (!robot.getDirection().equals(Direction.RIGHT)) {
                robot.turnRight();
            }
        }
        for (int i = 0; i < stepsX; i++) {
            robot.stepForward();
        }
        if (robot.getY() > toY) {
            while (!robot.getDirection().equals(Direction.DOWN)) {
                robot.turnRight();
            }
        } else {
            while (!robot.getDirection().equals(Direction.UP)) {
                robot.turnLeft();
            }
        }
        for (int i = 0; i < stepsY; i++) {
            robot.stepForward();
        }
    }
}
