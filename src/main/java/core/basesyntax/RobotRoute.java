package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int actualX = robot.getX();
        int actualY = robot.getY();
        if (actualX == toX && actualY == toY) {
            return;
        }
        if (actualX < toX) {
            changeDirection(robot, Direction.RIGHT);
        } else if (actualX > toX) {
            changeDirection(robot, Direction.LEFT);
        }
        while (actualX != toX) {
            robot.stepForward();
            actualX = robot.getX();
        }

        if (actualY < toY) {
            changeDirection(robot, Direction.UP);
        } else if (actualY > toY) {
            changeDirection(robot, Direction.DOWN);
        }
        while (actualY != toY) {
            robot.stepForward();
            actualY = robot.getY();
        }
    }

    private void changeDirection(Robot robot, Direction newDirection) {
        while (robot.getDirection() != newDirection) {
            robot.turnLeft();
        }
    }
}
