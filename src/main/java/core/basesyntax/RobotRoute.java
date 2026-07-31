package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int numberX = robot.getX();
        int numberY = robot.getY();
        if (numberX > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
            for (int i = toX; i < numberX; i++) {
                robot.stepForward();
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            for (int i = numberX; i < toX; i++) {
                robot.stepForward();
            }
        }

        if (numberY > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            for (int i = toY; i < numberY; i++) {
                robot.stepForward();
            }
        } else {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            for (int i = numberY; i < toY; i++) {
                robot.stepForward();
            }
        }
    }
}

