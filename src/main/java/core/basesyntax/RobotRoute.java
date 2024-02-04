package core.basesyntax;

import static core.basesyntax.Direction.DOWN;
import static core.basesyntax.Direction.LEFT;
import static core.basesyntax.Direction.RIGHT;
import static core.basesyntax.Direction.UP;


public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX || robot.getY() != toY) {
            if (robot.getX() < toX) {
                moveHorizontally(robot, RIGHT);
            } else if (robot.getX() > toX) {
                moveHorizontally(robot, LEFT);
            }

            if (robot.getY() < toY) {
                moveVertically(robot, UP);
            } else if (robot.getY() > toY) {
                moveVertically(robot, DOWN);
            }
        }
    }

    private void moveHorizontally(Robot robot, Direction targetDirection) {
        if (robot.getDirection() != targetDirection) {
            rotateToDirection(robot, targetDirection);
        }
        robot.stepForward();
    }

    private void moveVertically(Robot robot, Direction targetDirection) {
        rotateToDirection(robot, targetDirection);
        robot.stepForward();
    }

    private void rotateToDirection(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
    }
}
