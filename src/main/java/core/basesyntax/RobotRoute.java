package core.basesyntax;

import javax.swing.plaf.basic.BasicArrowButton;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX || robot.getY() != toY) {
            while (robot.getDirection() != getDirectionToTarget(robot, toX, toY)) {
                robot.turnRight();
            }
            robot.stepForward();
        }
    }

    private Direction getDirectionToTarget(Robot robot, int toX, int toY) {
        if (toY > robot.getY()) {
            return Direction.UP;
        } else if (toY < robot.getY()) {
            return Direction.DOWN;
        } else if (toX > robot.getX()) {
            return Direction.RIGHT;
        } else {
            return Direction.LEFT;
        }
    }
}
