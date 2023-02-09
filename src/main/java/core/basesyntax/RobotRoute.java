package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            while (!robot.getDirection().equals(Direction.RIGHT) && toX > robot.getX()) {
                robot.turnRight();
            }
            while (!robot.getDirection().equals(Direction.LEFT) && toX < robot.getX()) {
                robot.turnLeft();
            }
            for (int i = 0; i < Math.abs(robot.getX() - toX); i++) {
                robot.stepForward();
            }
        }

        while (robot.getY() != toY) {
            while (!robot.getDirection().equals(Direction.UP) && toY > robot.getY()) {
                robot.turnRight();
            }
            while (!robot.getDirection().equals(Direction.DOWN) && toY < robot.getY()) {
                robot.turnLeft();
            }
            for (int i = 0; i < Math.abs(robot.getY() - toY); i++) {
                robot.stepForward();
            }
        }
    }
}
