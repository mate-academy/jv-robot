package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX > robot.getX() && toY > robot.getY()) {
            moveRobotRight(robot, toX, toY);
            moveRobotUp(robot, toX, toY);
        } else if (toX < robot.getX() && toY > robot.getY()) {
            moveRobotLeft(robot, toX, toY);
            moveRobotUp(robot, toX, toY);
        } else if (toX < robot.getX() && toY < robot.getY()) {
            moveRobotLeft(robot, toX, toY);
            moveRobotDown(robot, toX, toY);
        } else if (toX > robot.getX() && toY < robot.getY()) {
            moveRobotRight(robot, toX, toY);
            moveRobotDown(robot, toX, toY);
        } else if (toX == robot.getX() && toY < robot.getY()) {
            moveRobotDown(robot, toX, toY);
        } else if (toX == robot.getX() && toY > robot.getY()) {
            moveRobotUp(robot, toX, toY);
        } else if (toX > robot.getX() && toY == robot.getY()) {
            moveRobotRight(robot, toX, toY);
        } else if (toX < robot.getX() && toY == robot.getY()) {
            moveRobotLeft(robot, toX, toY);
        }
    }

    public void moveRobotRight(Robot robot, int toX, int toY) {
        Direction curDir = robot.getDirection();
        int curX = robot.getX();
        if (toX > curX) {
            while (!curDir.equals(Direction.RIGHT)) {
                robot.turnRight();
                curDir = robot.getDirection();
            }
            while (toX != curX) {
                robot.stepForward();
                curX = robot.getX();
            }
        }
    }

    public void moveRobotUp(Robot robot, int toX, int toY) {
        Direction curDir = robot.getDirection();
        int curY = robot.getY();
        if (toY > curY) {
            while (!curDir.equals(Direction.UP)) {
                robot.turnRight();
                curDir = robot.getDirection();
            }
            while (toY != curY) {
                robot.stepForward();
                curY = robot.getY();
            }
        }
    }

    public void moveRobotLeft(Robot robot, int toX, int toY) {
        Direction curDir = robot.getDirection();
        int curX = robot.getX();
        if (toX < curX) {
            while (!curDir.equals(Direction.LEFT)) {
                robot.turnRight();
                curDir = robot.getDirection();
            }
            while (toX != curX) {
                robot.stepForward();
                curX = robot.getX();
            }
        }
    }

    public void moveRobotDown(Robot robot, int toX, int toY) {
        Direction curDir = robot.getDirection();
        int curY = robot.getY();
        if (toY < curY) {
            while (!curDir.equals(Direction.DOWN)) {
                robot.turnRight();
                curDir = robot.getDirection();
            }
            while (toY != curY) {
                robot.stepForward();
                curY = robot.getY();
            }
        }
    }
}
