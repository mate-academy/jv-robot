package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        goToCorrectX(robot, toX);
        goToCorrectY(robot, toY);
    }

    public void goToCorrectX(Robot robot, int toX) {
        if (toX < robot.getX()) {
            changeDirectionTo(Direction.LEFT, robot);
        } else {
            changeDirectionTo(Direction.RIGHT, robot);
        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }
    }

    public void goToCorrectY(Robot robot, int toY) {
        if (toY < robot.getY()) {
            changeDirectionTo(Direction.DOWN, robot);
        } else {
            changeDirectionTo(Direction.UP, robot);
        }
        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }

    public void changeDirectionTo(Direction corectDirection, Robot robot) {
        while (robot.getDirection() != corectDirection) {
            robot.turnLeft();
        }
    }
}

