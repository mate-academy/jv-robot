package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
            followX(robot, toX);
            if (toY >= robot.getY()) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
            followY(robot, toY);
        }
        if (toX > robot.getX()) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            followX(robot, toX);
            if (toY >= robot.getY()) {
                robot.turnLeft();
            } else {
                robot.turnRight();
            }
            followY(robot, toY);
        }
        if (toX == robot.getX()) {
            if (toY > robot.getY()) {
                if (!robot.getDirection().equals(Direction.UP)) {
                    while (robot.getDirection() != Direction.UP) {
                        robot.turnRight();
                    }
                }
                followY(robot, toY);
            } else if (toY < robot.getY()) {
                if (!robot.getDirection().equals(Direction.DOWN)) {
                    while (robot.getDirection() != Direction.UP) {
                        robot.turnRight();
                    }
                }
                followY(robot, toY);
            }
        }
    }

    public void followY(Robot robot, int toY) {
        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }

    public void followX(Robot robot, int toX) {
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }
}
