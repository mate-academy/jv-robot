package core.basesyntax;

public class RobotRoute {
    private void turnToDirection(Robot robot, Direction target) {
        while (robot.getDirection() != target) {
            robot.turnRight();
        }
    }
    
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            turnToDirection(robot, Direction.RIGHT);
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        } else if (robot.getX() > toX) {
            turnToDirection(robot, Direction.LEFT);
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }
        if (robot.getY() < toY) {
            turnToDirection(robot, Direction.UP);
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        } else if (robot.getY() > toY) {
            turnToDirection(robot, Direction.DOWN);
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }
}
