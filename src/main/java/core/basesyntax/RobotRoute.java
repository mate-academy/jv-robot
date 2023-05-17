package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            Direction left = Direction.LEFT;
            while (robot.getDirection() != left) {
                robot.turnLeft();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        } else if (robot.getX() < toX) {
            Direction right = Direction.RIGHT;
            while (robot.getDirection() != right) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }
        if (robot.getY() > toY) {
            Direction down = Direction.DOWN;
            while (robot.getDirection() != down) {
                robot.turnLeft();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        } else if (robot.getY() < toY) {
            Direction up = Direction.UP;
            while (robot.getDirection() != up) {
                robot.turnRight();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }
}
