package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        // set direction along x-axis
        if (robot.getX() > toX) {
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
            }
        } else if (robot.getX() < toX) {
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }

        // set direction along y-axis
        if (robot.getY() > toY) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
            }
        } else if (robot.getY() < toY) {
            if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
