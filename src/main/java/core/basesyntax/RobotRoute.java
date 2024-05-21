package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            if (robot.getX() < toX) {
                if (robot.getDirection() == Direction.UP) {
                    robot.turnRight();
                    robot.stepForward();
                } else if (robot.getDirection() == Direction.LEFT) {
                    robot.turnRight();
                    robot.turnRight();
                    robot.stepForward();
                } else if (robot.getDirection() == Direction.DOWN) {
                    robot.turnLeft();
                    robot.stepForward();
                } else {
                    robot.stepForward();
                }
            }
            if (robot.getX() > toX) {
                if (robot.getDirection() == Direction.UP) {
                    robot.turnLeft();
                    robot.stepForward();
                } else if (robot.getDirection() == Direction.RIGHT) {
                    robot.turnRight();
                    robot.turnRight();
                    robot.stepForward();
                } else if (robot.getDirection() == Direction.DOWN) {
                    robot.turnRight();
                    robot.stepForward();
                } else {
                    robot.stepForward();
                }
            }
        }

        while (robot.getY() != toY) {
            if (robot.getY() < toY) {
                if (robot.getDirection() == Direction.RIGHT) {
                    robot.turnLeft();
                    robot.stepForward();
                } else if (robot.getDirection() == Direction.LEFT) {
                    robot.turnRight();
                    robot.stepForward();
                } else if (robot.getDirection() == Direction.DOWN) {
                    robot.turnLeft();
                    robot.turnLeft();
                    robot.stepForward();
                } else {
                    robot.stepForward();
                }
            }
            if (robot.getY() > toY) {
                if (robot.getDirection() == Direction.UP) {
                    robot.turnLeft();
                    robot.turnLeft();
                    robot.stepForward();
                } else if (robot.getDirection() == Direction.RIGHT) {
                    robot.turnRight();
                    robot.stepForward();
                } else if (robot.getDirection() == Direction.LEFT) {
                    robot.turnLeft();
                    robot.stepForward();
                } else {
                    robot.stepForward();
                }
            }
        }
    }
}
