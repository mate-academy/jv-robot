package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX < robot.getX() && toY < robot.getY()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
            robot.turnLeft();
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }

        if (toX > robot.getX() && toY > robot.getY()) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
            robot.turnLeft();
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }

        if (toX < robot.getX() && toY > robot.getY()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
            robot.turnRight();
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }

        if (toX > robot.getX() && toY < robot.getY()) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
            robot.turnRight();
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }

        if (toX == robot.getX() && toY < robot.getY()) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }

        if (toX == robot.getX() && toY > robot.getY()) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }

        if (toX < robot.getX() && toY == robot.getY()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (toX > robot.getX() && toY == robot.getY()) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

    }
}
