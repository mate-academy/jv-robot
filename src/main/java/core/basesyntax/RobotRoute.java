package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX == robot.getX() && toY == robot.getY()) {
            System.out.println("I am already home");
        }
        if (toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (toX != robot.getX()) {
                robot.stepForward();
            }
        }
        if (toX > robot.getX()) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            }
            while (toX != robot.getX()) {
                robot.stepForward();
            }
        }
        if (toY < robot.getY()) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            while (toY != robot.getY()) {
                robot.stepForward();
            }
        }
        if (toY > robot.getY()) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
            while (toY != robot.getY()) {
                robot.stepForward();
            }
        }
    }
}
