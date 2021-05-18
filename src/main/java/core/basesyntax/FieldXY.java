package core.basesyntax;

public class FieldXY {

    public void moveRobot(Robot robot, int toX, int toY) {

        if (toX < robot.getX()) {
            while (!robot.getDirection().equals(Direction.LEFT)) {
                robot.turnLeft();
            }
            while (robot.getX() >= toX) {
                robot.stepForward();
            }
        } else if (toX > robot.getX()) {
            while (!robot.getDirection().equals(Direction.RIGHT)) {
                robot.turnLeft();
            }
            while (robot.getX() <= toX) {
                robot.stepForward();
            }
        }

        if (toY < robot.getY()) {
            while (!robot.getDirection().equals(Direction.DOWN)) {
                robot.turnRight();
            }
            while (robot.getY() >= toY) {
                robot.stepForward();
            }
        } else if (toY > robot.getY()) {
            while (!robot.getDirection().equals(Direction.UP)) {
                robot.turnRight();
            }
            while (robot.getY() <= toY) {
                robot.stepForward();
            }
        }

    }
}

