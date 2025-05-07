package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                if (robot.getDirection().equals(Direction.UP)) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
            }
        } else if (toX > robot.getX()) {
            while (robot.getDirection() != Direction.RIGHT) {
                if (robot.getDirection().equals(Direction.UP)) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
            }
        }
        if (toX != robot.getX()) {
            while (toX != robot.getX()) {
                robot.stepForward();
            }
        }
        if (toY < robot.getY()) {
            while (robot.getDirection() != Direction.DOWN) {
                if (robot.getDirection().equals(Direction.LEFT)) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
            }
        } else if (toY > robot.getY()) {
            while (robot.getDirection() != Direction.UP) {
                if (robot.getDirection().equals(Direction.LEFT)) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
            }
        }
        if (toY != robot.getY()) {
            while (toY != robot.getY()) {
                robot.stepForward();
            }
        }
    }
}
