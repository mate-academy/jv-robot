package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        checkDirectionX(robot, toX);
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        checkDirectionY(robot, toY);
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void checkDirectionX(Robot robot, int toX) {
        if (robot.getX() > toX) {
            while (!robot.getDirection().equals(Direction.LEFT)) {
                robot.turnLeft();
            }
        } else if (robot.getX() < toX) {
            while (!robot.getDirection().equals(Direction.RIGHT)) {
                robot.turnRight();
            }
        }
    }

    private void checkDirectionY(Robot robot, int toY) {
        if (robot.getY() > toY) {
            while (!robot.getDirection().equals(Direction.DOWN)) {
                robot.turnLeft();
            }
        } else if (robot.getY() < toY) {
            while (!robot.getDirection().equals(Direction.UP)) {
                robot.turnRight();
            }
        }
    }
}
