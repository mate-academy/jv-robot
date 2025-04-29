package core.basesyntax;

public class RobotRoute {
    private Robot robot;
    private int finishedX;
    private int finishedY;

    public void moveRobot(Robot robot, int toX, int toY) {
        this.robot = robot;
        this.finishedX = toX;
        this.finishedY = toY;

        int currentX = robot.getX();
        int currentY = robot.getY();

        int quantityStepX = calculateDistance(finishedX, currentX);
        int quantityStepY = calculateDistance(finishedY, currentY);

        if (quantityStepX > 0) {
            Direction directionToMove = determineDirection('X');
            turnRobotToDirection(directionToMove);
            moveForward(quantityStepX);
        }

        if (quantityStepY > 0) {
            Direction directionToMove = determineDirection('Y');
            turnRobotToDirection(directionToMove);
            moveForward(quantityStepY);
        }
    }

    private int calculateDistance(int from, int to) {
        return Math.abs(to - from);
    }

    private void moveForward(int steps) {
        for (int i = 0; i < steps; i++) {
            robot.stepForward();
        }
    }

    private Direction determineDirection(char axis) {
        if (axis == 'X') {
            int currentX = robot.getX();

            if (finishedX < currentX) {
                return Direction.LEFT;
            } else if (finishedX > currentX) {
                return Direction.RIGHT;
            }
        }

        if (axis == 'Y') {
            int currentY = robot.getY();

            if (finishedY < currentY) {
                return Direction.DOWN;
            } else if (finishedY > currentY) {
                return Direction.UP;
            }
        }

        return robot.getDirection();
    }

    private void turnRobotToDirection(Direction desiredDirection) {
        Direction currentDirection = robot.getDirection();

        if (currentDirection == desiredDirection) {
            return;
        }

        int currentIndex = currentDirection.ordinal();
        int desiredIndex = desiredDirection.ordinal();
        int indexSum = currentIndex + desiredIndex;


        if (indexSum == 1 || indexSum == 5) {
            // turn around
            robot.turnLeft();
            robot.turnLeft();
        }

        if (indexSum == 2 || indexSum == 4) {
            // avoid unnecessary turns
            switch (currentDirection) {
                case UP:
                case DOWN:
                    robot.turnLeft();
                    break;
                default:
                    robot.turnRight();
            }
        }

        if (indexSum == 3) {
            // avoid unnecessary turns
            switch (currentDirection) {
                case UP:
                case DOWN:
                    robot.turnRight();
                    break;
                default:
                    robot.turnLeft();
            }
        }

    }

}
