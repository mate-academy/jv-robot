package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() == toX && robot.getY() == toY) {
            System.out.println("Robot is in home now!");
        } else if (robot.getX() != toX) {
            int x = toX - robot.getX();
            if (x > 0) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
                for (int i = 0; i < x; i++) {
                    robot.stepForward();
                }
            } else {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
                for (int i = 0; i > x; i--) {
                    robot.stepForward();
                }
                }
            }
        if (robot.getY() != toY) {
            int y = toY - robot.getY();
            if (y > 0) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
                for (int i = 0; i < y; i++) {
                    robot.stepForward();
                }
            } else {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
                for (int i = 0; i > y; i--) {
                    robot.stepForward();
                }
                }
            }
    }
}
