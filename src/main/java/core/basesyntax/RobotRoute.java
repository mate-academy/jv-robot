package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            if (robot.getX() < toX) {
                faceDirection(robot, Direction.RIGHT);
            } else {
                faceDirection(robot, Direction.LEFT);
            }
            robot.stepForward();
        }

        while (robot.getY() != toY) {
            if (robot.getY() < toY) {
                faceDirection(robot, Direction.UP);
            } else {
                faceDirection(robot, Direction.DOWN);
            }
            robot.stepForward();
        }
    }

    private void faceDirection(Robot robot, Direction targetDirection) {
        Direction currentDirection = robot.getDirection();

        while (currentDirection != targetDirection) {
            robot.turnRight();
            currentDirection = robot.getDirection();
        }
    }
}

