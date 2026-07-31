package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();
        int remainingX = toX - currentX;
        int remainingY = toY - currentY;

        while (remainingX != 0) {
            if (remainingX > 0) {
                if (robot.getDirection() != Direction.RIGHT) {
                    turnToDirection(robot, Direction.RIGHT);
                }
            } else {
                if (robot.getDirection() != Direction.LEFT) {
                    turnToDirection(robot, Direction.LEFT);
                }
            }
            robot.stepForward();
            remainingX = toX - robot.getX();
        }

        while (remainingY != 0) {
            if (remainingY > 0) {
                if (robot.getDirection() != Direction.UP) {
                    turnToDirection(robot, Direction.UP);
                }
            } else {
                if (robot.getDirection() != Direction.DOWN) {
                    turnToDirection(robot, Direction.DOWN);
                }
            }
            robot.stepForward();
            remainingY = toY - robot.getY();
        }
    }

    private void turnToDirection(Robot robot, Direction targetDirection) {
        Direction currentDirection = robot.getDirection();
        if (currentDirection == Direction.UP && targetDirection == Direction.RIGHT) {
            robot.turnRight();
        } else if (currentDirection == Direction.UP && targetDirection == Direction.LEFT) {
            robot.turnLeft();
        } else if (currentDirection == Direction.DOWN && targetDirection == Direction.RIGHT) {
            robot.turnLeft();
        } else if (currentDirection == Direction.DOWN && targetDirection == Direction.LEFT) {
            robot.turnRight();
        } else if (currentDirection == Direction.RIGHT && targetDirection == Direction.UP) {
            robot.turnLeft();
        } else if (currentDirection == Direction.RIGHT && targetDirection == Direction.DOWN) {
            robot.turnRight();
        } else if (currentDirection == Direction.LEFT && targetDirection == Direction.UP) {
            robot.turnRight();
        } else if (currentDirection == Direction.LEFT && targetDirection == Direction.DOWN) {
            robot.turnLeft();
        }
    }

}
