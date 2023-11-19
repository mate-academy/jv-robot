package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int actualX = robot.getX();
        int actualY = robot.getY();

        if (actualX > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
            do {
                robot.stepForward();
            } while (robot.getX() != toX);
        } else if (actualX < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            do {
                robot.stepForward();
            } while (robot.getX() != toX);
        }

        if (actualY > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            do {
                robot.stepForward();
            } while (robot.getY() != toY);
        } else if (actualY < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            do {
                robot.stepForward();
            } while (robot.getY() != toY);
        }
    }
}

