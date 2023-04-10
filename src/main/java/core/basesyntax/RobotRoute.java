package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction initialDirection = robot.getDirection();
        while (robot.getDirection() != Direction.UP) {
            robot.turnLeft();
        }

        // Move the robot to the correct x-coordinate
        while (robot.getX() != toX) {
            if (robot.getX() < toX) {
                if (robot.getDirection() == initialDirection) {
                    robot.stepForward();
                } else {
                    robot.turnRight();
                }
            } else {
                if (robot.getDirection() == initialDirection) {
                    robot.stepForward();
                } else {
                    robot.turnLeft();
                }
            }
        }

        // Move the robot to the correct y-coordinate
        while (robot.getY() != toY) {
            if (robot.getY() < toY) {
                if (initialDirection == Direction.UP) {
                    robot.stepForward();
                } else if (initialDirection == Direction.LEFT) {
                    robot.turnRight();
                    robot.stepForward();
                    robot.turnLeft();
                } else if (initialDirection == Direction.RIGHT) {
                    robot.turnLeft();
                    robot.stepForward();
                    robot.turnRight();
                }
            } else {
                if (initialDirection == Direction.UP) {
                    robot.turnLeft();} else if (initialDirection == Direction.LEFT) {
                    robot.turnLeft();
                    robot.stepForward();
                    robot.turnRight();
                } else if (initialDirection == Direction.RIGHT) {
                    robot.turnRight();
                    robot.stepForward();
                    robot.turnLeft();
                }
            }
        }
    }
}