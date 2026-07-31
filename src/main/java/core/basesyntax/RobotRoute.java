package core.basesyntax;

public class RobotRoute {
    private static final int two = 2;

    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX || robot.getY() != toY) {
            if (robot.getX() < toX) {
                if (robot.getDirection() == Direction.UP) {
                    robot.turnRight();
                }

                if (robot.getDirection() == Direction.DOWN) {
                    robot.turnLeft();
                }

                if (robot.getDirection() == Direction.LEFT) {
                    for (int i = 0; i < two; i++) {
                        robot.turnRight();
                    }
                }

                robot.stepForward();
            }

            if (robot.getX() > toX) {
                if (robot.getDirection() == Direction.UP) {
                    robot.turnLeft();
                }

                if (robot.getDirection() == Direction.DOWN) {
                    robot.turnRight();
                }

                if (robot.getDirection() == Direction.RIGHT) {
                    for (int i = 0; i < two; i++) {
                        robot.turnRight();
                    }
                }

                robot.stepForward();
            }

            if (robot.getY() < toY) {
                if (robot.getDirection() == Direction.RIGHT) {
                    robot.turnLeft();
                }

                if (robot.getDirection() == Direction.LEFT) {
                    robot.turnRight();
                }

                if (robot.getDirection() == Direction.DOWN) {
                    for (int i = 0; i < two; i++) {
                        robot.turnRight();
                    }
                }

                robot.stepForward();
            }

            if (robot.getY() > toY) {
                if (robot.getDirection() == Direction.RIGHT) {
                    robot.turnRight();
                }

                if (robot.getDirection() == Direction.LEFT) {
                    robot.turnLeft();
                }

                if (robot.getDirection() == Direction.UP) {
                    for (int i = 0; i < two; i++) {
                        robot.turnRight();
                    }
                }

                robot.stepForward();
            }
        }
    }
}
