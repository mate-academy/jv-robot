package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentLocationX = robot.getX();
        int currentLocationY = robot.getY();

        if (currentLocationX > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        } else if (currentLocationX < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }

        while (toX != robot.getX()) {
            robot.stepForward();
        }

        if (currentLocationY > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        } else if (currentLocationY < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
        }

        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }
}

