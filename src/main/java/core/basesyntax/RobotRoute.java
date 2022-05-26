package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //get the current coordinates
        int coordinateX = robot.getX();
        int stepsX = 0;

        Direction direction = robot.getDirection();
        if (coordinateX > toX) {
            stepsX = coordinateX - toX;
            //LEFT
            if (direction == Direction.UP) {
                robot.turnLeft();
            }
            if (direction == Direction.DOWN) {
                robot.turnRight();
            }
            if (direction == Direction.RIGHT) {
                robot.turnRight();
                robot.turnRight();
            }
        } else if (coordinateX < toX) {
            stepsX = toX - coordinateX;
            //RIGHT
            if (direction == Direction.UP) {
                robot.turnRight();
            }
            if (direction == Direction.DOWN) {
                robot.turnLeft();
            }
            if (direction == Direction.LEFT) {
                robot.turnRight();
                robot.turnRight();
            }
        }
        for (int i = 1; i <= stepsX; i++) {
            robot.stepForward();
        }

        int coordinateY = robot.getY();
        int stepsY = 0;
        direction = robot.getDirection();
        if (coordinateY > toY) {
            //DOWN
            stepsY = coordinateY - toY;
            if (direction == Direction.RIGHT) {
                robot.turnRight();
            }
            if (direction == Direction.LEFT) {
                robot.turnLeft();
            }
            if (direction == Direction.UP) {
                robot.turnRight();
                robot.turnRight();
            }
        } else if (coordinateY < toY) {
            stepsY = toY - coordinateY;
            //UP
            if (direction == Direction.RIGHT) {
                robot.turnLeft();
            }
            if (direction == Direction.LEFT) {
                robot.turnRight();
            }
            if (direction == Direction.DOWN) {
                robot.turnRight();
                robot.turnRight();
            }
        }
        for (int i = 1; i <= stepsY; i++) {
            robot.stepForward();
        }

    }
}
