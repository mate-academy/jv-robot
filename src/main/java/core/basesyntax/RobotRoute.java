package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            if (robot.getX() > toX) {
                if (robot.getDirection() != Direction.LEFT) {
                    if (robot.getDirection() == Direction.UP) {
                        robot.turnLeft();
                    } else if (robot.getDirection() == Direction.DOWN) {
                        robot.turnRight();
                    } else {
                        robot.turnLeft();
                        robot.turnLeft();
                    }
                }
            } else {
                if (robot.getDirection() != Direction.RIGHT) {
                    if (robot.getDirection() == Direction.UP) {
                        robot.turnRight();
                    } else if (robot.getDirection() == Direction.DOWN) {
                        robot.turnLeft();
                    } else {
                        robot.turnLeft();
                        robot.turnLeft();
                    }
                }
            }
            robot.stepForward();
        }

        while (robot.getY() != toY) {
            if (robot.getY() > toY) {
                if (robot.getDirection() != Direction.DOWN) {
                    if (robot.getDirection() == Direction.LEFT) {
                        robot.turnLeft();
                    } else if (robot.getDirection() == Direction.RIGHT) {
                        robot.turnRight();
                    } else {
                        robot.turnLeft();
                        robot.turnLeft();
                    }
                }
            } else {
                if (robot.getDirection() != Direction.UP) {
                    if (robot.getDirection() == Direction.RIGHT) {
                        robot.turnLeft();
                    } else if (robot.getDirection() == Direction.LEFT) {
                        robot.turnRight();
                    } else {
                        robot.turnLeft();
                        robot.turnLeft();
                    }
                }
            }
            robot.stepForward();
        }
    }
}
