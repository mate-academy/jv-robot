package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX > robot.getX()) {
            while (!robot.getDirection().equals(Direction.RIGHT)) {
                robot.turnRight();
            }
        }

        if (toX < robot.getX()) {
            while (!robot.getDirection().equals(Direction.LEFT)) {
                robot.turnLeft();
            }
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }

        if (toY > robot.getY()) {
            while (!robot.getDirection().equals(Direction.UP)) {
                robot.turnLeft();
            }
        }

        if (toY < robot.getY()) {
            while (!robot.getDirection().equals(Direction.DOWN)) {
                robot.turnLeft();
            }
        }

        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }
}
