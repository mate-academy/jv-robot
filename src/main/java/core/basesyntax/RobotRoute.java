package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int startX = robot.getX();
        int startY = robot.getY();

        if (startX >= toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (robot.getX() > toX) {
                robot.stepForward();
            }
            if (startY >= toY) {
                robot.turnLeft();
                while (robot.getY() > toY) {
                    robot.stepForward();
                }
            } else {
                robot.turnRight();
                while (robot.getY() < toY) {
                    robot.stepForward();
                }
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getX() < toX) {
                robot.stepForward();
            }
            if (startY >= toY) {
                robot.turnRight();
                while (robot.getY() > toY) {
                    robot.stepForward();
                }
            } else {
                robot.turnLeft();
                while (robot.getY() < toY) {
                    robot.stepForward();
                }
            }
        }
        System.out.println("x: " + robot.getX());
        System.out.println("y: " + robot.getY());
    }
}
