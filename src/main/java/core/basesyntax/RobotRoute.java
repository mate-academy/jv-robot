package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        chooseDirection(robot, robot.getX() - toX, Direction.RIGHT, Direction.LEFT);
        chooseDirection(robot, robot.getY() - toY, Direction.UP, Direction.DOWN);
    }

    private void chooseDirection(Robot robot, int delta, Direction directionLess,
                                 Direction directionGreater) {
        if (delta < 0) {
            moveRobotToDirection(robot, directionLess, delta);
        } else if (delta > 0) {
            moveRobotToDirection(robot, directionGreater, delta);
        }
    }

    private void moveRobotToDirection(Robot robot, Direction direction, int delta) {
        while (robot.getDirection() != direction) {
            robot.turnLeft();
        }
        for (int i = 0; i < Math.abs(delta); i++) {
            robot.stepForward();
        }
    }
}
