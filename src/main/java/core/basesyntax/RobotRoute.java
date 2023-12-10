package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveAlongX(robot, toX);
        moveAlongY(robot, toY);
    }

    private void moveAlongX(Robot robot, int toX) {
        if (toX > robot.getX()) {
            changeDirectionToRight(robot);
        } else {
            changeDirectionToLeft(robot);
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    private void moveAlongY(Robot robot, int toY) {
        if (toY > robot.getY()) {
            changeDirectionToUp(robot);
        } else {
            changeDirectionToDown(robot);
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void changeDirectionToUp(Robot robot) {
        switch (robot.getDirection()) {
            case UP:
                break;
            case DOWN:
                robot.turnLeft();
                robot.turnLeft();
                break;
            case LEFT:
                robot.turnRight();
                break;
            case RIGHT:
                robot.turnLeft();
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
            case DOWN:
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

    private void changeDirectionToLeft(Robot robot) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnLeft();
                break;
            case DOWN:
                robot.turnRight();
                break;
            case LEFT:
                break;
            case RIGHT:
                robot.turnRight();
                robot.turnRight();
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
                robot.turnRight();
                robot.turnRight();
                break;
            case RIGHT:
                break;
            default:
                break;
        }
    }
}
