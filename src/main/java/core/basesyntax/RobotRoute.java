package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        if (currentX == toX && currentY == toY) {
            return;
        }

        Direction currentDirection = robot.getDirection();

        if (currentX < toX) {
            if (currentDirection == Direction.UP) {
                robot.turnRight();
            } else if (currentDirection == Direction.DOWN) {
                robot.turnLeft();
            } else if (currentDirection == Direction.LEFT) {
                robot.turnRight();
                robot.turnRight();
            }

            for (int i = 0; i < toX - currentX; i++) {
                robot.stepForward();
            }
        }

        if (currentX > toX) {
            if (currentDirection == Direction.UP) {
                robot.turnLeft();
            } else if (currentDirection == Direction.DOWN) {
                robot.turnRight();
            } else if (currentDirection == Direction.RIGHT) {
                robot.turnLeft();
                robot.turnLeft();
            }

            for (int i = 0; i < currentX - toX; i++) {
                robot.stepForward();
            }
        }

        currentDirection = robot.getDirection();

        if (currentY < toY) {
            if (currentDirection == Direction.LEFT) {
                robot.turnRight();
            } else if (currentDirection == Direction.RIGHT) {
                robot.turnLeft();
            } else if (currentDirection == Direction.DOWN) {
                robot.turnRight();
                robot.turnRight();
            }

            for (int i = 0; i < toY - currentY; i++) {
                robot.stepForward();
            }
        }

        if (currentY > toY) {
            if (currentDirection == Direction.LEFT) {
                robot.turnLeft();
            } else if (currentDirection == Direction.RIGHT) {
                robot.turnRight();
            } else if (currentDirection == Direction.UP) {
                robot.turnLeft();
                robot.turnLeft();
            }

            for (int i = 0; i < currentY - toY; i++) {
                robot.stepForward();
            }
        }
    }
}
