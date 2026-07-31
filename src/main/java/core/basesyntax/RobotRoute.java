package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX || robot.getY() != toY) {
            calibrateX(robot, toX);
            calibrateY(robot, toY);
        }
    }

    private void calibrateX(Robot robot, int toX) {
        int deltax = robot.getX() - toX;
        int absDeltax = Math.abs(deltax);
        for (; absDeltax > 0; absDeltax--) {
            if (deltax > 0) {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
            } else {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
            }
            robot.stepForward();
        }
    }

    private void calibrateY(Robot robot, int toY) {
        int deltay = robot.getY() - toY;
        int absDeltay = Math.abs(deltay);
        for (; absDeltay > 0; absDeltay--) {
            if (deltay > 0) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
            } else {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
            }
            robot.stepForward();
        }
    }
}
