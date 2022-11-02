package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX > robot.getX()) {
            getTurn(robot, Direction.RIGHT);
            getMove(robot, toX, robot.getX());
        }
        if (toY > robot.getY()) {
            getTurn(robot, Direction.UP);
            getMove(robot, toY, robot.getY());
        }
        if (toX < robot.getX()) {
            getTurn(robot, Direction.LEFT);
            getMove(robot, toX, robot.getX());
        }
        if (toY < robot.getY()) {
            getTurn(robot, Direction.DOWN);
            getMove(robot, toY, robot.getY());
        }
    }

    public void getMove(Robot robot, int to, int from) {
        while (to != from) {
            robot.stepForward();
            if (from < to) {
                from++;
            } else {
                from--;
            }
        }
    }

    public void getTurn(Robot robot, Direction direction) {
        if (robot.getDirection() == Direction.UP & direction == Direction.RIGHT
                || robot.getDirection() == Direction.RIGHT & direction == Direction.DOWN
                || robot.getDirection() == Direction.DOWN & direction == Direction.LEFT
                || robot.getDirection() == Direction.LEFT & direction == Direction.UP) {
            while (robot.getDirection() != direction) {
                robot.turnRight();
            }
        } else {
            while (robot.getDirection() != direction) {
                robot.turnLeft();
            }
        }
    }
}
