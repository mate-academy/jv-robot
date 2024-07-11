package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        if (currentX != toX) {
            if (currentX < toX) {
                faceDirection(robot, Direction.RIGHT);
            } else {
                faceDirection(robot, Direction.LEFT);
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (currentY != toY) {
            if (currentY < toY) {
                faceDirection(robot, Direction.UP);
            } else {
                faceDirection(robot, Direction.DOWN);
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }

    private void faceDirection(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
    }
}
