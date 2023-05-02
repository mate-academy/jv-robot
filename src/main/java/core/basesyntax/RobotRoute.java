package core.basesyntax;

public class RobotRoute {

    private int robotX;
    private int robotY;
    private Direction robotDirection;
    private Robot robot;

    public void moveRobot(Robot robot, int toX, int toY) {
        this.robot = robot;
        moveToX(toX);
        moveToY(toY);
    }

    public void moveToX(int toX) {
        robotX = robot.getX();
        robotDirection = robot.getDirection();
        if (toX < robotX) {
            while (robotDirection != Direction.LEFT) {
                robot.turnLeft();
                robotDirection = robot.getDirection();
            }
        } else {
            while (robotDirection != Direction.RIGHT) {
                robot.turnRight();
                robotDirection = robot.getDirection();
            }
        }
        while (toX != robotX) {
            robot.stepForward();
            robotX = robot.getX();
        }
    }

    public void moveToY(int toY) {
        robotY = robot.getY();
        if (toY < robotY) {
            while (robotDirection != Direction.DOWN) {
                robot.turnLeft();
                robotDirection = robot.getDirection();
            }
        } else {
            while (robotDirection != Direction.UP){
                robot.turnRight();
                robotDirection = robot.getDirection();
            }
        }
        while (toY != robotY) {
            robot.stepForward();
            robotY = robot.getY();
        }
    }
}
