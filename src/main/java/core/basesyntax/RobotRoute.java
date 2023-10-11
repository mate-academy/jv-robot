package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();

        if (x != toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (x < toX) {
                robot.stepForward();
                x++;
            }
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
            while (x > toX) {
                robot.stepForward();
                x--;
            }
        }

        if (y != toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (y < toY) {
                robot.stepForward();
                y++;
            }
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            while (y > toY) {
                robot.stepForward();
                y--;
            }
        }
    }
}

