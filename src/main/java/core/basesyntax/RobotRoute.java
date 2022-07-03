package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        if (toX > robot.getX()) {
            if (robot.getDirection() != Direction.DOWN) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
            } else {
                robot.turnLeft();
            }
        } else {
            if (robot.getDirection() != Direction.DOWN) {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
            } else {
                robot.turnRight();
            }
        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }
        if (toX > robot.getX()) {
            if (toY > robot.getY()) {
                robot.turnLeft();
            } else {
                robot.turnRight();
            }
        } else {
            if (toY > robot.getY()) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
        }
        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }
}

