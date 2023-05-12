package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //move on x coordinate
        int coordinateX = robot.getX();
        if (coordinateX != toX) {
            if (coordinateX > toX) {
                //need go LEFT
                standInDirection(robot, Direction.LEFT);
            } else {
                //need go RIGHT
                standInDirection(robot, Direction.RIGHT);
            }
            goToXPosition(robot, toX);
        }

        //move on y coordinate
        int coordinateY = robot.getY();
        if (coordinateY != toY) {
            if (coordinateY > toY) {
                //need go DOWN
                standInDirection(robot, Direction.DOWN);
            } else {
                //need go UP
                standInDirection(robot, Direction.UP);
            }
            goToYPosition(robot, toY);
        }

    }

    private void standInDirection(Robot robot, Direction direction) {

        Direction actualDirection = robot.getDirection();
        if (actualDirection != direction) {
            robot.turnLeft();
            standInDirection(robot, direction);
        }

    }

    private void goToXPosition(Robot robot, int toX) {

        do {
            robot.stepForward();
        } while (robot.getX() != toX);

    }

    private void goToYPosition(Robot robot, int toY) {

        do {
            robot.stepForward();
        } while (robot.getY() != toY);

    }
}
