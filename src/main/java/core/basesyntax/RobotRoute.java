package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() > toX) {
            faceLeft(robot);
            robot.stepForward();
        }
        while (robot.getX() < toX) {
            faceRight(robot);
            robot.stepForward();
        }
        while (robot.getY() > toY) {
            faceDown(robot);
            robot.stepForward();
        }
        while (robot.getY() < toY) {
            faceUp(robot);
            robot.stepForward();
        }
    }

    private void faceLeft(Robot robot) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnLeft();
                break;
            case RIGHT:
                robot.turnRight();
                robot.turnRight();
                break;
            case DOWN:
                robot.turnRight();
                break;
            default:
                break;
        }
    }

    private void faceRight(Robot robot) {
        switch (robot.getDirection()) {
            case DOWN:
                robot.turnLeft();
                break;
            case LEFT:
                robot.turnRight();
                robot.turnRight();
                break;
            case UP:
                robot.turnRight();
                break;
            case RIGHT:
            default:
                break;
        }
    }

    private void faceDown(Robot robot) {
        switch (robot.getDirection()) {
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
    }

    private void faceUp(Robot robot) {
        switch (robot.getDirection()) {
            case RIGHT:
                robot.turnLeft();
                break;
            case DOWN:
                robot.turnRight();
                robot.turnRight();
                break;
            case LEFT:
                robot.turnRight();
                break;
            default:
                break;
        }
    }
}
