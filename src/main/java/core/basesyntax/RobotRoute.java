package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int deltaX = toX - robot.getX();
        int deltaY = toY - robot.getY();

        if (deltaX != 0) {
            Direction targetDirectionX = (deltaX > 0) ? Direction.RIGHT : Direction.LEFT;
            turnRobotToDirection(robot, targetDirectionX);
            for (int i = 0; i < Math.abs(deltaX); i++) {
                robot.stepForward();
            }
        }

        if (deltaY != 0) {
            Direction targetDirectionY = (deltaY > 0) ? Direction.UP : Direction.DOWN;
            turnRobotToDirection(robot, targetDirectionY);
            for (int i = 0; i < Math.abs(deltaY); i++) {
                robot.stepForward();
            }
        }
    }

    private void turnRobotToDirection(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight(); 
        }
    }
}
