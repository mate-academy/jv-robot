package core.basesyntax;

public class RobotRoute {

    private static void rotateRobotTo(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnLeft();
        }
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here -3 -2 -1 0 1 2 3
        if (robot.getX() < toX) {
            rotateRobotTo(robot, Direction.RIGHT);
        } else {
            rotateRobotTo(robot, Direction.LEFT);
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }

        if (robot.getY() < toY) {
            rotateRobotTo(robot, Direction.UP);
        } else {
            rotateRobotTo(robot, Direction.DOWN);
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
