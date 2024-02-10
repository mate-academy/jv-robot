package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX && robot.getY() < toY) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
            if (robot.getX() == toX) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        }
        if (robot.getX() > toX && robot.getY() < toY) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
            if (robot.getX() == toX) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        }
        if (robot.getX() < toX && robot.getY() > toY) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
            if (robot.getX() == toX) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();
                }
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        }
        if (robot.getX() > toX && robot.getY() > toY) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
            if (robot.getX() == toX) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();
                }
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        }
        if (robot.getX() > 0 && robot.getY() < 0 && toX > 0 && toY > 0) {
            // Move from second quadrant to first
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

    }
}
