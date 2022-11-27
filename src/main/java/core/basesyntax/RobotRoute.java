package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        if (robot.getX() > toX) {
            changeDirectionToLeft(robot);
        } else {
            changeDirectionToRight(robot);
        }
        for (; (robot.getX() != toX); ) {
            robot.stepForward();
        }

        if (robot.getY() > toY) {
            changeDirectionToDown(robot);
        } else {
            changeDirectionToUp(robot);
        }
        for (; (robot.getY() != toY); ) {
            robot.stepForward();
        }
    }

    private void changeDirectionToUp(Robot robot) {
        switch (robot.getDirection()) {
            case DOWN:
                robot.turnLeft();
                robot.turnLeft();
                break;
            case RIGHT:
                robot.turnLeft();
                break;
            case LEFT:
                robot.turnRight();
                break;
            default:
                break;

        }
    }

    private void changeDirectionToDown(Robot robot) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnLeft();
                robot.turnLeft();
                break;
            case LEFT:
                robot.turnLeft();
                break;
            case RIGHT:
                robot.turnRight();
                break;
            default:
                break;
        }
    }

    private void changeDirectionToRight(Robot robot) {
        switch (robot.getDirection()) {
            case LEFT:
                robot.turnLeft();
                robot.turnLeft();
                break;
            case DOWN:
                robot.turnLeft();
                break;
            case UP:
                robot.turnRight();
                break;
            default:
                break;

        }
    }

    private void changeDirectionToLeft(Robot robot) {
        switch (robot.getDirection()) {
            case RIGHT:
                robot.turnLeft();
                robot.turnLeft();
                break;
            case UP:
                robot.turnLeft();
                break;
            case DOWN:
                robot.turnRight();
                break;
            default:
                break;
        }
    }
}
