package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            goLeft(robot);
            reachPointX(robot, toX);
            if (robot.getY() > toY) {
                goDown(robot);
                reachPointY(robot, toY);
            } else {
                goUp(robot);
                reachPointY(robot, toY);
            }
        } else {
            goRight(robot);
            reachPointX(robot, toX);
            if (robot.getY() > toY) {
                goDown(robot);
                reachPointY(robot, toY);
            } else {
                goUp(robot);
                reachPointY(robot, toY);
            }
        }
    }

    private void goLeft(Robot robot) {
        Direction direction = robot.getDirection();
        switch (direction) {
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
                break;
        }
    }

    private void goRight(Robot robot) {
        Direction direction = robot.getDirection();
        switch (direction) {
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
                break;
        }
    }

    private void goUp(Robot robot) {
        Direction direction = robot.getDirection();
        switch (direction) {
            case RIGHT:
                robot.turnLeft();
                break;
            case LEFT:
                robot.turnRight();
                break;
            case DOWN:
                robot.turnRight();
                robot.turnRight();
                break;
            default:
                break;
        }
    }

    private void goDown(Robot robot) {
        Direction direction = robot.getDirection();
        switch (direction) {
            case RIGHT:
                robot.turnRight();
                break;
            case LEFT:
                robot.turnLeft();
                break;
            case UP:
                robot.turnRight();
                robot.turnRight();
                break;
            default:
                break;
        }
    }

    private void reachPointX(Robot robot, int finish) {
        while (!(robot.getX() == finish)) {
            robot.stepForward();
        }
    }

    private void reachPointY(Robot robot, int finish) {
        while (!(robot.getY() == finish)) {
            robot.stepForward();
        }
    }
}
