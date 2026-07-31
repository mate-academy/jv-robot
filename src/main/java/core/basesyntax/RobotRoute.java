package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {

        int deltaX = toX - robot.getX();
        int deltaY = toY - robot.getY();

        // Рух робота по осі X
        moveAlongAxis(robot, deltaX, Direction.RIGHT, Direction.LEFT);

        // Рух робота по осі Y
        moveAlongAxis(robot, deltaY, Direction.UP, Direction.DOWN);
    }

    private void moveAlongAxis(Robot robot, int steps, Direction positive, Direction negative) {
        Direction targetDirection = (steps > 0) ? positive : negative;

        while (robot.getDirection() != targetDirection) {
            if (steps > 0) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
        }

        for (int i = 0; i < Math.abs(steps); i++) {
            robot.stepForward();
        }
    }
}

