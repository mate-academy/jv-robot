package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (toX != robot.getX()) {
            if (toX > robot.getX()) {
                if (robot.getDirection() == Direction.UP) {
                    robot.turnRight();
                } else if (robot.getDirection() == Direction.LEFT) {
                    robot.turnRight();
                    robot.turnRight();
                } else if (robot.getDirection() == Direction.DOWN) {
                    robot.turnLeft();
                }
            } else if (toX < robot.getX()) {
                if (robot.getDirection() == Direction.UP) {
                    robot.turnLeft();
                } else if (robot.getDirection() == Direction.RIGHT) {
                    robot.turnRight();
                    robot.turnRight();
                } else if (robot.getDirection() == Direction.DOWN) {
                    robot.turnRight();
                }
            }
            robot.stepForward();
        }
        while (toY != robot.getY()) {
            if (toY > robot.getY()) {
                if (robot.getDirection() == Direction.DOWN) {
                    robot.turnRight();
                    robot.turnRight();
                } else if (robot.getDirection() == Direction.LEFT) {
                    robot.turnRight();
                } else if (robot.getDirection() == Direction.RIGHT) {
                    robot.turnLeft();
                }
            } else if (toY < robot.getY()) {
                if (robot.getDirection() == Direction.UP) {
                    robot.turnRight();
                    robot.turnRight();
                } else if (robot.getDirection() == Direction.RIGHT) {
                    robot.turnRight();
                } else if (robot.getDirection() == Direction.LEFT) {
                    robot.turnLeft();
                }
            }
            robot.stepForward();
        }
    }
}
