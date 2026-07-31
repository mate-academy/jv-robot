package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            while (!robot.getDirection().equals(Direction.LEFT)) {
                robot.turnLeft();
                robot.getDirection();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
                robot.getX();
            }
        }
        if (robot.getY() > toY) {
            while (!robot.getDirection().equals(Direction.DOWN)) {
                robot.turnLeft();
                robot.getDirection();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
                robot.getY();
            }
        }
        if (robot.getX() < toX) {
            while (!robot.getDirection().equals(Direction.RIGHT)) {
                robot.turnRight();
                robot.getDirection();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
                robot.getX();
            }
        }
        if (robot.getY() < toY) {
            while (!robot.getDirection().equals(Direction.UP)) {
                robot.turnLeft();
                robot.getDirection();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
                robot.getY();
            }
        }
        if (robot.getX() == toX && robot.getY() == toY) {
            System.out.println("The robot has reached its destination.");
        }
    }
}

