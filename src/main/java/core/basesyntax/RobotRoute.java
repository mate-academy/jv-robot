package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (toX != robot.getX() || toY != robot.getY()) {
            lookAround(robot, toX, toY);
        }
    }

    private void lookAround(Robot robot, int toX, int toY) {
        switch (robot.getDirection()) {
            case LEFT:
                lookLeft(robot, toX, toY);
                break;
            case RIGHT:
                lookRight(robot, toX, toY);
                break;
            case UP:
                lookUp(robot, toX, toY);
                break;
            case DOWN:
                lookDown(robot, toX, toY);
                break;
            default:
                break;
        }
    }

    private void lookLeft(Robot robot, int toX, int toY) {
        if (toX < robot.getX()) {
            goingLeft(robot, toX);
        } else if (toY > robot.getY()) {
            robot.turnRight();
            goingUp(robot, toY);
        } else if (toY < robot.getY()) {
            robot.turnLeft();
            goingDown(robot, toY);
        } else if (toX > robot.getX()) {
            robot.turnLeft();
            robot.turnLeft();
            goingRight(robot, toX);
        }
    }

    private void lookRight(Robot robot, int toX, int toY) {
        if (toX > robot.getX()) {
            goingRight(robot, toX);
        } else if (toY > robot.getY()) {
            robot.turnLeft();
            goingUp(robot, toY);
        } else if (toY < robot.getY()) {
            robot.turnRight();
            goingDown(robot, toY);
        } else if (toX < robot.getX()) {
            robot.turnLeft();
            robot.turnLeft();
            goingLeft(robot, toX);
        }
    }

    private void lookUp(Robot robot, int toX, int toY) {
        if (toY > robot.getY()) {
            goingUp(robot, toY);
        } else if (toX > robot.getX()) {
            robot.turnRight();
            goingRight(robot, toX);
        } else if (toX < robot.getX()) {
            robot.turnLeft();
            goingLeft(robot, toX);
        } else if (toY < robot.getY()) {
            robot.turnLeft();
            robot.turnLeft();
            goingDown(robot, toY);
        }
    }

    private void lookDown(Robot robot, int toX, int toY) {
        if (toY < robot.getY()) {
            goingDown(robot, toY);
        } else if (toX > robot.getX()) {
            robot.turnLeft();
            goingRight(robot, toX);
        } else if (toX < robot.getX()) {
            robot.turnRight();
            goingLeft(robot, toX);
        } else if (toY > robot.getY()) {
            robot.turnLeft();
            robot.turnLeft();
            goingUp(robot, toY);
        }
    }

    private void goingDown(Robot robot, int toY) {
        while (toY < robot.getY()) {
            robot.stepForward();
        }
    }

    private void goingUp(Robot robot, int toY) {
        while (toY > robot.getY()) {
            robot.stepForward();
        }
    }

    private void goingRight(Robot robot, int toX) {
        while (toX > robot.getX()) {
            robot.stepForward();
        }
    }

    private void goingLeft(Robot robot, int toX) {
        while (toX < robot.getX()) {
            robot.stepForward();
        }
    }
}
