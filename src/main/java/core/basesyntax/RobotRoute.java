package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        int robotX = robot.getX();
        int robotY = robot.getY();

        if (robotX < toX) {
            turnRobot(robot, Direction.RIGHT);
        } else if (robotX > toX) {
            turnRobot(robot, Direction.LEFT);
        }
        while (Math.abs(robot.getX() - toX) > 0) {
            robot.stepForward();
        }

        if (robotY < toY) {
            turnRobot(robot, Direction.UP);
        } else if (robotY > toY) {
            turnRobot(robot, Direction.DOWN);
        }
        while (Math.abs(robot.getY() - toY) > 0) {
            robot.stepForward();
        }
    }

    public void turnRobot(Robot robot, Direction expectDirection) {
        while (!robot.getDirection().equals(expectDirection)) {
            robot.turnRight();
        }
    }
}
