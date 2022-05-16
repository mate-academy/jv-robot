package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        boolean moveUp = robot.getY() < toY;
        boolean moveRight = robot.getX() < toX;
        robotHorizontalMove(robot, moveRight);
        robotMove(robot, toX);
        robotVerticalMove(robot, moveUp);
        robotMove(robot, toY);
    }

    private void robotVerticalMove(Robot robot, boolean moveUp) {
        if (moveUp) {
            while (!(robot.getDirection().toString().equals("UP"))) {
                robot.turnRight();
            }
        } else {
            while (!(robot.getDirection().toString().equals("DOWN"))) {
                robot.turnLeft();
            }
        }
    }

    private void robotMove(Robot robot, int end) {
        if ((robot.getDirection().toString().equals("UP"))
                || (robot.getDirection().toString().equals("DOWN"))) {
            while (robot.getY() != end) {
                robot.stepForward();
            }
        } else {
            while (robot.getX() != end) {
                robot.stepForward();
            }
        }
    }

    private void robotHorizontalMove(Robot robot, boolean moveRight) {
        if (moveRight) {
            while (!(robot.getDirection().toString().equals("RIGHT"))) {
                robot.turnRight();
            }
        } else {
            while (!(robot.getDirection().toString().equals("LEFT"))) {
                robot.turnLeft();
            }
        }
    }
}
