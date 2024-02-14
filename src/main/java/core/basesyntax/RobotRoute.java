package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int diffX = toX - robot.getX();
        int diffY = toY - robot.getY();

        if (diffX == 0 && diffY == 0) {
            return;
        }

        if (diffX > 0) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        } else {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }

        if (diffY > 0) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        } else {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
