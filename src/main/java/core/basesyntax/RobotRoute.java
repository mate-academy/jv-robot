package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            if (robot.getX() > toX) {
                if (robot.getDirection() != Direction.DOWN) {
                    while (robot.getDirection() != Direction.LEFT) {
                        robot.turnLeft();
                    }
                } else {
                    robot.turnRight();
                }
                robot.stepForward();
            } else {
                if (robot.getDirection() != Direction.UP) {
                    while (robot.getDirection() != Direction.RIGHT) {
                        robot.turnLeft();
                    }
                } else {
                    robot.turnRight();
                }
                robot.stepForward();
            }

        }

        while (robot.getY() != toY) {
            if (robot.getY() > toY) {
                if (robot.getDirection() != Direction.RIGHT) {
                    while (robot.getDirection() != Direction.DOWN) {
                        robot.turnLeft();
                    }
                } else {
                    robot.turnRight();
                }
                robot.stepForward();
            } else {
                if (robot.getDirection() != Direction.LEFT) {
                    while (robot.getDirection() != Direction.UP) {
                        robot.turnLeft();
                    }
                } else {
                    robot.turnRight();
                }
                robot.stepForward();
            }

        }
    }
}
