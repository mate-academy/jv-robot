package core.basesyntax;

public class RobotRoute {
    private Robot robot;
    private int toX;
    private int toY;

    public void moveRobot(Robot robot, int toX, int toY) {
        this.robot = robot;
        this.toX = toX;
        this.toY = toY;
        Direction directionX = getDirectionX();
        Direction directionY = getDirectionY();
        turnRobot(directionX);
        moveToX();
        turnRobot(directionY);
        moveToY();
    }

    private Direction getDirectionX() {
        return this.robot.getX() - this.toX < 0 ? Direction.RIGHT : Direction.LEFT;
    }

    private Direction getDirectionY() {
        return this.robot.getY() - this.toY < 0 ? Direction.UP : Direction.DOWN;
    }

    private void turnRobot(Direction direction) {
        while (this.robot.getDirection() != direction) {
            this.robot.turnRight();
        }
    }

    private void moveToX() {
        while (this.robot.getX() != toX) {
            this.robot.stepForward();
        }
    }

    private void moveToY() {
        while (this.robot.getY() != toY) {
            this.robot.stepForward();
        }
    }
}
