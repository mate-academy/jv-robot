package core.basesyntax;

public class FieldXY {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (toX > robot.getX()) {
            while (robot.getDirection() != Direction.RIGHT) {
                if (robot.getDirection() == Direction.DOWN) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
            }
            robot.stepForward();
        }
        while (toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                if (robot.getDirection() == Direction.DOWN) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
            }
            robot.stepForward();
        }
        while (toY > robot.getY()) {
            while (robot.getDirection() != Direction.UP) {
                if (robot.getDirection() == Direction.RIGHT) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
            }
            robot.stepForward();
        }
        while (toY < robot.getY()) {
            while (robot.getDirection() != Direction.DOWN) {
                if (robot.getDirection() == Direction.RIGHT) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
            }
            robot.stepForward();
        }
    }
}

