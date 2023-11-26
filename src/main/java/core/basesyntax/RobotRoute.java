package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getDirection() != Direction.RIGHT) {
            robot.turnRight();
            if (robot.getX() != toX && robot.getDirection() == Direction.RIGHT
                    && robot.getX() < toX) {
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            }
        }
        while (robot.getDirection() != Direction.LEFT) {
            robot.turnLeft();
            if (robot.getX() != toX && robot.getDirection() == Direction.LEFT
                    && robot.getX() > toX) {
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            }
        }
        while (robot.getDirection() != Direction.UP) {
            robot.turnLeft();
            if (robot.getY() != toY && robot.getDirection() == Direction.UP && robot.getY() < toY) {
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        }
        while (robot.getDirection() != Direction.DOWN) {
            robot.turnLeft();
            if (robot.getY() != toY && robot.getDirection() == Direction.DOWN
                    && robot.getY() > toY) {
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        }
    }
}
