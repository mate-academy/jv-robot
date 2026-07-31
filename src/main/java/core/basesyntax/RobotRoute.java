package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveRobotLeftRight(robot, toX);
        moveRobotUpDown(robot, toY);
        int x = robot.getX();
        int y = robot.getY();
        System.err.println("TEST");
        System.out.println(x);
        System.out.println(y);
        System.out.println(toX);
        System.out.println(toY);
    }

    private void moveRobotLeftRight(Robot robot, int toX) {
        while (robot.getX() != toX) {
            if (robot.getX() > toX) {
                moveLeft(robot);
            } else {
                moveRight(robot);
            }
        }
    }

    private void moveRobotUpDown(Robot robot, int toY) {
        while (robot.getY() != toY) {
            if (robot.getY() > toY) {
                moveDown(robot);
            } else {
                moveUp(robot);
            }
        }
    }

    private void moveLeft(Robot robot) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnLeft();
                break;
            case LEFT:
                robot.stepForward();
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

    private void moveRight(Robot robot) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnRight();
                break;
            case LEFT:
                robot.turnRight();
                robot.turnRight();
                break;
            case DOWN:
                robot.turnLeft();
                break;
            case RIGHT:
                robot.stepForward();
                break;
            default:
                break;
        }
    }

    private void moveUp(Robot robot) {
        switch (robot.getDirection()) {
            case UP:
                robot.stepForward();
                break;
            case LEFT:
                robot.turnRight();
                break;
            case DOWN:
                robot.turnRight();
                robot.turnRight();
                break;
            case RIGHT:
                robot.turnLeft();
                break;
            default:
                break;
        }
    }

    private void moveDown(Robot robot) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnRight();
                robot.turnRight();
                break;
            case LEFT:
                robot.turnLeft();
                break;
            case DOWN:
                robot.stepForward();
                break;
            case RIGHT:
                robot.turnRight();
                break;
            default:
                break;
        }
    }
}
