package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        boolean waitingForWalk;
        while (true) {
            tryToMove(robot, toX, toY);
            if (robot.getX() == toX && robot.getY() == toY) {
                break;
            }
            waitingForWalk = findTurnX(robot, toX);
            if (!waitingForWalk) {
                waitingForWalk = findTurnY(robot,toY);
            }
            if (!waitingForWalk) {
                robot.turnLeft();
                robot.turnLeft();
            }
        }
    }

    private void goRobot(Robot robot, int step) {
        for (int i = 0; i < Math.abs(step); i++) {
            robot.stepForward();
        }
    }

    private boolean findTurnX(Robot robot, int toX) {
        if (robot.getX() != toX) {
            if ((robot.getDirection() == Direction.DOWN && robot.getX() > toX)
                    || (robot.getDirection() == Direction.UP && robot.getX() < toX)) {
                robot.turnRight();
                return true;
            } else if ((robot.getDirection() == Direction.DOWN && robot.getX() < toX)
                    || (robot.getDirection() == Direction.UP && robot.getX() > toX)) {
                robot.turnLeft();
                return true;
            }
        }
        return false;
    }

    private boolean findTurnY(Robot robot, int toY) {
        if (robot.getY() != toY) {
            if ((robot.getDirection() == Direction.LEFT && robot.getY() > toY)
                    || (robot.getDirection() == Direction.RIGHT && robot.getY() < toY)) {
                robot.turnLeft();
                return true;
            } else if ((robot.getDirection() == Direction.LEFT && robot.getY() < toY)
                    || (robot.getDirection() == Direction.RIGHT && robot.getY() > toY)) {
                robot.turnRight();
                return true;
            }
        }
        return false;
    }

    private void tryToMove(Robot robot,int toX, int toY) {
        if ((robot.getX() > toX) && (robot.getDirection() == Direction.LEFT)
                || (robot.getX() < toX) && (robot.getDirection() == Direction.RIGHT)) {
            goRobot(robot, robot.getX() - toX);
        } else if ((robot.getY() > toY) && (robot.getDirection() == Direction.DOWN)
                || (robot.getY() < toY) && (robot.getDirection() == Direction.UP)) {
            goRobot(robot, robot.getY() - toY);
        }
    }
}
