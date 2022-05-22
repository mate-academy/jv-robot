package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            lookLeft(robot);
        } else if (robot.getX() < toX) {
            lookRight(robot);
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        if (robot.getY() > toY) {
            lookDown(robot);
        } else if (robot.getY() < toY) {
            lookUp(robot);
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void lookLeft(Robot robot) {
        while (!robot.getDirection().equals(Direction.LEFT)) {
            robot.turnLeft();
        }
    }

    private void lookRight(Robot robot) {
        while (!robot.getDirection().equals(Direction.RIGHT)) {
            robot.turnRight();
        }
    }

    private void lookUp(Robot robot) {
        while (!robot.getDirection().equals(Direction.DOWN)) {
            robot.turnLeft();
        }
    }

    private void lookDown(Robot robot) {
        while (!robot.getDirection().equals(Direction.UP)) {
            robot.turnRight();
        }
    }
}
