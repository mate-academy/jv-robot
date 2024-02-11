package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int robotStartXPos = robot.getX();
        int robotStartYPos = robot.getY();
        if (robotStartXPos == toX && robotStartYPos == toY) {
            return;
        }

        moveXAxis(robotStartXPos, toX, robot);
        moveYAxis(robotStartYPos, toY, robot);

        System.out.println("Robot moved to coords: x: "
                + robot.getX() + "; y: " + robot.getY() + ".");
    }

    private Direction horizontalDirection(int startXPox, int endXPox) {
        return startXPox > endXPox ? Direction.LEFT : Direction.RIGHT;
    }

    private Direction verticalDirection(int startYPox, int endYPox) {
        return startYPox > endYPox ? Direction.DOWN : Direction.UP;
    }

    private void moveXAxis(int robotStartXPos, int endXPos, Robot robot) {
        Direction direction = horizontalDirection(robotStartXPos, endXPos);
        turnRobot(direction, robot);
        int stepsNumber = getMovementSteps(robotStartXPos, endXPos);
        for (int i = 0; i < stepsNumber; i++) {
            robot.stepForward();
        }
    }

    private void moveYAxis(int robotStartYPos, int endYPos, Robot robot) {
        Direction direction = verticalDirection(robotStartYPos, endYPos);
        turnRobot(direction, robot);
        int stepsNumber = getMovementSteps(robotStartYPos, endYPos);
        for (int i = 0; i < stepsNumber; i++) {
            robot.stepForward();
        }
    }

    private void turnRobot(Direction direction, Robot robot) {
        Direction startDirection = robot.getDirection();

        if (direction == Direction.LEFT) {
            turnRobotLeft(startDirection, robot);
        }
        if (direction == Direction.RIGHT) {
            turnRobotRight(startDirection, robot);
        }
        if (direction == Direction.UP) {
            turnRobotUp(startDirection, robot);
        }
        if (direction == Direction.DOWN) {
            turnRobotDown(startDirection, robot);
        }

    }

    private void turnRobotLeft(Direction startDirection, Robot robot) {
        if (startDirection == Direction.UP) {
            robot.turnLeft();
        } else if (startDirection == Direction.DOWN) {
            robot.turnRight();
        } else if (startDirection == Direction.RIGHT) {
            robot.turnLeft();
            robot.turnLeft();
        }
    }

    private void turnRobotRight(Direction startDirection, Robot robot) {
        if (startDirection == Direction.UP) {
            robot.turnRight();
        } else if (startDirection == Direction.DOWN) {
            robot.turnLeft();
        } else if (startDirection == Direction.LEFT) {
            robot.turnRight();
            robot.turnRight();
        }
    }

    private void turnRobotUp(Direction startDirection, Robot robot) {
        if (startDirection == Direction.LEFT) {
            robot.turnRight();
        } else if (startDirection == Direction.RIGHT) {
            robot.turnLeft();
        } else if (startDirection == Direction.DOWN) {
            robot.turnLeft();
            robot.turnLeft();
        }
    }

    private void turnRobotDown(Direction startDirection, Robot robot) {
        if (startDirection == Direction.LEFT) {
            robot.turnLeft();
        } else if (startDirection == Direction.RIGHT) {
            robot.turnRight();
        } else if (startDirection == Direction.UP) {
            robot.turnRight();
            robot.turnRight();
        }
    }

    private int getMovementSteps(int startPos, int endPos) {
        if (startPos > 0 && endPos > 0) {
            return startPos > endPos ? startPos - endPos : endPos - startPos;
        } else if (startPos < 0 && endPos < 0) {
            return startPos > endPos ? startPos - endPos : endPos - startPos;
        } else {
            int startAbsValue = startPos > 0 ? startPos : startPos * -1;
            int endAbsValue = endPos > 0 ? endPos : endPos * -1;
            return startAbsValue + endAbsValue;
        }
    }
}
