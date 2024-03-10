package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            Direction mustGo = Direction.RIGHT;
            while (robot.getDirection() != mustGo) {
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.RIGHT) {
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            }
        }

        if (robot.getX() > toX) {
            Direction mustGo = Direction.LEFT;
            while (robot.getDirection() != mustGo) {
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.LEFT) {
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            }
        }

        if (robot.getY() < toY) {
            Direction mustGo = Direction.UP;
            while (robot.getDirection() != mustGo) {
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.UP) {
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        }

        if (robot.getY() > toY) {
            Direction mustGo = Direction.DOWN;
            while (robot.getDirection() != mustGo) {
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.DOWN) {
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        }
    }
}
