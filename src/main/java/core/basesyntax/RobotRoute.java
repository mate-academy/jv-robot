package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            if (robot.getX() > toX && robot.getDirection() == Direction.LEFT) {
                robot.stepForward();
            } else if (robot.getX() > toX) {
                robot.turnLeft();
            }
            if (robot.getX() < toX && robot.getDirection() == Direction.RIGHT) {
                robot.stepForward();
            } else if (robot.getX() < toX) {
                robot.turnRight();
            }
            System.out.println("I`m at x: " + robot.getX() + " y: " + robot.getY() + " dir: "
                    + robot.getDirection());
        }
        while (robot.getY() != toY) {
            if (robot.getY() > toY && robot.getDirection() == Direction.DOWN) {
                robot.stepForward();
            } else if (robot.getY() > toY) {
                robot.turnRight();
            }
            if (robot.getY() < toY && robot.getDirection() == Direction.UP) {
                robot.stepForward();
            } else if (robot.getY() < toY) {
                robot.turnLeft();
            }
            System.out.println("I`m at x: " + robot.getX() + " y: " + robot.getY() + " dir: "
                    + robot.getDirection());
        }
        System.out.println("I`m at destination x: " + robot.getX() + " y: " + robot.getY());
    }
}
