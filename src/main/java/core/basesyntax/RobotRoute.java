package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            turn(robot, Direction.RIGHT);
        }

        if (robot.getX() > toX) {
            turn(robot, Direction.LEFT);
        }

        int movesXCounter = robot.getX() - toX;
        if (robot.getX() != toX) {
            stepForward(robot, movesXCounter);
        }

        if (robot.getY() < toY) {
            turn(robot, Direction.UP);
        }

        if (robot.getY() > toY) {
            turn(robot, Direction.DOWN);
        }

        int movesYCounter = robot.getY() - toY;
        if (robot.getY() != toY) {
            stepForward(robot, movesYCounter);
        }
    }

    public void turn(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnLeft();
        }
    }

    public void stepForward(Robot robot, int movesCounter) {
        if (movesCounter < 0) {
            movesCounter = -movesCounter;
        }
        while (movesCounter > 0) {
            robot.stepForward();
            movesCounter--;
        }
    }
}
