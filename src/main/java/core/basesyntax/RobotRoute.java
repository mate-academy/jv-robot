package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        // Axis X
        for (; robot.getX() != toX; ) {
            if (robot.getX() > toX && !(robot.getDirection().equals(Direction.LEFT))) {
                if (robot.getDirection().equals(Direction.DOWN)) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
                if (!(robot.getDirection().equals(Direction.LEFT))) {
                    robot.turnRight();
                }
            }
            if (robot.getX() < toX && !(robot.getDirection().equals(Direction.RIGHT))) {
                if (robot.getDirection().equals(Direction.DOWN)) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
                if (!(robot.getDirection().equals(Direction.RIGHT))) {
                    robot.turnRight();
                }
            }
            robot.stepForward();
        }
        // Axis Y
        for (; robot.getY() != toY; ) {
            if (robot.getY() > toY && !(robot.getDirection().equals(Direction.DOWN))) {
                if (robot.getDirection().equals(Direction.RIGHT)) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
                if (!(robot.getDirection().equals(Direction.DOWN))) {
                    robot.turnLeft();
                }
            }
            if (robot.getY() < toY && !(robot.getDirection().equals(Direction.UP))) {
                if (robot.getDirection().equals(Direction.RIGHT)) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
                if (!(robot.getDirection().equals(Direction.UP))) {
                    robot.turnLeft();
                }
            }
            robot.stepForward();
        }
    }
}
