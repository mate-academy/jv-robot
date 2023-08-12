package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        int getX = robot.getX() * robot.getX();

        if (robot.getX() < toX) {
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
            }
        }
        if (robot.getX() > toX) {
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
            }
        }
        for (int i = 0; i < (toX * toX + getX * getX + toX * toX + + getX * getX); i++) {
            robot.stepForward();
            if (robot.getX() == toX) {
                break;
            }
        }
        if (robot.getY() > toY) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
            }
        }
        if (robot.getY() < toY) {
            if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
            }
        }
        int getY = robot.getY() * robot.getY();
        for (int i = 0; i < (toY * toY + getY * getY + toY * toY + getY * getY); i++) {
            robot.stepForward();
            if (robot.getY() == toY) {
                break;
            }
        }
    }
}
