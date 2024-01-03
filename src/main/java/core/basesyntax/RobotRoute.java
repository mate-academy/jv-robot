package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        Direction targetDirection1 = (currentX < toX) ? Direction.RIGHT : Direction.LEFT;
        while (robot.getX() != toX && robot.getDirection() != targetDirection1) {
            if (targetDirection1 == Direction.RIGHT) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
            robot.stepForward();
        }

        int currentX = robot.getY();
        Direction targetDirection2 = (currentY < toY) ? Direction.UP : Direction.DOWN;
        while (robot.getY() != toY && robot.getDirection() != targetDirection2) {
            if (targetDirection2 == Direction.RIGHT) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
            robot.stepForward();
        }
    }
}
