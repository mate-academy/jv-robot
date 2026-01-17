package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        do {
            if (robot.getX() < toX) {
                moveOneStepTo(robot, Direction.RIGHT);
            }

            if (robot.getX() > toX) {
                moveOneStepTo(robot, Direction.LEFT);
            }

        } while (robot.getX() != toX);

        do {
            if (robot.getY() < toY) {
                moveOneStepTo(robot, Direction.UP);
            }

            if (robot.getY() > toY) {
                moveOneStepTo(robot, Direction.DOWN);
            }
        } while (robot.getY() != toY);
    }

    public void moveOneStepTo(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
        robot.stepForward();
    }
}
