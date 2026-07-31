package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        if (robot.getX() < toX) {
            turnTo(robot, Direction.RIGHT);
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        }
        if (robot.getX() > toX) {
            turnTo(robot, Direction.LEFT);
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        }
        if (robot.getY() < toY) {
            turnTo(robot, Direction.UP);
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        }
        if (robot.getY() > toY) {
            turnTo(robot, Direction.DOWN);
            while (robot.getY() > toY) {
                robot.stepForward();
            }
        }
    }

    public void turnTo(Robot robot, Direction neededDirection) {
        while (robot.getDirection() != neededDirection) {
            robot.turnRight();
        }
    }
}
