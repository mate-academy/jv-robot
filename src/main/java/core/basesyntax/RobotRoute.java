package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        switch (robot.getDirection()) {
            case UP:
                moveIfDirectionUP(robot, toX, toY);
                break;
            case DOWN:
                moveIfDirectionDown(robot, toX, toY);
                break;
            case LEFT:
                moveIfDirectionLeft(robot, toX, toY);
                break;
            case RIGHT:
                moveIfDirectionRight(robot, toX, toY);
                break;
            default: // Do nothing
        }
    }

    public void moveIfDirectionUP(Robot robot, int toX, int toY) {
        if (robot.getX() == toX && robot.getY() < toY) {
            goFwdY(robot, toY);
        }

        if (robot.getX() == toX && robot.getY() > toY) {
            robot.turnRight();
            goBackY(robot, toY);
        }

        if (robot.getX() < toX && robot.getY() == toY) {
            robot.turnRight();
            goFwdX(robot, toX);
        }

        if (robot.getX() > toX && robot.getY() == toY) {
            robot.turnLeft();
            goBackX(robot, toX);
        }

        if (robot.getX() < toX && robot.getY() < toY) {
            robot.turnRight();
            goFwdX(robot, toX);
            robot.turnLeft();
            goFwdY(robot, toY);
        }

        if (robot.getX() > toX && robot.getY() > toY) {
            robot.turnLeft();
            goBackX(robot, toX);
            robot.turnLeft();
            goBackY(robot, toY);
        }

        if (robot.getX() > toX && robot.getY() < toY) {
            robot.turnLeft();
            goBackX(robot, toX);
            robot.turnRight();
            goFwdY(robot, toY);
        }

        if (robot.getX() < toX && robot.getY() > toY) {
            robot.turnRight();
            goFwdX(robot, toX);
            robot.turnRight();
            goBackY(robot, toY);
        }
    }

    public void moveIfDirectionDown(Robot robot, int toX, int toY) {
        if (robot.getX() == toX && robot.getY() < toY) {
            robot.turnRight();
            goFwdY(robot, toY);
        }

        if (robot.getX() == toX && robot.getY() > toY) {
            goBackY(robot, toY);
        }

        if (robot.getX() < toX && robot.getY() == toY) {
            robot.turnLeft();
            goFwdX(robot, toX);
        }

        if (robot.getX() > toX && robot.getY() == toY) {
            robot.turnRight();
            goBackX(robot, toX);
        }

        if (robot.getX() < toX && robot.getY() < toY) {
            robot.turnLeft();
            goFwdX(robot, toX);
            robot.turnLeft();
            goFwdY(robot, toY);
        }

        if (robot.getX() > toX && robot.getY() > toY) {
            robot.turnRight();
            goBackX(robot, toX);
            robot.turnLeft();
            goBackY(robot, toY);
        }

        if (robot.getX() > toX && robot.getY() < toY) {
            robot.turnRight();
            goBackX(robot, toX);
            robot.turnRight();
            goFwdY(robot, toY);
        }

        if (robot.getX() < toX && robot.getY() > toY) {
            robot.turnLeft();
            goFwdX(robot, toX);
            robot.turnRight();
            goBackY(robot, toY);
        }
    }

    public void moveIfDirectionLeft(Robot robot, int toX, int toY) {
        if (robot.getX() == toX && robot.getY() < toY) {
            robot.turnRight();
            goFwdY(robot, toY);
        }

        if (robot.getX() == toX && robot.getY() > toY) {
            robot.turnLeft();
            goBackY(robot, toY);
        }

        if (robot.getX() < toX && robot.getY() == toY) {
            robot.turnRight();
            robot.turnRight();
            goFwdX(robot, toX);
        }

        if (robot.getX() > toX && robot.getY() == toY) {
            goBackX(robot, toX);
        }

        if (robot.getX() < toX && robot.getY() < toY) {
            robot.turnRight();
            robot.turnRight();
            goFwdX(robot, toX);
            robot.turnLeft();
            goFwdY(robot, toY);
        }

        if (robot.getX() > toX && robot.getY() > toY) {
            goBackX(robot, toX);
            robot.turnLeft();
            goBackY(robot, toY);
        }

        if (robot.getX() > toX && robot.getY() < toY) {
            goBackX(robot, toX);
            robot.turnRight();
            goFwdY(robot, toY);
        }

        if (robot.getX() < toX && robot.getY() > toY) {
            robot.turnLeft();
            robot.turnLeft();
            goFwdX(robot, toX);
            robot.turnRight();
            goBackY(robot, toY);
        }
    }

    public void moveIfDirectionRight(Robot robot, int toX, int toY) {
        if (robot.getX() == toX && robot.getY() < toY) {
            robot.turnLeft();
            goFwdY(robot, toY);
        }

        if (robot.getX() == toX && robot.getY() > toY) {
            robot.turnRight();
            goBackY(robot, toY);
        }

        if (robot.getX() < toX && robot.getY() == toY) {
            goFwdX(robot, toX);
        }

        if (robot.getX() > toX && robot.getY() == toY) {
            robot.turnLeft();
            robot.turnLeft();
            goBackX(robot, toX);
        }

        if (robot.getX() < toX && robot.getY() < toY) {
            goFwdX(robot, toX);
            robot.turnLeft();
            goFwdY(robot, toY);
        }

        if (robot.getX() > toX && robot.getY() > toY) {
            robot.turnLeft();
            robot.turnLeft();
            goBackX(robot, toX);
            robot.turnLeft();
            goBackY(robot, toY);
        }

        if (robot.getX() > toX && robot.getY() < toY) {
            robot.turnLeft();
            robot.turnLeft();
            goBackX(robot, toX);
            robot.turnRight();
            goFwdY(robot, toY);
        }

        if (robot.getX() < toX && robot.getY() > toY) {
            goFwdX(robot, toX);
            robot.turnRight();
            goBackY(robot, toY);
        }
    }

    private void goBackX(Robot robot, int toX) {
        for (int i = robot.getX(); i > toX; i--) {
            robot.stepForward();
        }
    }

    private void goFwdX(Robot robot, int toX) {
        for (int i = robot.getX(); i < toX; i++) {
            robot.stepForward();
        }
    }

    private void goBackY(Robot robot, int toY) {
        for (int j = robot.getY(); j > toY; j--) {
            robot.stepForward();
        }
    }

    private void goFwdY(Robot robot, int toY) {
        for (int j = robot.getY(); j < toY; j++) {
            robot.stepForward();
        }
    }
}
