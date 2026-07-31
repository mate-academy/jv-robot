package core.basesyntax;

public class RobotRoute {
    private void changeDirectionToLeft(Robot robot) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnLeft();
                break;
            case DOWN:
                robot.turnRight();
                break;
            case RIGHT:
                robot.turnLeft();
                robot.turnLeft();
                break;
            default:
                break;
        }
    }

    private void changeDirectionToRight(Robot robot) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnRight();
                break;
            case DOWN:
                robot.turnLeft();
                break;
            case LEFT:
                robot.turnLeft();
                robot.turnLeft();
                break;
            default:
                break;
        }
    }

    private void changeDirectionToUp(Robot robot) {
        switch (robot.getDirection()) {
            case LEFT:
                robot.turnRight();
                break;
            case RIGHT:
                robot.turnLeft();
                break;
            case DOWN:
                robot.turnLeft();
                robot.turnLeft();
                break;
            default:
                break;
        }
    }

    private void changeDirectionToDown(Robot robot) {
        switch (robot.getDirection()) {
            case LEFT:
                robot.turnLeft();
                break;
            case RIGHT:
                robot.turnRight();
                break;
            case UP:
                robot.turnLeft();
                robot.turnLeft();
                break;
            default:
                break;
        }
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            changeDirectionToLeft(robot);
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (robot.getX() < toX) {
            changeDirectionToRight(robot);
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (robot.getY() < toY) {
            changeDirectionToUp(robot);
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }

        if (robot.getY() > toY) {
            changeDirectionToDown(robot);
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }
}
