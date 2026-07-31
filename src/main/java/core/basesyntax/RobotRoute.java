package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (true) {
            if (robot.getX() == toX && robot.getY() == toY) {
                break;
            }

            while (robot.getX() != toX) {
                if (toX > robot.getX()) {
                    while (robot.getDirection() != Direction.RIGHT) {
                        robot.turnRight();
                    }
                } else {
                    while (robot.getDirection() != Direction.LEFT) {
                        robot.turnRight();
                    }
                }
                robot.stepForward();
            }

            while (robot.getY() != toY) {
                if (toY > robot.getX()) {
                    while (robot.getDirection() != Direction.UP) {
                        robot.turnRight();
                    }
                } else {
                    while (robot.getDirection() != Direction.DOWN) {
                        robot.turnRight();
                    }
                }
                robot.stepForward();
            }
        }
    }
}
