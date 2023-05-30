package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveVertical(robot, toY);
        moveHorizontal(robot, toX);
    }

    private void moveVertical(Robot robot, int toY) {
        int startPosition = robot.getY();
        if (startPosition > toY) {
            this.robotTurnDown(robot);
        } else {
            this.robotTurnUp(robot);
        }
        for (int i = 0; i < Math.abs(toY - startPosition); i++) {
            robot.stepForward();
        }
    }

    private void moveHorizontal(Robot robot, int toX) {
        int startPosition = robot.getX();
        if (startPosition > toX) {
            this.robotTurnLeft(robot);
        } else {
            this.robotTurnRight(robot);
        }
        for (int i = 0; i < Math.abs(toX - startPosition); i++) {
            robot.stepForward();
        }
    }

    private void robotTurnUp(Robot robot) {
        while (robot.getDirection() != Direction.UP) {
            robot.turnLeft();
        }
    }

    private void robotTurnDown(Robot robot) {
        while (robot.getDirection() != Direction.DOWN) {
            robot.turnLeft();
        }
    }

    private void robotTurnLeft(Robot robot) {
        while (robot.getDirection() != Direction.LEFT) {
            robot.turnLeft();
        }
    }

    private void robotTurnRight(Robot robot) {
        while (robot.getDirection() != Direction.RIGHT) {
            robot.turnLeft();
        }
    }
}
