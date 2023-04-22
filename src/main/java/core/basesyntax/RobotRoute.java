package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (toX != robot.getX() || toY != robot.getY()) {
            if (toX < robot.getX()) {
                if (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
                if (robot.getDirection() == Direction.LEFT) {
                    robot.stepForward();
                }
            }
            if (toX > robot.getX()) {
                if (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
                if (robot.getDirection() == Direction.RIGHT) {
                    robot.stepForward();
                }
            }
            if (toX == robot.getX() && toY > robot.getY()) {
                if (robot.getDirection() != Direction.UP) {
                    robot.turnLeft();
                }
                if (robot.getDirection() == Direction.UP) {
                    robot.stepForward();
                }
            }
            if (toX == robot.getX() && toY < robot.getY()) {
                if (robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();
                }
                if (robot.getDirection() == Direction.DOWN) {
                    robot.stepForward();
                }
            }
            if (toX == robot.getX() && toY == robot.getY()) {
                break;
            }
        }
    }
}
