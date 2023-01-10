package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while ((robot.getDirection() != Direction.RIGHT && robot.getX() < toX)
                || (robot.getDirection() != Direction.LEFT && robot.getX() > toX)) {
            robot.turnRight();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        while ((robot.getDirection() != Direction.UP && robot.getY() < toY)
                || (robot.getDirection()) != Direction.DOWN && robot.getY() > toY) {
            robot.turnRight();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
