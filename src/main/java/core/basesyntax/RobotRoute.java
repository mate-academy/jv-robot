package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        turnToX(robot, toX);
        moveToX(robot, toX);
        turnToY(robot, toY);
        moveToY(robot, toY);
    }

    private void turnToX(Robot robot, int toX) {
        if (robot.getDirection().equals(Direction.UP)
                || robot.getDirection().equals(Direction.DOWN)) {
            robot.turnRight();
        }
        if (robot.getX() < toX
                && robot.getDirection().equals(Direction.LEFT)) {
            turn180(robot);
            return;
        }
        if (robot.getX() > toX
                && robot.getDirection().equals(Direction.RIGHT)) {
            turn180(robot);
        }
    }

    private void moveToX(Robot robot, int toX) {
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    private void turnToY(Robot robot, int toY) {
        if (robot.getDirection().equals(Direction.RIGHT)
                || robot.getDirection().equals(Direction.LEFT)) {
            robot.turnRight();
        }
        if (robot.getY() < toY
                && robot.getDirection().equals(Direction.DOWN)) {
            turn180(robot);
        }
        if (robot.getY() > toY
                && robot.getDirection().equals(Direction.UP)) {
            turn180(robot);
        }
    }

    private void moveToY(Robot robot, int toY) {
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void turn180(Robot robot) {
        robot.turnRight();
        robot.turnRight();
    }
}
