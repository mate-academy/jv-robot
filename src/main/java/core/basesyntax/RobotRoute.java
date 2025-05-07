package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            }
        }
        int x = robot.getX();
        while (x != toX) {
            robot.stepForward();
            x = robot.getX();
        }
        if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        } else {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        }
        int y = robot.getY();
        while (y != toY) {
            robot.stepForward();
            y = robot.getY();
        }
    }
}
