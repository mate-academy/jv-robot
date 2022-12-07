package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getDirection() == Direction.UP) {
            robot.turnRight();
        }
        if (robot.getDirection() == Direction.DOWN) {
            robot.turnLeft();
        }
        if (robot.getDirection() == Direction.LEFT) {
            robot.turnLeft();
            robot.turnLeft();
        }
        for (int i = 0; robot.getX() == toX; i++) {
            if (toX > robot.getX()) {
                robot.stepForward();
            }
            if (toX < robot.getX()) {
                if (robot.getDirection() == Direction.LEFT) {
                    robot.stepForward();
                } else {
                    robot.turnLeft();
                    robot.turnLeft();
                }
            }
        }
        if (robot.getDirection() == Direction.LEFT) {
            robot.turnLeft();
        }
        if (robot.getDirection() == Direction.RIGHT) {
            robot.turnRight();
        }
        for (int i = 0; robot.getY() == toY; i++) {
            if (toY < robot.getY()) {
                robot.stepForward();
            }
            if (toY > robot.getY()) {
                if (robot.getDirection() == Direction.UP) {
                    robot.stepForward();
                } else {
                    robot.turnLeft();
                    robot.turnLeft();
                }
            }
        }
    }
}
