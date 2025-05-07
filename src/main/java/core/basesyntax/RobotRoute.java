package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int differenceX = Math.abs(robot.getX() - toX);

        changeDiractionX(robot, toX);
        for (int i = 0; i < differenceX; i++) {
            robot.stepForward();
        }

        int differenceY = Math.abs(robot.getY() - toY);

        changeDiractionY(robot, toY);
        for (int i = 0; i < differenceY; i++) {
            robot.stepForward();
        }
    }

    private static void changeDiractionX(Robot robot, int toX) {
        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }

        if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        }
    }

    private static void changeDiractionY(Robot robot, int toY) {
        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
        }

        if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        }
    }
}
