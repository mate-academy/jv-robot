package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        if (robot.getX() != toX) {
            if (robot.getX() > toX) {
                if (robot.getDirection() != Direction.LEFT) {
                    if (robot.getDirection() == Direction.UP) {
                        robot.turnLeft();
                    }
                    if (robot.getDirection() == Direction.DOWN) {
                        robot.turnRight();
                    }
                    if (robot.getDirection() == Direction.RIGHT) {
                        robot.turnRight();
                        robot.turnRight();
                    }
                }
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            }
            if (robot.getX() < toX) {
                if (robot.getDirection() != Direction.RIGHT) {
                    if (robot.getDirection() == Direction.UP) {
                        robot.turnRight();
                    }
                    if (robot.getDirection() == Direction.DOWN) {
                        robot.turnLeft();
                    }
                    if (robot.getDirection() == Direction.LEFT) {
                        robot.turnRight();
                        robot.turnRight();
                    }
                }
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            }
        }

        if (robot.getY() != toY) {
            if (robot.getY() > toY) {
                if (robot.getDirection() != Direction.DOWN) {
                    if (robot.getDirection() == Direction.LEFT) {
                        robot.turnLeft();
                    }
                    if (robot.getDirection() == Direction.RIGHT) {
                        robot.turnRight();
                    }
                    if (robot.getDirection() == Direction.UP) {
                        robot.turnRight();
                        robot.turnRight();
                    }
                }
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
            if (robot.getY() < toY) {
                if (robot.getDirection() != Direction.UP) {
                    if (robot.getDirection() == Direction.LEFT) {
                        robot.turnRight();
                    }
                    if (robot.getDirection() == Direction.RIGHT) {
                        robot.turnLeft();
                    }
                    if (robot.getDirection() == Direction.DOWN) {
                        robot.turnRight();
                        robot.turnRight();
                    }
                }
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        }
    }
}
