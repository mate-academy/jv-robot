package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction direction = robot.getDirection();
        if (robot.getX() != toX) {
            if (robot.getX() > toX) {
                while (direction != Direction.LEFT) {
                    robot.turnLeft();
                    direction = robot.getDirection();
                }
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            }
            if (robot.getX() < toX) {
                while (direction != Direction.RIGHT) {
                    robot.turnRight();
                    direction = robot.getDirection();
                }
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            }
        }
        if (robot.getY() != toY) {
            if (robot.getY() > toY) {
                while (direction != Direction.DOWN) {
                    robot.turnLeft();
                    direction = robot.getDirection();
                }
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
            if (robot.getY() < toY) {
                while (direction != Direction.UP) {
                    robot.turnRight();
                    direction = robot.getDirection();
                }
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        }
    }
}
