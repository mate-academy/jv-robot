package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int curX = robot.getX();
        int curY = robot.getY();
        Direction curDirection = robot.getDirection();
        moveToX(curX, toX, robot);
        moveToY(curY, toY, robot);

    }

    private void moveToX(int curX, int toX, Robot robot) {
        Direction curDirection = robot.getDirection();
        if (curX > toX) {
            switch (curDirection) {
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
            while (curX > toX) {
                robot.stepForward();
                curX = robot.getX();
            }
        } else {
            switch (curDirection) {
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
            while (curX < toX) {
                robot.stepForward();
                curX = robot.getX();
            }
        }
    }

    private void moveToY(int curY, int toY, Robot robot) {
        Direction curDirection = robot.getDirection();
        if (curY > toY) {
            switch (curDirection) {
                case LEFT:
                    robot.turnLeft();
                    break;
                case UP:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnRight();
                    break;
                default:
                    break;
            }
            while (curY > toY) {
                robot.stepForward();
                curY = robot.getY();
            }
        } else {
            switch (curDirection) {
                case RIGHT:
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnRight();
                    break;
                default:
                    break;
            }
            while (curY < toY) {
                robot.stepForward();
                curY = robot.getY();
            }
        }
    }
}
