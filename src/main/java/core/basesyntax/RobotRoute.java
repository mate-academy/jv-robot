package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int a = robot.getX() - toX;
        int b = toX - robot.getX();
        int d = robot.getY() - toY;
        int e = toY - robot.getY();
        if (robot.getX() > toX) {
            while (!robot.getDirection().equals(Direction.LEFT)) {
                robot.turnLeft();
            }
            for (int i = 0; i < a; i++) {
                robot.stepForward();
            }
            if (robot.getY() < toY) {
                robot.turnRight();
                for (int i = 0; i < e; i++) {
                    robot.stepForward();
                }
            } else if (robot.getY() > toY) {
                robot.turnLeft();
                for (int i = 0; i < d; i++) {
                    robot.stepForward();
                }
            }

        }
        if (robot.getX() < toX) {
            while (!robot.getDirection().equals(Direction.RIGHT)) {
                robot.turnRight();
            }
            for (int i = 0; i < b; i++) {
                robot.stepForward();
            }
            if (robot.getY() < toY) {
                robot.turnLeft();
                for (int i = 0; i < e; i++) {
                    robot.stepForward();
                }
            } else if (robot.getY() > toY) {
                robot.turnRight();
                for (int i = 0; i < d; i++) {
                    robot.stepForward();
                }
            }
        }
        if (robot.getX() == toX) {
            if (robot.getY() < toY) {
                while (!robot.getDirection().equals(Direction.UP)) {
                    robot.turnRight();
                }
                for (int i = 0; i < e; i++) {
                    robot.stepForward();
                }
            } else if (robot.getY() > toY) {
                while (!robot.getDirection().equals(Direction.DOWN)) {
                    robot.turnRight();
                }
                for (int i = 0; i < d; i++) {
                    robot.stepForward();
                }
            }
        }
    }
}
