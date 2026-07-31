package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int amountOfXMoves = robot.getX() <= toX ? -robot.getX() + toX : robot.getX() + -toX;
        int amountOfYMoves = robot.getY() <= toY ? -robot.getY() + toY : robot.getY() + -toY;

        if (robot.getX() <= toX) {
            go(robot, Direction.RIGHT, amountOfXMoves);
        } else {
            go(robot, Direction.LEFT, amountOfXMoves);
        }
        if (robot.getY() <= toY) {
            go(robot, Direction.UP, amountOfYMoves);
        } else {
            go(robot, Direction.DOWN, amountOfYMoves);
        }
    }

    private void go(Robot robot, Direction direction, int number) {
        turnToNeededDirection(robot, direction);
        goToDestination(robot, number);
    }

    private void turnToNeededDirection(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnLeft();
        }
    }

    private void goToDestination(Robot robot, int number) {
        for (int i = 0; i < number; i++) {
            robot.stepForward();
        }
    }
}
