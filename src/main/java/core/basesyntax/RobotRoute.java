package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                if (robot.getDirection() == Direction.UP || robot.getDirection() == Direction.LEFT) {
                    robot.turnRight();
                }
                if (robot.getDirection() == Direction.DOWN) {
                    robot.turnLeft();
                }
            }
            while (robot.getX() != toX && robot.getDirection() == Direction.RIGHT) {
                robot.stepForward();
            }
        }
        if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                if (robot.getDirection() == Direction.UP || robot.getDirection() == Direction.RIGHT) {
                    robot.turnLeft();
                }
                if (robot.getDirection() == Direction.DOWN) {
                    robot.turnRight();
                }
            }
            while (robot.getX() != toX && robot.getDirection() == Direction.LEFT) {
                robot.stepForward();
            }
        }

        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                if (robot.getDirection() == Direction.RIGHT || robot.getDirection() == Direction.DOWN) {
                    robot.turnLeft();
                }
                if (robot.getDirection() == Direction.LEFT) {
                    robot.turnRight();
                }
            }
            while (robot.getY() != toY && robot.getDirection() == Direction.UP) {
                robot.stepForward();
            }
        }
        if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                if (robot.getDirection() == Direction.UP || robot.getDirection() == Direction.RIGHT) {
                    robot.turnRight();
                }
                if (robot.getDirection() == Direction.LEFT) {
                    robot.turnLeft();
                }
            }
            while (robot.getX() != toX && robot.getDirection() == Direction.DOWN) {
                robot.stepForward();
            }
        }
    }
}
