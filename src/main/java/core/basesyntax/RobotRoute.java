package core.basesyntax;

public class RobotRoute {
    private Robot robot;
    private int toX;
    private int toY;

    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution her
        this.robot = robot;
        this.toX = toX;
        this.toY = toY;
        Direction dirX = getDirX();
        Direction dirY = getDirY();
        turnRobot(dirX);
        moveForvardX(toX);
        turnRobot(dirY);
        moveForvardY(toY);

    }

    private Direction getDirX() {
        if (this.robot.getX() > toX) {
            return Direction.LEFT;
        }
        if (this.robot.getX() < toX) {
            return Direction.RIGHT;
        }
        return this.robot.getDirection();
    }

    private Direction getDirY() {
        if (this.robot.getY() > toY) {
            return Direction.DOWN;
        }
        if (this.robot.getY() < toY) {
            return Direction.UP;
        }
        return this.robot.getDirection();
    }

    private void turnRobot(Direction direction) {
        while (this.robot.getDirection() != direction) {
            robot.turnLeft();
        }
    }

    private void moveForvardX(int to) {
        while (this.robot.getX() != toX) {
            robot.stepForward();
        }
    }

    private void moveForvardY(int to) {
        while (this.robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
