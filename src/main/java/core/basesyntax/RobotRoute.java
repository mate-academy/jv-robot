package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction direction = robot.getDirection();
        Direction directionAlongX;
        Direction directionAlongY;

        int coordinateX = robot.getX();
        if (coordinateX > toX) {
            directionAlongX = Direction.LEFT;
        } else {
            directionAlongX = Direction.RIGHT;
        }

        while (direction != directionAlongX) {
            robot.turnLeft();
            direction = robot.getDirection();
        }

        while (coordinateX != toX) {
            robot.stepForward();
            coordinateX = robot.getX();
        }

        int coordinateY = robot.getY();
        if (coordinateY > toY) {
            directionAlongY = Direction.DOWN;
        } else {
            directionAlongY = Direction.UP;
        }

        while (direction != directionAlongY) {
            robot.turnLeft();
            direction = robot.getDirection();
        }

        while (coordinateY != toY) {
            robot.stepForward();
            coordinateY = robot.getY();
        }
    }
}
