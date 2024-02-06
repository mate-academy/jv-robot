package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        Direction directionX = currentX < toX ? Direction.RIGHT : Direction.LEFT;
        Direction directionY = currentY < toY ? Direction.UP : Direction.DOWN;

        while (robot.getDirection() != directionX) {
            if (robot.getDirection() == Direction.UP || robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
            } else {
                robot.turnRight();
            }
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }

        while (robot.getDirection() != directionY) {
            if (robot.getDirection() == Direction.RIGHT || robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
            } else {
                robot.turnRight();
            }
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
