package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        setDirectionToY(robot, toY);
        while (robot.getY() != toY) {
            robot.stepForward();
        }
        setDirectionToX(robot, toX);
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    private void setDirectionToY(Robot robot, int toY) {
        if (robot.getY() > toY) {
            turnToDirection(robot, Direction.DOWN);
        } else {
            turnToDirection(robot, Direction.UP);
        }
    }

    private void setDirectionToX(Robot robot, int toX) {
        if (robot.getX() > toX) {
            turnToDirection(robot, Direction.LEFT);
        } else {
            turnToDirection(robot, Direction.RIGHT);
        }
    }

    private void turnToDirection(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnRight();
        }
    }

}
