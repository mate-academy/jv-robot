package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        // ося X
        while (robot.getX() != toX) {
            if (robot.getX() < toX) {
                faceDirection(robot, Direction.RIGHT);
            } else {
                faceDirection(robot, Direction.LEFT);
            }
            robot.stepForward();
        }

        // Ося Y
        while (robot.getY() != toY) {
            if (robot.getY() < toY) {
                faceDirection(robot, Direction.UP);
            } else {
                faceDirection(robot, Direction.DOWN);
            }
            robot.stepForward();
        }
    }

    private void faceDirection(Robot robot, Direction target) {
        while (robot.getDirection() != target) {
            robot.turnRight();
        }
    }
}
