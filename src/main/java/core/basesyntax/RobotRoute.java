package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            if (toX > robot.getX()) {
                if (robot.getDirection() == Direction.RIGHT) {
                    robot.stepForward();
                } else {
                    robot.turnRight();
                }
            } else {
                if (robot.getDirection() == Direction.LEFT) {
                    robot.stepForward();
                } else {
                    robot.turnLeft();
                }
            }
        }

        while (robot.getY() != toY) {
            if (toY > robot.getY()) {
                if (robot.getDirection() == Direction.UP) {
                    robot.stepForward();
                } else {
                    robot.turnRight();
                }
            } else {
                if (robot.getDirection() == Direction.DOWN) {
                    robot.stepForward();
                } else {
                    robot.turnLeft();
                }
            }
        }
    }
}
