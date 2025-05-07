package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        movingToX(robot,toX);
        movingToY(robot,toY);
    }

    private void changeDirection(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnLeft();
        }
    }

    private void movingToX(Robot robot, int toX) {
        if (robot.getX() < toX) {
            changeDirection(robot, Direction.LEFT);
        } else if (robot.getX() > toX) {
            changeDirection(robot,Direction.RIGHT);
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    private void movingToY(Robot robot, int toY) {
        if (robot.getY() < toY) {
            changeDirection(robot, Direction.UP);
        } else if (robot.getY() > toY) {
            changeDirection(robot,Direction.DOWN);
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
