package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        while (robot.getX() != toX || robot.getY() != toY) {
            if (currentX > toX) {
                changeDirection(robot, Direction.LEFT);
                currentX--;
            } else if (currentX < toX) {
                changeDirection(robot, Direction.RIGHT);
                currentX++;
            }

            if (currentY > toY) {
                changeDirection(robot, Direction.DOWN);
                currentY--;
            } else if (currentY < toY) {
                changeDirection(robot, Direction.UP);
                currentY++;
            }

            if (currentX == toX && currentY == toY) {
                break;
            }
        }

    }
    public void changeDirection(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnRight();
        }
        robot.stepForward();
    }
}
