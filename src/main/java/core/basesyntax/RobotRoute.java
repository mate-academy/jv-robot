package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        boolean isUpSteep = true;
        if (robot.getX() > toX) {
            returnToTheDirection(robot, Direction.LEFT);
            goToTheGoal(robot, robot.getX(), toX, !isUpSteep);
        } else if (robot.getX() < toX) {
            returnToTheDirection(robot, Direction.RIGHT);
            goToTheGoal(robot, robot.getX(), toX, isUpSteep);
        }
        if (robot.getY() > toY) {
            returnToTheDirection(robot, Direction.DOWN);
            goToTheGoal(robot, robot.getY(), toY, !isUpSteep);
        } else if (robot.getY() < toY) {
            returnToTheDirection(robot, Direction.UP);
            goToTheGoal(robot, robot.getY(), toY, isUpSteep);
        }
    }

    public void returnToTheDirection(Robot robot, Direction neededDirection) {
        while (robot.getDirection() != neededDirection) {
            robot.turnRight();
        }
    }

    public void goToTheGoal(Robot robot, int startCoordinate, int endCoordinate, boolean isUp) {
        while (startCoordinate != endCoordinate) {
            if (isUp) {
                startCoordinate++;
            } else {
                startCoordinate--;
            }
            robot.stepForward();
        }
    }
}
