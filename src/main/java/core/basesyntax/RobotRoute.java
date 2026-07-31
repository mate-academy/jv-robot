package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction directionX = getDirectionX(robot, toX);
        Direction directionY = getDirectionY(robot, toY);

        while (directionX != null && robot.getX() != toX) {
            while (robot.getDirection() != directionX) {
                robot.turnRight();
            }
            robot.stepForward();
        }

        while (directionY != null && robot.getY() != toY) {
            while (robot.getDirection() != directionY) {
                robot.turnRight();
            }
            robot.stepForward();
        }
    }

    private Direction getDirectionY(Robot robot, int toY) {
        if (robot.getY() - toY < 0) {
            return Direction.UP;
        } else if (robot.getY() - toY > 0) {
            return Direction.DOWN;
        }
        return null;
    }

    private Direction getDirectionX(Robot robot, int toX) {
        if (robot.getX() - toX < 0) {
            return Direction.RIGHT;
        } else if (robot.getX() - toX > 0) {
            return Direction.LEFT;
        }
        return null;
    }
}
