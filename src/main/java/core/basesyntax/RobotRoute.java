package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction currDirection = robot.getDirection();
        int startX = robot.getX();
        int startY = robot.getY();
        if (startY == toY && startX == toX) {
            return;
        }
        setVertDirection(robot, toY, startY, currDirection);
        currDirection = robot.getDirection();
        int movesQty = getMovesQty(toY, currDirection, startY);
        goForward(robot, movesQty);
        setHorizonDirection(robot, toX, currDirection);
        currDirection = robot.getDirection();
        movesQty = getMovesQty(toX, currDirection, startX);
        goForward(robot, movesQty);
    }

    private void goForward(Robot robot, int movesQty) {
        for (int i = 0; i < movesQty; i++) {
            robot.stepForward();
        }
    }

    private int getMovesQty(int to, Direction currentDirection, int from) {
        if (currentDirection == Direction.DOWN || currentDirection == Direction.LEFT) {
            return from - to;
        }
        if (currentDirection == Direction.UP || currentDirection == Direction.RIGHT) {
            return to - from;
        }
        return -1;
    }

    private void setVertDirection(Robot robot, int toY, int startY, Direction currDirection) {
        if (toY > startY && currDirection != Direction.UP) {
            while (currDirection != Direction.UP) {
                robot.turnRight();
                currDirection = robot.getDirection();
            }
        }

        if (toY < startY && currDirection != Direction.DOWN) {
            while (currDirection != Direction.DOWN) {
                robot.turnRight();
                currDirection = robot.getDirection();
            }
        }
    }

    private void setHorizonDirection(Robot robot, int toX, Direction currDirection) {
        if (toX > robot.getX()) {
            if (currDirection == Direction.UP) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }

        }

        if (toX < robot.getX()) {
            if (currDirection == Direction.UP) {
                robot.turnLeft();
            } else {
                robot.turnRight();
            }
        }
    }
}
