package core.basesyntax;

import static core.basesyntax.Direction.DOWN;
import static core.basesyntax.Direction.LEFT;
import static core.basesyntax.Direction.RIGHT;
import static core.basesyntax.Direction.UP;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        if (robot.getX() != toX) {
            moveRobotAlongAxisX(robot, toX);
        }
        if (robot.getY() != toY) {
            moveRobotAlongAxisY(robot, toY);
        }
    }

    private void moveRobotAlongAxisX(Robot robot, int toX) {
        Direction necessaryDirection = (toX < robot.getX()) ? LEFT : RIGHT;
        if (robot.getDirection() != necessaryDirection) {
            turnRobotToX(robot, necessaryDirection);
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    private void turnRobotToX(Robot robot, Direction necessaryDirection) {
        if (necessaryDirection == LEFT && robot.getDirection() == DOWN) {
            robot.turnRight();
        } else if (necessaryDirection == RIGHT && robot.getDirection() == UP) {
            robot.turnRight();
        } else {
            do {
                robot.turnLeft();
            } while (necessaryDirection != robot.getDirection());
        }
    }

    private void moveRobotAlongAxisY(Robot robot, int toY) {
        Direction necessaryDirection = (toY < robot.getY()) ? DOWN : UP;
        if (robot.getDirection() != necessaryDirection) {
            turnRobotToY(robot, necessaryDirection);
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void turnRobotToY(Robot robot, Direction necessaryDirection) {
        if (necessaryDirection == UP && robot.getDirection() == LEFT) {
            robot.turnRight();
        } else if (necessaryDirection == DOWN && robot.getDirection() == RIGHT) {
            robot.turnRight();
        } else {
            do {
                robot.turnLeft();
            } while (necessaryDirection != robot.getDirection());
        }
    }
}
