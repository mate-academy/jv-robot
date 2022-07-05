package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                if (robot.getDirection().equals(Direction.DOWN)) {
                    robot.turnRight();
                } else if (robot.getDirection().equals(Direction.RIGHT)) {
                    robot.turnLeft();
                } else if (robot.getDirection().equals(Direction.UP)) {
                    robot.turnLeft();
                }
            }
        } else if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                if (robot.getDirection().equals(Direction.UP)) {
                    robot.turnRight();
                } else if (robot.getDirection().equals(Direction.DOWN)) {
                    robot.turnLeft();
                } else if (robot.getDirection().equals(Direction.LEFT)) {
                    robot.turnRight();
                }
            }
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }

        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                if (robot.getDirection().equals(Direction.DOWN)) {
                    robot.turnLeft();
                } else if (robot.getDirection().equals(Direction.LEFT)) {
                    robot.turnRight();
                } else if (robot.getDirection().equals(Direction.RIGHT)) {
                    robot.turnLeft();
                }
            }
        } else if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                if (robot.getDirection().equals(Direction.UP)) {
                    robot.turnLeft();
                } else if (robot.getDirection().equals(Direction.LEFT)) {
                    robot.turnLeft();
                } else if (robot.getDirection().equals(Direction.RIGHT)) {
                    robot.turnRight();
                }
            }
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
