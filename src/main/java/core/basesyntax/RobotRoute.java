package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        // Turn robot to the left
        if (robot.getX() > toX) {
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
                robot.turnLeft();
            }

            if (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
            }

            if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
            }
        }

        // Turn robot to the right
        if (robot.getX() < toX) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
            }

            if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
                robot.turnRight();
            }

            if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
            }
        }

        // Move robot across the X aces
        while (robot.getX() != toX) {
            robot.stepForward();
        }

        // Turn robot to the down
        if (robot.getY() > toY) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
                robot.turnRight();
            }

            if (robot.getDirection() == Direction.RIGHT || robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
            }
        }

        // Turn robot to the up
        if (robot.getY() < toY) {
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
            }

            if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
                robot.turnRight();
            }

            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
            }
        }

        // Move robot across the Y aces
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
