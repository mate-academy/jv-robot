package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            if (robot.getDirection() == Direction.LEFT) {
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            }
        } else if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.RIGHT) {
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            }
        }
        if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            if (robot.getDirection() == Direction.DOWN) {
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        } else if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
            if (robot.getDirection() == Direction.UP) {
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        }
    }
}
