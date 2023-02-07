package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        if (toX < robot.getX()) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
                robot.turnLeft();
            } else {
                robot.stepForward();
            }
            for (int i = robot.getX(); i > toX; i--) {
                robot.stepForward();
            }
        }
        if (toX > robot.getX()) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
                robot.turnRight();
            } else {
                robot.stepForward();
            }
            for (int i = robot.getX(); i < toX; i++) {
                robot.stepForward();
            }
        }
        if (toY < robot.getY()) {
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
                robot.turnLeft();
            } else {
                robot.stepForward();
            }
            for (int i = robot.getY(); i > toY; i--) {
                robot.stepForward();
            }
        }
        if (toY > robot.getY()) {
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
                robot.turnLeft();
            } else {
                robot.stepForward();
            }
            for (int i = robot.getY(); i < toY; i++) {
                robot.stepForward();
            }
        }
    }
}
