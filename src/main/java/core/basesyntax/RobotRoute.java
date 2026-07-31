package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX > robot.getX()) {
            while (robot.getDirection() != Direction.RIGHT) {
                if (robot.getDirection() == Direction.UP) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
            }
        } else if (toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                if (robot.getDirection() == Direction.DOWN) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }

        if (toY > robot.getY()) {
            while (robot.getDirection() != Direction.UP) {
                if (robot.getDirection() == Direction.LEFT) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
            }
        } else if (toY < robot.getY()) {
            while (robot.getDirection() != Direction.DOWN) {
                if (robot.getDirection() == Direction.RIGHT) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
