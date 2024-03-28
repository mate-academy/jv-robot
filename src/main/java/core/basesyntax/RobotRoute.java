package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        int diffX = toX - currentX;
        int diffY = toY - currentY;

        Direction targetDirectionX = diffX > 0 ? Direction.RIGHT : Direction.LEFT;
        Direction targetDirectionY = diffY > 0 ? Direction.UP : Direction.DOWN;

        while (robot.getDirection() != targetDirectionX) {
            if (robot.getDirection() == Direction.UP || robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }

        while (robot.getDirection() != targetDirectionY) {
            if (robot.getDirection() == Direction.RIGHT || robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
