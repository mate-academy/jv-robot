package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (true) {
            if (robot.getX() == toX) {
                break;
            }
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
            System.out.println("I'm in pos: x=" + robot.getX() + " and y=" + robot.getY()
                    + " dir=" + robot.getDirection());
        }

        while (true) {
            if (robot.getY() == toY) {
                break;
            }
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
            System.out.println("I'm in pos: x=" + robot.getX() + " and y=" + robot.getY() 
                    + " dir=" + robot.getDirection());
        }
        System.out.println("I'm in Home: x=" + robot.getX() + " and y=" + robot.getY());
    }
}
