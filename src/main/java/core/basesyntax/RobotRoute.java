package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX == robot.getX() && toY == robot.getY()) {
            return;
        } else {
            if (toX > robot.getX()) {
                lookRight(robot);
                goToCoordinate(robot, robot.getX(), toX);
            }
            if (toX < robot.getX()) {
                lookLeft(robot);
                goToCoordinate(robot, toX, robot.getX());
            }
            if (toY > robot.getY()) {
                lookUp(robot);
                goToCoordinate(robot, robot.getY(), toY);
            }
            if (toY < robot.getY()) {
                lookDown(robot);
                goToCoordinate(robot, toY, robot.getY());
            }
        }
    }

    private void lookUp(Robot robot) {
        if (robot.getDirection() == Direction.RIGHT) {
            robot.turnLeft();
            return;
        }
        if (robot.getDirection() == Direction.LEFT) {
            robot.turnRight();
            return;
        }
        if (robot.getDirection() == Direction.DOWN) {
            robot.turnRight();
            robot.turnRight();
        }
    }

    private void lookDown(Robot robot) {
        if (robot.getDirection() == Direction.RIGHT) {
            robot.turnRight();
            return;
        }
        if (robot.getDirection() == Direction.LEFT) {
            robot.turnLeft();
            return;
        }
        if (robot.getDirection() == Direction.UP) {
            robot.turnRight();
            robot.turnRight();
        }
    }

    private void lookRight(Robot robot) {
        if (robot.getDirection() == Direction.UP) {
            robot.turnRight();
            return;
        }
        if (robot.getDirection() == Direction.LEFT) {
            robot.turnRight();
            robot.turnRight();
            return;
        }
        if (robot.getDirection() == Direction.DOWN) {
            robot.turnLeft();
        }
    }

    private void lookLeft(Robot robot) {
        if (robot.getDirection() == Direction.UP) {
            robot.turnLeft();
            return;
        }
        if (robot.getDirection() == Direction.RIGHT) {
            robot.turnRight();
            robot.turnRight();
            return;
        }
        if (robot.getDirection() == Direction.DOWN) {
            robot.turnRight();
        }
    }

    private void goToCoordinate(Robot robot, int currentPos, int finish) {
        for (int i = currentPos; i < finish; i++) {
            robot.stepForward();
        }
    }

}
