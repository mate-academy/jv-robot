package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here
        int differenceX = Math.abs(robot.getX() - toX);
        int differenceY = Math.abs(robot.getY() - toY);

        changeDiractionX(robot, toX);
        for (int i = 0; i < differenceX; i++) {
            robot.stepForward();
        }

        changeDiractionY(robot, toY);
        for (int i = 0; i < differenceY; i++) {
            robot.stepForward();
        }
    }

    private static void changeDiractionX(Robot robot, int toX) {
        if (robot.getDirection().equals(Direction.UP) && robot.getX() < toX) {
            robot.turnRight();
        } else if (robot.getDirection().equals(Direction.LEFT) && robot.getX() < toX) {
            robot.turnLeft();
            robot.turnLeft();
        } else if (robot.getDirection().equals(Direction.DOWN) && robot.getX() < toX) {
            robot.turnLeft();
        } else if (robot.getDirection().equals(Direction.UP) && robot.getX() > toX) {
            robot.turnLeft();
        } else if (robot.getDirection().equals(Direction.RIGHT) && robot.getX() > toX) {
            robot.turnLeft();
            robot.turnLeft();
        } else if (robot.getDirection().equals(Direction.DOWN) && robot.getX() > toX) {
            robot.turnRight();
        }
    }

    private static void changeDiractionY(Robot robot, int toY) {
        if (robot.getDirection().equals(Direction.UP) && robot.getY() > toY) {
            robot.turnLeft();
            robot.turnLeft();
        } else if (robot.getDirection().equals(Direction.RIGHT) && robot.getY() > toY) {
            robot.turnRight();
        } else if (robot.getDirection().equals(Direction.LEFT) && robot.getY() > toY) {
            robot.turnLeft();
        } else if (robot.getDirection().equals(Direction.DOWN) && robot.getY() < toY) {
            robot.turnLeft();
            robot.turnLeft();
        } else if (robot.getDirection().equals(Direction.RIGHT) && robot.getY() < toY) {
            robot.turnLeft();
        } else if (robot.getDirection().equals(Direction.LEFT) && robot.getY() < toY) {
            robot.turnRight();
        }
    }
}
