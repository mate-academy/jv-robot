package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();
        Direction direction = robot.getDirection();

        //Standing on the home x coordinate
        if (x == toX) {
            if (y > toY) {
                while (!robot.getDirection().equals(Direction.DOWN)) {
                    robot.turnLeft();
                }
                for (int step = 1; step <= (y - toY); step++) {
                    robot.stepForward();
                }
            } else if (y < toY) {
                while (!robot.getDirection().equals(Direction.UP)) {
                    robot.turnLeft();
                }
                for (int step = 1; step <= (toY - y); step++) {
                    robot.stepForward();
                }
            }
        }

        //Standing on the home y coordinate
        if (y == toY) {
            if (x > toX) {
                while (!robot.getDirection().equals(Direction.LEFT)) {
                    robot.turnLeft();
                }
                for (int step = 1; step <= (x - toX); step++) {
                    robot.stepForward();
                }
            } else if (x < toX) {
                while (!robot.getDirection().equals(Direction.RIGHT)) {
                    robot.turnLeft();
                }
                for (int step = 1; step <= (toX - x); step++) {
                    robot.stepForward();
                }
            }
        }

        if (x > toX) {
            if (y > toY) {
                while (!robot.getDirection().equals(Direction.DOWN)) {
                    robot.turnLeft();
                }
                for (int step = 1; step <= (y - toY); step++) {
                    robot.stepForward();
                }
            } else if (y < toY) {
                while (!robot.getDirection().equals(Direction.UP)) {
                    robot.turnLeft();
                }
                for (int step = 1; step <= (toY - y); step++) {
                    robot.stepForward();
                }
            }

            while (!robot.getDirection().equals(Direction.LEFT)) {
                robot.turnLeft();
            }

            for (int step = 1; step <= (x - toX); step++) {
                robot.stepForward();
            }
        }

        if (x < toX) {
            if (y > toY) {
                while (!robot.getDirection().equals(Direction.DOWN)) {
                    robot.turnLeft();
                }
                for (int step = 1; step <= (y - toY); step++) {
                    robot.stepForward();
                }
            } else if (y < toY) {
                while (!robot.getDirection().equals(Direction.UP)) {
                    robot.turnLeft();
                }
                for (int step = 1; step <= (toY - y); step++) {
                    robot.stepForward();
                }
            }

            while (!robot.getDirection().equals(Direction.RIGHT)) {
                robot.turnLeft();
            }

            for (int step = 1; step <= (toX - x); step++) {
                robot.stepForward();
            }
        }

    }
}
