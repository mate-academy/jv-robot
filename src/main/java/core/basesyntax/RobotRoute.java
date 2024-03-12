package core.basesyntax;

public class RobotRoute {
    private static void moveRobotByDirection(Robot robot, int toX, int toY) {
        if (robot.getDirection() == Direction.UP || robot.getDirection() == Direction.DOWN) {
            do {
                robot.stepForward();
            } while (robot.getY() != toY);
        } else {
            do {
                robot.stepForward();
            } while (robot.getX() != toX);
        }
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX > 0 && toY > 0 && robot.getDirection() == Direction.UP
                || toX < 0 && toY > 0 && robot.getDirection() == Direction.LEFT
                || toX > 0 && toY < 0 && robot.getDirection() == Direction.RIGHT
                || toX < 0 && toY < 0 && robot.getDirection() == Direction.DOWN) {
            moveRobotByDirection(robot, toX, toY);
            robot.turnRight();
            moveRobotByDirection(robot, toX, toY);
        } else if (toX > 0 && toY > 0 && robot.getDirection() == Direction.DOWN
                || toX < 0 && toY > 0 && robot.getDirection() == Direction.RIGHT
                || toX > 0 && toY < 0 && robot.getDirection() == Direction.LEFT
                || toX < 0 && toY < 0 && robot.getDirection() == Direction.UP) {
            robot.turnLeft();
            moveRobotByDirection(robot, toX, toY);
            robot.turnLeft();
            moveRobotByDirection(robot, toX, toY);
        } else if (toX > 0 && toY > 0 && robot.getDirection() == Direction.LEFT
                || toX < 0 && toY > 0 && robot.getDirection() == Direction.DOWN
                || toX > 0 && toY < 0 && robot.getDirection() == Direction.UP
                || toX < 0 && toY < 0 && robot.getDirection() == Direction.RIGHT) {
            robot.turnRight();
            moveRobotByDirection(robot, toX, toY);
            robot.turnRight();
            moveRobotByDirection(robot, toX, toY);
        } else if (toX > 0 && toY > 0 && robot.getDirection() == Direction.RIGHT
                || toX < 0 && toY > 0 && robot.getDirection() == Direction.UP
                || toX > 0 && toY < 0 && robot.getDirection() == Direction.DOWN
                || toX < 0 && toY < 0 && robot.getDirection() == Direction.LEFT) {
            moveRobotByDirection(robot, toX, toY);
            robot.turnLeft();
            moveRobotByDirection(robot, toX, toY);
        }
    }
}
