package core.basesyntax;

public class RobotRoute {
    private Direction directionToMove;

    public void moveRobot(Robot robot, int toX, int toY) {
        while (toX != robot.getX()) {
            compareCoordinates(robot, toX, toY);
            robot.stepForward();
        }
        while (toY != robot.getY()) {
            compareCoordinates(robot, toX, toY);
            robot.stepForward();
        }
    }

    public void compareCoordinates(Robot robot, int toX, int toY) {
        if (robot.getX() == toX) {
            directionToMove = robot.getY() < toY ? Direction.UP : Direction.DOWN;
            correctDirection(robot, directionToMove);
            return;
        }
        if (robot.getY() == toY) {
            directionToMove = robot.getX() < toX ? Direction.RIGHT : Direction.LEFT;
            correctDirection(robot, directionToMove);
            return;
        }
        if (robot.getX() < toX) {
            directionToMove = Direction.RIGHT;
            correctDirection(robot, directionToMove);
            return;
        }
        if (robot.getX() > toX) {
            directionToMove = Direction.LEFT;
            correctDirection(robot, directionToMove);
            return;
        }
        if (robot.getY() < toY) {
            directionToMove = Direction.UP;
            correctDirection(robot, directionToMove);
            return;
        }
        if (robot.getY() > toY) {
            directionToMove = Direction.DOWN;
            correctDirection(robot, directionToMove);
            return;
        }
    }

    public void correctDirection(Robot robot, Direction directionToMove) {
        if (directionToMove == robot.getDirection()) {
            return;
        }
        if (directionToMove == Direction.UP & robot.getDirection() == Direction.DOWN
                || directionToMove == Direction.DOWN & robot.getDirection() == Direction.UP
                || directionToMove == Direction.LEFT & robot.getDirection() == Direction.RIGHT
                || directionToMove == Direction.RIGHT & robot.getDirection() == Direction.LEFT) {
            while (directionToMove != robot.getDirection()) {
                robot.turnLeft();
            }
            return;
        }
        if (directionToMove == Direction.UP & robot.getDirection() == Direction.LEFT
                || directionToMove == Direction.DOWN & robot.getDirection() == Direction.RIGHT
                || directionToMove == Direction.LEFT & robot.getDirection() == Direction.DOWN
                || directionToMove == Direction.RIGHT & robot.getDirection() == Direction.UP) {
            robot.turnRight();
        } else {
            robot.turnLeft();
        }
    }
}
