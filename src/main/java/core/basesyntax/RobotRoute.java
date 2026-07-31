package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int movesX = 0;
        int movesY = 0;
        if (toX > robot.getX()) {
            movesX = toX - robot.getX();
            if (toY > robot.getY()) {
                movesY = toY - robot.getY();
                findDirection(robot, Direction.UP);
                goRoad(robot, movesY, movesX);
            } else {
                movesY = robot.getY() - toY;
                findDirection(robot, Direction.RIGHT);
                goRoad(robot, movesX, movesY);
            }
        } else {
            movesX = robot.getX() - toX;
            if (toY > robot.getY()) {
                movesY = toY - robot.getY();
                findDirection(robot, Direction.LEFT);
                goRoad(robot, movesX, movesY);
            } else {
                movesY = robot.getY() - toY;
                findDirection(robot, Direction.DOWN);
                goRoad(robot, movesY, movesX);
            }
        }

    }

    public void findDirection(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnRight();
        }
    }

    public void goRoad(Robot robot, int goFirst, int goSecond) {
        for (int i = 0; i < goFirst; i++) {
            robot.stepForward();
        }
        robot.turnRight();
        for (int i = 0; i < goSecond; i++) {
            robot.stepForward();
        }

    }
}
