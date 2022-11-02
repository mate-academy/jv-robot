package core.basesyntax;

import static core.basesyntax.Direction.UP;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        if (toX > robot.getX()) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            getMove(robot, toX, robot.getX());
        }

        if (toY > robot.getY()) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            getMove(robot, toY, robot.getY());
        }

        if (toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
            getMove(robot, toX, robot.getX());
        }

        if (toY < robot.getY()) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            getMove(robot, toY, robot.getY());
        }
    }

    public void getMove(Robot robot, int to, int from) {
        while (to != from) {
            robot.stepForward();
            if (from < to) {
                from++;
            } else {
                from--;
            }
        }
    }
}
