package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getY() < toY && !robot.getDirection().equals(Direction.UP)) {
            robot.turnLeft();
        }
        while (robot.getY() > toY && !robot.getDirection().equals(Direction.DOWN)) {
            robot.turnLeft();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }

        while (robot.getX() < toX && !robot.getDirection().equals(Direction.LEFT)) {
            robot.turnLeft();
        }
        while (robot.getX() > toX && !robot.getDirection().equals(Direction.RIGHT)) {
            robot.turnLeft();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }

    }
}
