package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            for (int i = robot.getX(); i > toX; i--) {
                if (robot.getDirection() == Direction.RIGHT) {
                    robot.turnLeft();
                    robot.turnLeft();
                    robot.stepForward();
                } else if (robot.getDirection() == Direction.UP) {
                    robot.turnLeft();
                    robot.stepForward();
                } else if (robot.getDirection() == Direction.LEFT) {
                    robot.stepForward();
                } else if (robot.getDirection() == Direction.DOWN) {
                    robot.turnRight();
                    robot.stepForward();
                }
            }
        } else {
            for (int i = robot.getX(); i < toX; i++) {
                if (robot.getDirection() == Direction.LEFT) {
                    robot.turnRight();
                    robot.turnRight();
                    robot.stepForward();
                } else if (robot.getDirection() == Direction.UP) {
                    robot.turnRight();
                    robot.stepForward();
                } else if (robot.getDirection() == Direction.RIGHT) {
                    robot.stepForward();
                } else if (robot.getDirection() == Direction.DOWN) {
                    robot.turnLeft();
                    robot.stepForward();
                }
            }
        }
        if (robot.getY() > toY) {
            for (int i = robot.getY(); i > toY; i--) {
                if (robot.getDirection() == Direction.RIGHT) {
                    robot.turnRight();
                    robot.stepForward();
                } else if (robot.getDirection() == Direction.UP) {
                    robot.turnRight();
                    robot.turnRight();
                    robot.stepForward();
                } else if (robot.getDirection() == Direction.LEFT) {
                    robot.turnLeft();
                    robot.stepForward();
                } else if (robot.getDirection() == Direction.DOWN) {
                    robot.stepForward();
                }
            }
        } else {
            for (int i = robot.getY(); i < toY; i++) {
                if (robot.getDirection() == Direction.LEFT) {
                    robot.turnRight();
                    robot.stepForward();
                } else if (robot.getDirection() == Direction.UP) {
                    robot.stepForward();
                } else if (robot.getDirection() == Direction.RIGHT) {
                    robot.turnLeft();
                    robot.stepForward();
                } else if (robot.getDirection() == Direction.DOWN) {
                    robot.turnLeft();
                    robot.turnLeft();
                    robot.stepForward();
                }
            }
        }
    }
}
