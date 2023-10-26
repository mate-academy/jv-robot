package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int initialYPos = robot.getY(); // -4  toY 1
        int initialXPos = robot.getX();
        Direction initialDirection = robot.getDirection();

        Direction currentDirection = moveAxis(robot, toX, initialXPos, Axis.X, initialDirection);
        moveAxis(robot, toY, initialYPos, Axis.Y, currentDirection);
    }

    private Direction moveAxis(Robot robot,
                               int toPos,
                               int initialPos,
                               Axis axis,
                               Direction currentDirection) {
        if (initialPos == toPos) {
            return currentDirection;
        }

        boolean isDestinationBack = initialPos > toPos;
        int amountSteps;
        Direction direction;

        if (isDestinationBack) {
            amountSteps = initialPos - toPos;
            if (axis.equals(Axis.X)) {
                turnRobot(robot, Direction.LEFT, currentDirection);
                direction = Direction.LEFT;
            } else {
                turnRobot(robot, Direction.DOWN, currentDirection);
                direction = Direction.DOWN;
            }
            doSteps(robot, amountSteps);
        } else {
            amountSteps = toPos - initialPos;
            if (axis.equals(Axis.X)) {
                turnRobot(robot, Direction.RIGHT, currentDirection);
                direction = Direction.RIGHT;
            } else {
                turnRobot(robot, Direction.UP, currentDirection);
                direction = Direction.UP;
            }
            doSteps(robot, amountSteps);
        }

        return direction;
    }

    private void doSteps(Robot robot, int stepsNumber) {
        for (int i = 0; i < stepsNumber; i++) {
            robot.stepForward();
        }
    }

    private void turnRobot(Robot robot,
                           Direction destinationDirection,
                           Direction currentDirection) {
        if (currentDirection.equals(destinationDirection)) {
            return;
        }
        switch (currentDirection) {
            case UP:
                if (destinationDirection.equals(Direction.RIGHT)) {
                    robot.turnRight();
                }
                if (destinationDirection.equals(Direction.LEFT)) {
                    robot.turnLeft();
                }
                if (destinationDirection.equals(Direction.DOWN)) {
                    robot.turnLeft();
                    robot.turnLeft();
                }
                break;
            case LEFT:
                if (destinationDirection.equals(Direction.RIGHT)) {
                    robot.turnLeft();
                    robot.turnLeft();
                }
                if (destinationDirection.equals(Direction.UP)) {
                    robot.turnRight();
                }
                if (destinationDirection.equals(Direction.DOWN)) {
                    robot.turnLeft();
                }
                break;
            case DOWN:
                if (destinationDirection.equals(Direction.RIGHT)) {
                    robot.turnLeft();
                }
                if (destinationDirection.equals(Direction.UP)) {
                    robot.turnLeft();
                    robot.turnLeft();
                }
                if (destinationDirection.equals(Direction.LEFT)) {
                    robot.turnRight();
                }
                break;
            case RIGHT:
                if (destinationDirection.equals(Direction.DOWN)) {
                    robot.turnRight();
                }
                if (destinationDirection.equals(Direction.UP)) {
                    robot.turnLeft();
                }
                if (destinationDirection.equals(Direction.LEFT)) {
                    robot.turnRight();
                    robot.turnRight();
                }
                break;
            default:
                break;
        }
    }
}
