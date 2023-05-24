package core.basesyntax;

public class RobotRoute {
    private Direction robotDirection;
    private Robot robot;

    public void moveRobot(Robot robot, int toX, int toY) {
        this.robot = robot;
        moveRobotToX(toX);
        moveRobotToY(toY);
    }

    public void moveRobotToX(int toX) {
        int robotX = robot.getX();
        if (robotX < toX) {
            while (robotDirection != Direction.RIGHT) {
                robot.turnRight();
                robotDirection = robot.getDirection();
            }
        } else {
            while (robotDirection != Direction.LEFT) {
                robot.turnLeft();
                robotDirection = robot.getDirection();
            }
        }
        while (robotX != toX) {
            robot.stepForward();
            robotX = robot.getX();
        }
    }

    public void moveRobotToY(int toY) {
        int robotY = robot.getY();
        if (robotY < toY) {
            while (robotDirection != Direction.UP) {
                robot.turnRight();
                robotDirection = robot.getDirection();
            }
        } else {
            while (robotDirection != Direction.DOWN) {
                robot.turnLeft();
                robotDirection = robot.getDirection();
            }
        }
        while (robotY != toY) {
            robot.stepForward();
            robotY = robot.getY();
        }
    }
}
