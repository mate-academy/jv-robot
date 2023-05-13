package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        changeToCorrectDirectionByX(robot, toX);
        moveFromTo(robot, robot.getX(), toX);
        changeToCorrectDirectionByY(robot, toY);
        moveFromTo(robot, robot.getY(), toY);
    }

    private void changeToCorrectDirectionByX(Robot robot, int toX) {
        Direction startDirect = robot.getDirection();
        int startX = robot.getX();

        if(startX > toX && startDirect == Direction.UP) {
              robot.turnLeft();
            }
        else if(startX > toX && startDirect == Direction.DOWN) {
            robot.turnRight();
        }
        else if(startX > toX && startDirect == Direction.RIGHT) {
                robot.turnLeft();
                robot.turnLeft();
            }
        else if(startX < toX && startDirect == Direction.UP || startDirect == Direction.DOWN) {
                robot.turnRight();
            }
        else if(startX < toX && startDirect == Direction.LEFT) {
                robot.turnRight();
                robot.turnRight();
            }
    }

    private void changeToCorrectDirectionByY(Robot robot, int toY) {
        Direction startDirect = robot.getDirection();
        int startY = robot.getY();

        if(startY > toY && startDirect == Direction.LEFT) {
            robot.turnLeft();
        }
        else if(startY > toY && startDirect == Direction.RIGHT) {
            robot.turnRight();
        }
        else if (startY > toY && startDirect == Direction.UP) {
            robot.turnRight();
            robot.turnRight();
        }
        else if(startY < toY && startDirect == Direction.LEFT) {
            robot.turnRight();
        }
        else if(startY < toY && startDirect == Direction.RIGHT) {
            robot.turnLeft();
        }
    }

    private void moveFromTo(Robot robot, int startPosition, int toPosition) {
        int steps;
        steps = startPosition - toPosition;
        for (int i = 1; i <= Math.abs(steps); i++) {
            robot.stepForward();
        }
    }
}
