package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int differenceX = toX - robot.getX();
        int differenceY = toY - robot.getY();
        if (differenceX >= 0 && differenceY >= 0) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
                robot.turnRight();
            }
        } else if (differenceX <= 0 && differenceY <= 0) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
                robot.turnRight();
            }
        } else if (differenceX >= 0 && differenceY <= 0) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
                robot.turnRight();
            }
        } else if (differenceX <= 0 && differenceY >= 0) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
                robot.turnRight();
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        if ((robot.getDirection() == Direction.LEFT && differenceY >= 0)
                || (robot.getDirection() == Direction.RIGHT && differenceY <= 0)) {
            robot.turnRight();
        } else {
            robot.turnLeft();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
