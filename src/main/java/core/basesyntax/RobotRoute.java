package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction actualDirectionX = setDirectionX(robot, toX);
        while (robot.getDirection() != actualDirectionX) {
            robot.turnLeft();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        Direction actualDirectionY = setDirectionY(robot, toY);
        while (robot.getDirection() != actualDirectionY) {
            robot.turnLeft();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    // determine the direction of movement X
    public Direction setDirectionX(Robot robot, int toX) {
        int actX = robot.getX();
        Direction toDirection = robot.getDirection();
        if (toX < actX) {
            toDirection = Direction.LEFT;
        } else if (toX > actX) {
            toDirection = Direction.RIGHT;
        }
        return toDirection;
    }

    // determine the direction of movement Y
    public Direction setDirectionY(Robot robot, int toY) {
        int actY = robot.getY();
        Direction toDirection = robot.getDirection();
        if (toY < actY) {
            toDirection = Direction.DOWN;
        } else if (toY > actY) {
            toDirection = Direction.UP;
        }
        return toDirection;
    }
}
