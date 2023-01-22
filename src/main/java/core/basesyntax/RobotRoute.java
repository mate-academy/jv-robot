package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction direction = robot.getDirection();
        int coordinateX = robot.getX();
        int coordinateY = robot.getY();

        if (coordinateX < toX) {
            do {
                robot.turnLeft();
                direction = robot.getDirection();
            } while (direction != Direction.RIGHT);

            do {
                robot.stepForward(toX);
                coordinateX = robot.getX();
            } while (coordinateX != toX);
        }
        if (coordinateY < toY) {
            do {
                robot.turnLeft();
                direction = robot.getDirection();
            } while (direction != Direction.UP);

            do {
                robot.stepForward(toY);
                coordinateY = robot.getY();
            } while (coordinateY != toY);
        }
        if (coordinateX > toX) {
            do {
                robot.turnLeft();
                direction = robot.getDirection();
            } while (direction != Direction.LEFT);

            do {
                robot.stepForward(toX);
                coordinateX = robot.getX();
            } while (coordinateX != toX);
        }
        if (coordinateY > toY) {
            do {
                robot.turnLeft();
                direction = robot.getDirection();
            } while (direction != Direction.DOWN);

            do {
                robot.stepForward(toY);
                coordinateY = robot.getY();
            } while (coordinateY != toY);
        }
    }
}
