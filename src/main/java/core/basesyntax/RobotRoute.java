package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        setCorrectDirectionOnX(robot,toX);
        checkDirectionOnRightWay(robot);
        goToTheX(robot, toX);
        setCorrectDirectionOnY(robot, toY);
        checkDirectionOnUpWay(robot);
        goToTheY(robot, toY);
    }

    public void setCorrectDirectionOnX(Robot robot, int toX) {
        if (robot.getX() < toX) {
            robot.setDirection(Direction.RIGHT);
        } else {
            robot.setDirection(Direction.LEFT);
        }
    }

    public void setCorrectDirectionOnY(Robot robot, int toY) {
        if (robot.getY() < toY) {
            robot.setDirection(Direction.UP);
        } else {
            robot.setDirection(Direction.DOWN);
        }
    }

    public boolean checkDirectionOnRightWay(Robot robot) {
        return robot.getDirection() == Direction.RIGHT;
    }

    public boolean checkDirectionOnUpWay(Robot robot) {
        return robot.getDirection() == Direction.UP;
    }

    public void goToTheX(Robot robot, int toX) {
        if (checkDirectionOnRightWay(robot)) {
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        } else {
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        }
    }

    public void goToTheY(Robot robot, int toY) {
        if (checkDirectionOnUpWay(robot)) {
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        } else {
            while (robot.getY() > toY) {
                robot.stepForward();
            }
        }
    }
}
