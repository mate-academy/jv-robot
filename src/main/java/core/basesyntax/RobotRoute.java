package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() != toX) {
            if (robot.getX() > toX) {
                if (robot.getDirection() != Direction.LEFT) {
                    while (robot.getDirection() != Direction.LEFT) {
                        robot.turnLeft();
                    }
                }
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            } else {
                if (robot.getDirection() != Direction.RIGHT) {
                    while (robot.getDirection() != Direction.RIGHT) {
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
                    while (robot.getDirection() != Direction.DOWN) {
                        robot.turnLeft();
                    }
                }
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            } else {
                if (robot.getDirection() != Direction.UP) {
                    while (robot.getDirection() != Direction.UP) {
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
