package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
            }

            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
                robot.turnLeft();
            }

            if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
            }

            if (robot.getDirection() == Direction.LEFT) {
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            }
        }

        if (robot.getY() > toY) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
                robot.turnLeft();
            }

            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
                robot.turnLeft();
                robot.turnLeft();
            }

            if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
            }

            if (robot.getDirection() == Direction.DOWN) {
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        }

        if (robot.getX() < toX) {
            if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
            }

            if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
                robot.turnRight();
            }

            if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
            }

            if (robot.getDirection() == Direction.RIGHT) {
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            }
        }

        if (robot.getY() < toY) {
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
            }

            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
            }

            if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
                robot.turnLeft();
            }

            if (robot.getDirection() == Direction.UP) {
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        }
    }
}
