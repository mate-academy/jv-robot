package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        moveOnXCoord(robot, toX);
        moveOnYCoord(robot, toY);
    }

    public void moveOnYCoord(Robot robot, int toY) {
        if (toY - robot.getY() > 0) {
            while (!robot.getDirection().equals(Direction.UP)) {
                robot.turnRight();
            }
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        } else if (toY - robot.getY() < 0) {
            while (!robot.getDirection().equals(Direction.DOWN)) {
                robot.turnRight();
            }
            while (robot.getY() > toY) {
                robot.stepForward();
            }
        }
    }

    public void moveOnXCoord(Robot robot, int toX) {
        if ((toX - robot.getX()) > 0) {
            while (!(robot.getDirection().equals(Direction.RIGHT))) {
                robot.turnRight();
            }
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        } else if ((toX - robot.getX()) < 0) {
            while (!(robot.getDirection().equals(Direction.LEFT))) {
                robot.turnLeft();
            }
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        }

    }
}
