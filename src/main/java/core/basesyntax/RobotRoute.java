package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int actualX = robot.getX();
        int actualY = robot.getY();
        Direction actualD = robot.getDirection();
        Direction directionMove;
        if (toX < actualX) {
            directionMove = Direction.LEFT;
            if (actualD == Direction.RIGHT) {
                robot.turnLeft();
                robot.turnLeft();
            } else if (actualD == Direction.UP) {
                robot.turnLeft();
            } else if (actualD == Direction.DOWN) {
                robot.turnRight();
            }
        } else {
            directionMove = Direction.RIGHT;
            if (actualD == Direction.LEFT) {
                robot.turnRight();
                robot.turnRight();
            } else if (actualD == Direction.DOWN) {
                robot.turnLeft();
            } else if (actualD == Direction.UP) {
                robot.turnRight();
            }

        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }

        if ((actualY > toY && directionMove == Direction.LEFT)
                || (actualY < toY && directionMove == Direction.RIGHT)) {
            robot.turnRight();
        } else {
            robot.turnLeft();
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
