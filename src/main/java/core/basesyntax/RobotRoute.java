package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        Direction aimDirection;
        if (toX > robot.getX()) {
            aimDirection = Direction.RIGHT;
            while (aimDirection != robot.getDirection()) {
                robot.turnRight();
            }
            do {
                robot.stepForward();
            } while (robot.getX() != toX);
        } else if (toX < robot.getX()) {
            aimDirection = Direction.LEFT;
            while (aimDirection != robot.getDirection()) {
                robot.turnLeft();
            }
            do {
                robot.stepForward();
            } while (robot.getX() != toX);
        }
        if (toY > robot.getY()) {
            aimDirection = Direction.UP;
            while (aimDirection != robot.getDirection()) {
                robot.turnLeft();
            }
            do {
                robot.stepForward();
            } while (robot.getY() != toY);
        } else if (toY < robot.getY()) {
            aimDirection = Direction.DOWN;
            while (aimDirection != robot.getDirection()) {
                robot.turnLeft();
            }
            do {
                robot.stepForward();
            } while (robot.getY() != toY);
        }
    }
}
