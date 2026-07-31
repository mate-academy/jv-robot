package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        if (toX < robot.getX() && robot.getDirection().equals(Direction.UP)) {
            robot.turnLeft();
        }
        if (toX < robot.getX() && robot.getDirection().equals(Direction.DOWN)) {
            robot.turnRight();
        }
        if (toX < robot.getX() && robot.getDirection().equals(Direction.RIGHT)) {
            robot.turnRight();
            robot.turnRight();
        }
        if (toX > robot.getX() && robot.getDirection().equals(Direction.UP)) {
            robot.turnRight();
        }
        if (toX > robot.getX() && robot.getDirection().equals(Direction.DOWN)) {
            robot.turnLeft();

        }
        if (toX > robot.getX() && robot.getDirection().equals(Direction.LEFT)) {
            robot.turnLeft();
            robot.turnLeft();
        }
        if (robot.getDirection().equals(Direction.LEFT)) {
            int x = robot.getX();
            for (int i = 0; i < (x - toX); i++) {
                robot.stepForward();
            }
        }
        if (robot.getDirection().equals(Direction.RIGHT)) {
            int x = robot.getX();
            for (int i = 0; i < (toX - x); i++) {
                robot.stepForward();
            }
        }
        if (toY < robot.getY() && robot.getDirection().equals(Direction.UP)) {
            robot.turnLeft();
            robot.turnLeft();
        }
        if (toY < robot.getY() && robot.getDirection().equals(Direction.RIGHT)) {
            robot.turnRight();
        }
        if (toY < robot.getY() && robot.getDirection().equals(Direction.LEFT)) {
            robot.turnLeft();
        }
        if (toY > robot.getY() && robot.getDirection().equals(Direction.DOWN)) {
            robot.turnLeft();
            robot.turnLeft();
        }
        if (toY > robot.getY() && robot.getDirection().equals(Direction.RIGHT)) {
            robot.turnLeft();
        }
        if (toY > robot.getY() && robot.getDirection().equals(Direction.LEFT)) {
            robot.turnRight();
        }
        if (robot.getDirection().equals(Direction.DOWN)) {
            int y = robot.getY();
            for (int i = 0; i < (y - toY); i++) {
                robot.stepForward();
            }
        }
        if (robot.getDirection().equals(Direction.UP)) {
            int y = robot.getY();
            for (int i = 0; i < (toY - y); i++) {
                robot.stepForward();
            }
        }
    }
}
