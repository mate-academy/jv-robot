package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int differenceX = toX - robot.getX();
        Boolean isNeedIncreaseX = differenceX >= 0;
        if (isNeedIncreaseX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            for (int i = robot.getX(); i < toX; i++) {
                robot.stepForward();
            }
        } else {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
            for (int i = robot.getX(); i > toX; i--) {
                robot.stepForward();
            }

        }
        int differenceY = toY - robot.getY();
        Boolean isNeedIncreaseY = differenceY >= 0;
        if (isNeedIncreaseY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            for (int i = robot.getY(); i < toY; i++) {
                robot.stepForward();
            }
        } else {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            for (int i = robot.getY(); i > toY; i--) {
                robot.stepForward();
            }
        }
    }
}
