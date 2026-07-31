package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int startX = robot.getX();
        int startY = robot.getY();

        if (startX > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }

        } else if (startX < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            }
        }

        while (toX != robot.getX()) {
            robot.stepForward();
        }

        if (startY > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }

        } else if (startY < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
        }

        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }
}

