
package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        Direction directionX = robot.getX() > toX ? Direction.LEFT : Direction.RIGHT;
        Direction directionY = robot.getY() > toY ? Direction.DOWN : Direction.UP;
        if (robot.getX() != toX) {
            if (robot.getDirection() == directionX) {
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            } else {
                if (robot.getDirection() == Direction.DOWN) {
                    if (directionX == Direction.LEFT) {
                        robot.turnRight();
                        while (robot.getX() != toX) {
                            robot.stepForward();
                        }
                    }
                } else {
                    while (directionX != robot.getDirection()) {
                        robot.turnLeft();
                    }
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                }
            }
        }
        if (robot.getY() != toY) {
            if (robot.getDirection() == directionY) {
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            } else {
                if (robot.getDirection() == Direction.LEFT) {
                    if (directionY == Direction.DOWN) {
                        robot.turnLeft();
                        while (robot.getY() != toY) {
                            robot.stepForward();
                        }
                    } else {
                        while (robot.getDirection() != directionY) {
                            robot.turnRight();
                        }
                        while (robot.getY() != toY) {
                            robot.stepForward();
                        }
                    }

                } else {
                    while (robot.getDirection() != directionY) {
                        robot.turnRight();
                    }
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                }
            }
        }
    }
}
