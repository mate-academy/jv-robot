package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            if (robot.getDirection().equals(Direction.UP)) {
                robot.turnRight();
            } else {
                if (robot.getDirection().equals(Direction.DOWN)) {
                    robot.turnLeft();
                } else {
                    if (robot.getDirection().equals(Direction.LEFT)) {
                        robot.turnLeft();
                        robot.turnLeft();
                    }
                }
            }

        } else {
            if (robot.getDirection().equals(Direction.UP)) {
                robot.turnLeft();
            } else {
                if (robot.getDirection().equals(Direction.DOWN)) {
                    robot.turnRight();
                } else {
                    if (robot.getDirection().equals(Direction.RIGHT)) {
                        robot.turnLeft();
                        robot.turnLeft();
                    }
                }
            }

        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        if (robot.getY() < toY) {
            if (robot.getDirection().equals(Direction.LEFT)) {
                robot.turnRight();
            } else {
                if (robot.getDirection().equals(Direction.RIGHT)) {
                    robot.turnLeft();
                } else {
                    if (robot.getDirection().equals(Direction.DOWN)) {
                        robot.turnLeft();
                        robot.turnLeft();
                    }
                }
            }

        } else {
            if (robot.getDirection().equals(Direction.LEFT)) {
                robot.turnLeft();
            } else {
                if (robot.getDirection().equals(Direction.RIGHT)) {
                    robot.turnRight();
                } else {
                    if (robot.getDirection().equals(Direction.UP)) {
                        robot.turnLeft();
                        robot.turnLeft();
                    }
                }
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }

    }
}
