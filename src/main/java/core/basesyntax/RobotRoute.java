package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();

        Direction firstDirection, secondDirection;
        if (toX > x) {
            firstDirection = Direction.RIGHT;
        } else if (toX < x) {
            firstDirection = Direction.LEFT;
        } else {
            firstDirection = null;
        }

        if (toY > y) {
            secondDirection = Direction.UP;
        } else if (toY < y) {
            secondDirection = Direction.DOWN;
        } else {
            secondDirection = null;
        }

        if (firstDirection != null) {
            while (robot.getDirection() != firstDirection) {
                robot.turnLeft();
            }

            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (secondDirection != null) {
            while (robot.getDirection() != secondDirection) {
                robot.turnLeft();
            }

            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }


    }
}
