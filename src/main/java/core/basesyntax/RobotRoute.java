package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        // move horizontally
        int movesX = toX - robot.getX();
        if (movesX > 0) {
            turn(robot, Direction.RIGHT);
        }
        if (movesX < 0) {
            turn(robot, Direction.LEFT);
        }
        move(movesX, robot);

        // move vertically
        int movesY = toY - robot.getY();
        if (movesY > 0) {
            turn(robot, Direction.UP);
        }
        if (movesY < 0) {
            turn(robot, Direction.DOWN);
        }
        move(movesY, robot);
    }

    private void move(int moves, Robot robot) {
        for (int i = 0; i < (moves < 0 ? -moves : moves); i++) {
            robot.stepForward();
        }
    }

    private void turn(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnLeft();
        }
    }
}
