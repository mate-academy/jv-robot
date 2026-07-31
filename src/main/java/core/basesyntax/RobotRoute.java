package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            if (robot.getX() > toX) {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
            } else if (robot.getX() < toX) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnLeft();
                }
            }
            robot.stepForward();
        }
        while (robot.getY() != toY) {
            if (robot.getY() > toY) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
            } else if (robot.getY() < toY) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnLeft();
                }
            }
            robot.stepForward();
        }
    }
}
