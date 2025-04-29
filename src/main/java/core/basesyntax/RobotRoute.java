package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        // test code, review is not needed

        while (robot.getX() != toX) {
            if (robot.getX() > toX) {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
                robot.stepForward();
            }
            if (robot.getX() < toX) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
                robot.stepForward();
            }
        }
        while (robot.getY() != toY) {
            if (robot.getY() > toY) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();
                }
                robot.stepForward();
            }
            if (robot.getY() < toY) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnLeft();
                }
                robot.stepForward();
            }
        }
    }
}
