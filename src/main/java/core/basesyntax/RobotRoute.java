package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();
        if (currentX == toX && currentY == toY) {
            return;
        }
        int diffX = toX - currentX;
        int diffY = toY - currentY;
        if (diffX > 0) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        } else if (diffX < 0) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        if (diffY > 0) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        } else if (diffY < 0) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
