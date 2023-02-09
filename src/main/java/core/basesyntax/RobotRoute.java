package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction direct = robot.getDirection();
        if (robot.getX() > toX) {
            if (direct == Direction.UP) {
                robot.turnLeft();
            } else if (direct == Direction.DOWN) {
                robot.turnRight();
            } else if (direct == Direction.RIGHT) {
                robot.turnLeft();
                robot.turnLeft();
            }

        } else {
            if (direct == Direction.UP) {
                robot.turnRight();
            } else if (direct == Direction.DOWN) {
                robot.turnLeft();
            } else if (direct == Direction.LEFT) {
                robot.turnLeft();
                robot.turnLeft();
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }

        direct = robot.getDirection();
        if (robot.getY() > toY) {
            if (direct == Direction.UP) {
                robot.turnLeft();
                robot.turnLeft();
            } else if (direct == Direction.LEFT) {
                robot.turnLeft();
            } else if (direct == Direction.RIGHT) {
                robot.turnRight();
            }
        } else {
            if (direct == Direction.DOWN) {
                robot.turnRight();
                robot.turnRight();
            } else if (direct == Direction.RIGHT) {
                robot.turnLeft();
            } else if (direct == Direction.LEFT) {
                robot.turnRight();
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}

