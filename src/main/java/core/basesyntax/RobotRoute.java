package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX == robot.getX() && toY == robot.getY()) {
            System.out.println("Robot is at home already.");
        }
        if (toX > robot.getX()) {
            do {
                robot.turnRight();
            } while (robot.getDirection() != Direction.RIGHT);
        }
        if (toX < robot.getX()) {
            do {
                robot.turnLeft();
            } while (robot.getDirection() != Direction.LEFT);
        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }
        if (toY > robot.getY()) {
            do {
                robot.turnRight();
            } while (robot.getDirection() != Direction.UP);
        }
        if (toY < robot.getY()) {
            do {
                robot.turnLeft();
            } while (robot.getDirection() != Direction.DOWN);
        }
        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }
}
