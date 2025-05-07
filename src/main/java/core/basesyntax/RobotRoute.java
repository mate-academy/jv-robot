package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            if (robot.getX() > toX) {
                if (robot.getDirection() == Direction.LEFT) {
                    robot.stepForward();
                } else {
                    robot.turnLeft();
                }
            }
            if (robot.getX() < toX) {
                if (robot.getDirection() == Direction.RIGHT) {
                    robot.stepForward();
                } else {
                    robot.turnRight();
                }
            }
        }

        while (robot.getY() != toY) {
            if (robot.getY() > toY) {
                if (robot.getDirection() == Direction.DOWN) {
                    robot.stepForward();
                } else {
                    robot.turnLeft();
                }
            }
            if (robot.getY() < toY) {
                if (robot.getDirection() == Direction.UP) {
                    robot.stepForward();
                } else {
                    robot.turnRight();
                }
            }
        }
    }
}
