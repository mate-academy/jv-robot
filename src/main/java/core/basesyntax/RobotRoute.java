package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Robot robot1 = robot;
        if (toX < 0) {
            while (robot1.getDirection() != Direction.LEFT) {
                robot1.turnLeft();
            }
            while (robot1.getX() != toX) {
                robot1.stepForward();
            }
        }
        if (toX > 0) {
            while (robot1.getDirection() != Direction.RIGHT) {
                robot1.turnRight();
            }
            while (robot1.getX() != toX) {
                robot1.stepForward();
            }
        }
        if (toY < 0) {
            while (robot1.getDirection() != Direction.DOWN) {
                robot1.turnLeft();
            }
            while (robot1.getY() != toY) {
                robot1.stepForward();
            }
        }
        if (toY > 0) {
            while (robot1.getDirection() != Direction.UP) {
                robot1.turnRight();
            }
            while (robot1.getY() != toY) {
                robot1.stepForward();
            }
        }
    }
}
