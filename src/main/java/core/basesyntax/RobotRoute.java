package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int x = toX - robot.getX();
        int y = toY - robot.getY();

        while (toX != robot.getX() || robot.getY() != toY) {
            if (toX != robot.getX()) {
                if (toX < robot.getX()) {
                    if (robot.getDirection() == Direction.UP) {
                        robot.turnLeft();
                    } else if (robot.getDirection() == Direction.DOWN) {
                        robot.turnRight();
                    }
                    if (robot.getDirection() == Direction.LEFT) {
                        for (int i = 0; i < Math.abs(x); i++) {
                            robot.stepForward();
                        }
                    }
                }
                if (toX > robot.getX()) {
                    if (robot.getDirection() == Direction.UP) {
                        robot.turnRight();
                    } else if (robot.getDirection() == Direction.DOWN) {
                        robot.turnLeft();
                    }
                    if (robot.getDirection() == Direction.RIGHT) {
                        for (int i = 0; i < Math.abs(x); i++) {
                            robot.stepForward();
                        }
                    }
                }
            }
            if (robot.getY() != toY) {
                if (toY > robot.getY()) {
                    if (robot.getDirection() == Direction.LEFT) {
                        robot.turnRight();
                    } else if (robot.getDirection() == Direction.RIGHT) {
                        robot.turnLeft();
                    }
                    if (robot.getDirection() == Direction.UP) {
                        for (int i = 0; i < Math.abs(y); i++) {
                            robot.stepForward();
                        }
                    }
                }
                if (toY < robot.getY()) {
                    if (robot.getDirection() == Direction.LEFT) {
                        robot.turnLeft();
                    } else if (robot.getDirection() == Direction.RIGHT) {
                        robot.turnRight();
                    }
                    if (robot.getDirection() == Direction.DOWN) {
                        for (int i = 0; i < Math.abs(y); i++) {
                            robot.stepForward();
                        }
                    }
                }
            }
        }
    }
}
