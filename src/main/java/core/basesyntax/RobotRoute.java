package core.basesyntax;

public class RobotRoute {

    private void turnToTarget(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnLeft();
        }
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here

        while (robot.getX() != toX) {
            if (robot.getX() > toX) {
                turnToTarget(robot, Direction.LEFT);
            } else {
                turnToTarget(robot, Direction.RIGHT);
            }
            robot.stepForward();
        }

        while (robot.getY() != toY) {
            if (robot.getY() > toY) {
                turnToTarget(robot, Direction.DOWN);;
            } else {
                turnToTarget(robot, Direction.UP);;
            }
            robot.stepForward();
        }
    }
}
