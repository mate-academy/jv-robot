package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        // if I must used all methods RobotRoute class
        while (robot.getX() != toX) {
            if (robot.getX() > toX) {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
            } else {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
            }
            robot.stepForward();
        }
        // if I don't use all available methods, but create setter setDirection for robot
        while (robot.getY() != toY) {
            if (robot.getY() > toY) {
                robot.setDirection(Direction.DOWN);
            } else {
                robot.setDirection(Direction.UP);
            }
            robot.stepForward();
        }
    }
}
