package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        changeDirectionForCoordinateX(robot,toX);
        int numberOfStepsToX = toX - robot.getX();
        for (int i = 0; i < Math.abs(numberOfStepsToX); i++) {
            robot.stepForward();
        }
        changeDirectionForCoordinateY(robot, toY);
        int numberOfStepsToY = toY - robot.getY();
        for (int i = 0; i < Math.abs(numberOfStepsToY); i++) {
            robot.stepForward();
        }
    }

    public void changeDirectionForCoordinateX(Robot robot, int toX) {
        if (robot.getX() < toX) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
                robot.turnLeft();
            }
        }
        if (robot.getX() > toX) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
                robot.turnLeft();
            }
        }
    }

    public void changeDirectionForCoordinateY(Robot robot, int toY) {
        if (robot.getY() > toY) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
                robot.turnRight();
            } else if (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
            }
        }
        if (robot.getY() < toY) {
            if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
            }
        }
    }
}
