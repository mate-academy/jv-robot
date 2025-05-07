package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            if (robot.getDirection().equals(Direction.UP)) {
                robot.turnLeft();
            }
            if (robot.getDirection().equals(Direction.RIGHT)) {
                robot.turnLeft();
                robot.turnLeft();
            }
            if (robot.getDirection().equals(Direction.DOWN)) {
                robot.turnRight();
            }
            if (robot.getDirection().equals(Direction.LEFT)) {
                robot.stepForward();
            }
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        }
        if (robot.getX() < toX) {
            if (robot.getDirection().equals(Direction.UP)) {
                robot.turnRight();
            }
            if (robot.getDirection().equals(Direction.RIGHT)) {
                robot.stepForward();
            }
            if (robot.getDirection().equals(Direction.DOWN)) {
                robot.turnLeft();
            }
            if (robot.getDirection().equals(Direction.LEFT)) {
                robot.turnRight();
                robot.turnRight();
            }
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        }
        if (robot.getX() == toX) {
            if (robot.getY() < toY) {
                if (robot.getDirection().equals(Direction.RIGHT)) {
                    robot.turnLeft();
                }
                if (robot.getDirection().equals(Direction.DOWN)) {
                    robot.turnLeft();
                    robot.turnLeft();
                }
                if (robot.getDirection().equals(Direction.LEFT)) {
                    robot.turnRight();
                }
                if (robot.getDirection().equals(Direction.UP)) {
                    robot.stepForward();
                }
                while (robot.getY() < toY) {
                    robot.stepForward();
                }
            }
            if (robot.getY() > toY) {
                if (robot.getDirection().equals(Direction.RIGHT)) {
                    robot.turnRight();
                }
                if (robot.getDirection().equals(Direction.LEFT)) {
                    robot.turnLeft();
                }
                if (robot.getDirection().equals(Direction.UP)) {
                    robot.turnLeft();
                    robot.turnLeft();
                }
                if (robot.getDirection().equals(Direction.DOWN)) {
                    robot.stepForward();

                }
                while (robot.getY() > toY) {
                    robot.stepForward();
                }

            }
        }
    }
}

