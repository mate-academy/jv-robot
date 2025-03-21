package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        if (toX > currentX) {
            Direction direction = Direction.RIGHT;
            while (robot.getDirection() != direction) {
                robot.turnRight();
            }
        } else if (toX < currentX) {
            Direction direction = Direction.LEFT;
            while (robot.getDirection() != direction) {
                robot.turnLeft();
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }

        if (toY > currentY) {
            Direction direction = Direction.UP;
            while (robot.getDirection() != direction) {
                robot.turnLeft();
            }
        } else if (toY < currentY) {
            Direction direction = Direction.DOWN;
            while (robot.getDirection() != direction) {
                robot.turnRight();
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }

    }
}
