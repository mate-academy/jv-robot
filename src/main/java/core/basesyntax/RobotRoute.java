package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX == robot.getX()) {
            if (Direction.UP.equals(robot.getDirection())) {
                for (int i = robot.getY(); i < toY; i++) {
                    robot.stepForward();
                }
            }
        }
        if (toX > robot.getX()) {

            if (Direction.UP.equals(robot.getDirection())) {
                robot.turnRight();
            }
            if (Direction.LEFT.equals(robot.getDirection())) {
                robot.turnRight();
                robot.turnRight();
            }
            for (int x = robot.getX(); x < toX; x++) {
                robot.stepForward();
            }

        }

        if (toX < robot.getX()) {
            if (Direction.RIGHT.equals(robot.getDirection())) {
                robot.turnLeft();
                robot.turnLeft();
                for (int x = robot.getX(); x > toX; x--) {
                    robot.stepForward();
                }
            }
            if (Direction.UP.equals(robot.getDirection())) {
                robot.turnLeft();
                for (int x = robot.getX(); x > toX; x--) {
                    robot.stepForward();
                }
            }
            if (Direction.LEFT.equals(robot.getDirection())) {
                for (int x = robot.getX(); x > toX; x--) {
                    robot.stepForward();
                }
            }

            if (Direction.DOWN.equals(robot.getDirection())) {
                robot.turnRight();
                for (int x = robot.getX(); x > toX; x--) {
                    robot.stepForward();
                }
            }

        }


        if (toY < robot.getY()) {
            if (Direction.LEFT.equals(robot.getDirection())) {
                robot.turnLeft();
                for (int y = robot.getY(); y > toY; y--) {
                    robot.stepForward();
                }
            }
            robot.turnRight();
            for (int y = robot.getY(); y > toY; y--) {
                robot.stepForward();
            }
        }

        if (toY > robot.getY()) {
            if (Direction.LEFT.equals(robot.getDirection())) {
                robot.turnRight();
                for (int y = robot.getY(); y < toY; y++) {
                    robot.stepForward();
                }
            }
            if (Direction.RIGHT.equals(robot.getDirection())) {
                robot.turnLeft();
                for (int y = robot.getY(); y < toY; y++) {
                    robot.stepForward();
                }
            }
        }

    }
}

