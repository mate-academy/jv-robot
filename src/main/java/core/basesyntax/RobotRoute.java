package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentTox = robot.getX();
        int currentToy = robot.getY();
        Direction currentDirection = robot.getDirection();
        currentDirection = moveHorizontally(robot, toX, currentTox, currentDirection);
        moveVertically(robot, toY, currentToy, currentDirection);
    }

    private Direction moveHorizontally(Robot robot, int toX, int currentTox, Direction direction) {
        if (toX > currentTox) {
            if (direction != Direction.RIGHT) {
                while (direction != Direction.RIGHT) {
                    robot.turnRight();
                    direction = robot.getDirection();
                }
            }
            while (toX > currentTox) {
                robot.stepForward();
                currentTox++;
            }
        } else if (toX < currentTox) {
            if (direction != Direction.LEFT) {
                while (direction != Direction.LEFT) {
                    robot.turnLeft();
                    direction = robot.getDirection();
                }
            }
            while (toX < currentTox) {
                robot.stepForward();
                currentTox--;
            }
        }
        return direction;
    }

    private void moveVertically(Robot robot, int toY, int currentToy, Direction currentDirection) {
        if (toY > currentToy) {
            if (currentDirection != Direction.UP) {
                direction(robot, Direction.UP);
            }
            while (currentToy < toY) {
                robot.stepForward();
                currentToy++;
            }
        } else if (toY < currentToy) {
            if (currentDirection != Direction.DOWN) {
                direction(robot, Direction.DOWN);
            }
            while (currentToy > toY) {
                robot.stepForward();
                currentToy--;
            }
        }
    }

    private void direction(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            if (robot.getDirection() != direction) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
        }
    }
}
