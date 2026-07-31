package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction direction = robot.getDirection();

        int deltaX = toX - robot.getX();
        int deltaY = toY - robot.getY();

        Direction directionX = deltaX > 0
                ? Direction.RIGHT
                : deltaX < 0
                ? Direction.LEFT
                : null;

        Direction directionY = deltaY > 0
                ? Direction.UP
                : deltaY < 0
                ? Direction.DOWN
                : null;

        if (directionX != null) {
            deltaX = Math.abs(deltaX);
            if (directionX != direction) {
                if (direction == Direction.RIGHT || direction == Direction.LEFT) {
                    robot.turnRight();
                    robot.turnRight();
                } else if (direction == Direction.UP) {
                    if (directionX == Direction.RIGHT) {
                        robot.turnRight();
                    } else {
                        robot.turnLeft();
                    }
                } else {
                    if (directionX == Direction.RIGHT) {
                        robot.turnLeft();
                    } else {
                        robot.turnRight();
                    }
                }
            }
            for (int i = 0; i < deltaX; ++i) {
                robot.stepForward();
            }
        }

        direction = robot.getDirection();

        if (directionY != null) {
            deltaY = Math.abs(deltaY);
            if (directionY != direction) {
                if (direction == Direction.UP || direction == Direction.DOWN) {
                    robot.turnRight();
                    robot.turnRight();
                } else if (direction == Direction.RIGHT) {
                    if (directionY == Direction.DOWN) {
                        robot.turnRight();
                    } else {
                        robot.turnLeft();
                    }
                } else {
                    if (directionY == Direction.DOWN) {
                        robot.turnLeft();
                    } else {
                        robot.turnRight();
                    }
                }
            }
            for (int i = 0; i < deltaY; ++i) {
                robot.stepForward();
            }
        }
    }
}
