package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        Direction direction = robot.getDirection();

        if (robot.getX() < toX) {
            while (direction != Direction.RIGHT) {
                robot.turnRight();
                direction = robot.getDirection();
            }

            while (robot.getX() != toX) {
                robot.stepForward();
            }
        } else if (robot.getX() > toX) {
            while (direction != Direction.LEFT) {
                robot.turnLeft();
                direction = robot.getDirection();
            }

            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        Direction direction2 = robot.getDirection();

        if (robot.getY() < toY) {
            while (direction2 != Direction.UP) {
                robot.turnRight();
                direction2 = robot.getDirection();
            }

            while (robot.getY() != toY) {
                robot.stepForward();
            }
        } else if (robot.getY() > toY) {
            while (direction2 != Direction.DOWN) {
                robot.turnLeft();
                direction2 = robot.getDirection();
            }

            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }

    }
}
