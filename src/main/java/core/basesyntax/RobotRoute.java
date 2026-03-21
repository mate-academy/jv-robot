package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            robot.getDirection();
            if (robot.getX() > toX && robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            if (robot.getX() < toX && robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.LEFT) {
                robot.stepForward();
            }
            if (robot.getDirection() == Direction.RIGHT) {
                robot.stepForward();
            }
            System.out.println(robot.getX() + " " + robot.getY() + " " + robot.getDirection());
        }

        while (robot.getY() != toY) {
            robot.getDirection();
            if (robot.getY() > toY && robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            if (robot.getY() < toY && robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.DOWN) {
                robot.stepForward();
            }
            if (robot.getDirection() == Direction.UP) {
                robot.stepForward();
            }
            System.out.println(robot.getX() + " " + robot.getY() + " " + robot.getDirection());
        }
    }
}
