package core.basesyntax;

import static core.basesyntax.Direction.DOWN;
import static core.basesyntax.Direction.LEFT;
import static core.basesyntax.Direction.RIGHT;
import static core.basesyntax.Direction.UP;

import org.jetbrains.annotations.NotNull;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();
        int remainToX = toX - currentX;
        int remainToY = toY - currentY;

        while (remainToX != 0) {
            if (remainToX > 0) {
                if (robot.getDirection() != RIGHT) {
                    turn(robot, RIGHT);
                }
            } else {
                if (robot.getDirection() != LEFT) {
                    turn(robot, LEFT);
                }
            }
            robot.stepForward();
            remainToX = toX - robot.getX();
        }

        while (remainToY != 0) {
            if (remainToY > 0) {
                if (robot.getDirection() != UP) {
                    turn(robot, UP);
                }
            } else {
                if (robot.getDirection() != DOWN) {
                    turn(robot, DOWN);
                }
            }
            robot.stepForward();
            remainToY = toY - robot.getY();
        }
    }

    private void turn(@NotNull Robot robot, Direction targetDirection) {
        Direction currentDirection = robot.getDirection();
        if (currentDirection == UP && targetDirection == RIGHT) {
            robot.turnRight();
        }
        if (currentDirection == UP && targetDirection == LEFT) {
            robot.turnLeft();
        }
        if (currentDirection == DOWN && targetDirection == RIGHT) {
            robot.turnLeft();
        }
        if (currentDirection == DOWN && targetDirection == LEFT) {
            robot.turnRight();
        }
        if (currentDirection == RIGHT && targetDirection == UP) {
            robot.turnLeft();
        }
        if (currentDirection == RIGHT && targetDirection == DOWN) {
            robot.turnRight();
        }
        if (currentDirection == LEFT && targetDirection == UP) {
            robot.turnRight();
        }
        if (currentDirection == LEFT && targetDirection == DOWN) {
            robot.turnLeft();
        }
    }
}
