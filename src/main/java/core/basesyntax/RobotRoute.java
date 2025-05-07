package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction currentDirection = robot.getDirection();
        int robotX = robot.getX();
        int robotY = robot.getY();

        int stepToX = toX - robotX;
        int stepToY = toY - robotY;

        if (stepToX != 0) {
            Direction targetDirection = (stepToX > 0) ? Direction.RIGHT : Direction.LEFT;
            while (currentDirection != targetDirection) {
                robot.turnRight();
                currentDirection = robot.getDirection();
            }
            for (int i = 0; i < Math.abs(stepToX); i++) {
                robot.stepForward();
            }
        }

        if (stepToY != 0) {
            Direction targetDirection = (stepToY > 0) ? Direction.UP : Direction.DOWN;
            while (currentDirection != targetDirection) {
                robot.turnLeft();
                currentDirection = robot.getDirection();
            }
            for (int i = 0; i < Math.abs(stepToY); i++) {
                robot.stepForward();
            }
        }
    }
}
