package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() != toX) {
            while (!(robot.getDirection().equals(checkDirectionX(robot.getX(), toX)))) {
                robot.turnLeft();
            }
            goToX(toX, robot);
        }
        if (robot.getY() != toY) {
            while (!(robot.getDirection().equals(checkDirectionY(robot.getY(), toY)))) {
                robot.turnLeft();
            }
            goToY(toY, robot);
        }
    }

    private void goToX(int destination, Robot robot) {
        while (!(robot.getX() == destination)) {
            robot.stepForward();
        }
    }

    private void goToY(int destination, Robot robot) {
        while (!(robot.getY() == destination)) {
            robot.stepForward();
        }
    }

    private Direction checkDirectionX(int x, int toX) {
        if (x < toX) {
            return Direction.RIGHT;
        } else {
            return Direction.LEFT;
        }
    }

    private Direction checkDirectionY(int y, int toY) {
        if (y < toY) {
            return Direction.UP;
        } else {
            return Direction.DOWN;
        }
    }
}
