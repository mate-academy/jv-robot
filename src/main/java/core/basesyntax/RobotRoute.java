package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        if (toX < robot.getX() && robot.getDirection() != Direction.LEFT) {
            rotateToLeft(robot);
        } else if (toX > robot.getX() && robot.getDirection() != Direction.RIGHT) {
            rotateToRight(robot);
        }
        moveToX(robot, toX);
        if (toY < robot.getY() && robot.getDirection() != Direction.DOWN) {
            rotateToDown(robot);
        } else if (toY > robot.getY() && robot.getDirection() != Direction.UP) {
            rotateToUp(robot);
        }
        moveToY(robot, toY);
    }

    private void moveToY(Robot robot, int toY) {
        if (robot.getDirection() == Direction.UP) {
            for (int i = robot.getY(); i < toY; i++) {
                robot.stepForward();
            }
        } else if (robot.getDirection() == Direction.DOWN) {
            for (int i = robot.getY(); i > toY; i--) {
                robot.stepForward();
            }
        }
    }

    private void moveToX(Robot robot, int toX) {
        if (robot.getDirection() == Direction.RIGHT) {
            for (int i = robot.getX(); i < toX; i++) {
                robot.stepForward();
            }
        } else if (robot.getDirection() == Direction.LEFT) {
            for (int i = robot.getX(); i > toX; i--) {
                robot.stepForward();
            }
        }
    }

    private void rotateToRight(Robot robot) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnRight();
                break;
            case DOWN:
                robot.turnLeft();
                break;
            case LEFT:
                robot.turnRight();
                robot.turnRight();
                break;
            default:
                return;
        }
    }

    private void rotateToLeft(Robot robot) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnLeft();
                break;
            case DOWN:
                robot.turnRight();
                break;
            case RIGHT:
                robot.turnRight();
                robot.turnRight();
                break;
            default:
                return;
        }
    }

    private void rotateToUp(Robot robot) {
        switch (robot.getDirection()) {
            case DOWN:
                robot.turnRight();
                robot.turnRight();
                break;
            case RIGHT:
                robot.turnLeft();
                break;
            case LEFT:
                robot.turnRight();
                break;
            default:
                return;
        }
    }

    private void rotateToDown(Robot robot) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnRight();
                robot.turnRight();
                break;
            case RIGHT:
                robot.turnRight();
                break;
            case LEFT:
                robot.turnLeft();
                break;
            default:
                return;
        }
    }
}
