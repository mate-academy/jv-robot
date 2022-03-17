package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        // X coordinate
        if (robot.getX() > toX && robot.getDirection().equals(Direction.LEFT)) {
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        } else if (robot.getX() > toX && !robot.getDirection().equals(Direction.LEFT)) {
            while (!robot.getDirection().equals(Direction.LEFT)) {
                robot.turnLeft();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }

        }
        if (robot.getX() < toX && robot.getDirection().equals(Direction.RIGHT)) {
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        } else if (robot.getX() < toX && !robot.getDirection().equals(Direction.RIGHT)) {
            while (!robot.getDirection().equals(Direction.RIGHT)) {
                robot.turnLeft();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }

        }
        // Y coordinate
        if (robot.getY() > toY && robot.getDirection().equals(Direction.DOWN)) {
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        } else if (robot.getY() > toY && !robot.getDirection().equals(Direction.DOWN)) {
            while (!robot.getDirection().equals(Direction.DOWN)) {
                robot.turnLeft();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }

        }
        if (robot.getY() < toY && robot.getDirection().equals(Direction.UP)) {
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        } else if (robot.getY() < toY && !robot.getDirection().equals(Direction.UP)) {
            while (!robot.getDirection().equals(Direction.UP)) {
                robot.turnLeft();
            }
            while (robot.getY() != toY) {
                robot.stepForward();

            }

        }

    }

}
