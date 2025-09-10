package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        while (robot.getX() != toX) {
            if (robot.getY() < toX) {
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

    private void faceDirection(Robot robot, Direction target) {
        while (robot.getDirection() != target) {
            robot.turnRight();
        }
    }
}
