package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
                System.out.println("x = " + robot.getX() + "y = " + robot.getY());
            }
        }
        if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
                System.out.println("x = " + robot.getX() + "y = " + robot.getY());
            }
        }
        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
                System.out.println("x = " + robot.getX() + "y = " + robot.getY());
            }
        }
        if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
                System.out.println("x = " + robot.getX() + "y = " + robot.getY());
            }
        }
    }
}
