package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() != toX) {
            if (robot.getX() < toX) {
                faceDirection(robot, Direction.RIGHT);
            } else {
                faceDirection(robot, Direction.LEFT);
            }

            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (robot.getY() != toY) {
            if (robot.getY() < toY) {
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
