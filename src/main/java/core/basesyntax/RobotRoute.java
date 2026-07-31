package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        } else if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                if (robot.getDirection() == Direction.RIGHT) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
            }
        } else if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                if (robot.getDirection() == Direction.LEFT) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
