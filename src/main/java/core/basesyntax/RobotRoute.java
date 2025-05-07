package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() == toX && robot.getY() == toY) {
            return;
        }

        if (toX - robot.getX() < 0) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        } else if (toX - robot.getX() > 0) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            }
        }

        do {
            robot.stepForward();
        } while (robot.getX() != toX);

        if (toY - robot.getY() < 0) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        } else if (toY - robot.getY() > 0) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
        }

        do {
            robot.stepForward();
        } while (robot.getY() != toY);
    }
}
