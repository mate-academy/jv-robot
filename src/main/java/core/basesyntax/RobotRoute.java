package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction direction = robot.getDirection();
        int x = robot.getX();
        int y = robot.getY();

        if (x != toX) {
            while (!direction.equals(x < toX ? Direction.RIGHT : Direction.LEFT)) {
                robot.turnRight();
                direction = robot.getDirection();
            }

            while (x != toX) {
                robot.stepForward();
                x = robot.getX();;
            }
        }

        if (y != toY) {
            while (!direction.equals(y < toY ? Direction.UP : Direction.DOWN)) {
                robot.turnLeft();
                direction = robot.getDirection();
            }

            while (y != toY) {
                robot.stepForward();
                y = robot.getY();;
            }
        }
    }
}
