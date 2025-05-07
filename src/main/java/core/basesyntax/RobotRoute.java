package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        goToCorrectX(robot, toX);
        goToCorrectY(robot, toY);
    }

    public void changeDirection(Direction correctDirection, Robot robot) {
        while (robot.getDirection() != correctDirection) {
            robot.turnRight();
        }
    }

    public void goToCorrectX(Robot robot, int toX) {
        if (toX < robot.getX()) {
            changeDirection(Direction.LEFT, robot);
        } else {
            changeDirection(Direction.RIGHT, robot);
        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }
    }

    public void goToCorrectY(Robot robot, int toY) {
        if (toY < robot.getY()) {
            changeDirection(Direction.DOWN, robot);
        } else {
            changeDirection(Direction.UP, robot);
        }
        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }
}
