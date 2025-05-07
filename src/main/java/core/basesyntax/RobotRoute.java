package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            if (robot.getX() < toX && robot.getDirection() != Direction.RIGHT) {
                while (robot.getDirection() != Direction.RIGHT) {
                    if (robot.getDirection() == Direction.UP) {
                        robot.turnRight();
                    } else {
                        robot.turnRight();
                    }
                }
            }
            if (robot.getX() > toX && robot.getDirection() != Direction.LEFT) {
                while (robot.getDirection() != Direction.LEFT) {
                    if (robot.getDirection() == Direction.UP) {
                        robot.turnLeft();
                    } else {
                        robot.turnRight();
                    }
                }
            }
            robot.stepForward();
        }
        while (robot.getY() != toY) {
            if (robot.getY() < toY && robot.getDirection() != Direction.UP) {
                while (robot.getDirection() != Direction.UP) {
                    if (robot.getDirection() == Direction.LEFT) {
                        robot.turnRight();
                    } else {
                        robot.turnLeft();
                    }
                }
            }
            if (robot.getY() > toY && robot.getDirection() != Direction.DOWN) {
                while (robot.getDirection() != Direction.DOWN) {
                    if (robot.getDirection() == Direction.LEFT) {
                        robot.turnLeft();
                    } else {
                        robot.turnLeft();
                    }
                }
            }
            robot.stepForward();
        }
    }
}
