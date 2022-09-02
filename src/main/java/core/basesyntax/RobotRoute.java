package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();
        if (toX > robot.getX()) {
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
            }
            while (toX != x) {
                robot.stepForward();
                x--;
            }
        } else {
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
            }
            while (toX != x) {
                robot.stepForward();
                x++;
            }
        }
        if (toY < robot.getY()) {
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
            while (toY != y) {
                robot.stepForward();
                y--;
            }
        } else {
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
            } else {
                robot.turnRight();
            }
            while (toY != y) {
                robot.stepForward();
                y++;
            }
        }
    }
}
