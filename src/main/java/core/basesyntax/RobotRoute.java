package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        Direction directionX = currentX < toX ? Direction.RIGHT : Direction.LEFT;
        Direction directionY = currentY < toY ? Direction.UP : Direction.DOWN;

        while (currentX != toX || currentY != toY) {
            if (currentX != toX) {
                while (robot.getDirection() != directionX) {
                    robot.turnRight();
                }
                robot.stepForward();
                currentX = robot.getX();
            }

            if (currentY != toY) {
                while (robot.getDirection() != directionY) {
                    robot.turnRight();
                }
                robot.stepForward();
                currentY = robot.getY();
            }
        }
    }
}
