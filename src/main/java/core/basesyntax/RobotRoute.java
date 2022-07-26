package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        Direction left = Direction.LEFT;
        Direction right = Direction.RIGHT;
        Direction up = Direction.UP;
        Direction down = Direction.DOWN;

        if (robot.getX() < toX) {
            while (robot.getDirection() != right) {
                robot.turnRight();
            }
        } else {
            while (robot.getDirection() != left) {
                robot.turnLeft();
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        if (robot.getY() < toY) {
            while (robot.getDirection() != up) {
                robot.turnRight();
            }
        } else {
            while (robot.getDirection() != down) {
                robot.turnLeft();
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
