package core.basesyntax;

import org.example.Direction;
import org.example.Robot;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        Direction targetDirection = (currentX < toX) ? Direction.RIGHT : Direction.LEFT;
        while (robot.getX() != toX && robot.getDirection() != targetDirection) {
            if (targetDirection == Direction.RIGHT) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
            robot.stepForward();
        }

        int currentX = robot.getY();
        Direction targetDirection = (currentX < toY) ? Direction.UP : Direction.DOWN;
        while (robot.getY() != toY && robot.getDirection() != targetDirection) {
            if (targetDirection == Direction.RIGHT) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
            robot.stepForward();
        }
    }
}
