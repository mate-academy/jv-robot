package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            if ((toX - robot.getX()) > 0) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
            } else if ((toX - robot.getX()) < 0) {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
            }
            robot.stepForward();
        }

        while (robot.getY() != toY) {
            if ((toY - robot.getY()) > 0) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
            } else if ((toY - robot.getY()) < 0) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
            }
            robot.stepForward();
        }
    }
}
