package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            while (toX > robot.getX() && !robot.getDirection().equals(Direction.RIGHT)) {
                robot.turnRight();
            }

            while (toX > robot.getX() && robot.getDirection().equals(Direction.RIGHT)) {
                robot.stepForward();
            }

            while (toX < robot.getX() && !robot.getDirection().equals(Direction.LEFT)) {
                robot.turnRight();
            }

            while (toX < robot.getX() && robot.getDirection().equals(Direction.LEFT)) {
                robot.stepForward();
            }
        }
        while (toY != robot.getY()) {
            while (toY > robot.getY() && !robot.getDirection().equals(Direction.UP)) {
                robot.turnLeft();
            }

            while (toY > robot.getY() && robot.getDirection().equals(Direction.UP)) {
                robot.stepForward();
            }

            while (toY < robot.getY() && !robot.getDirection().equals(Direction.DOWN)) {
                robot.turnLeft();
            }

            while (toY < robot.getY() && robot.getDirection().equals(Direction.DOWN)) {
                robot.stepForward();
            }
        }
    }
}
