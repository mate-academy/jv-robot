package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int actualPositionX = robot.getX();
        int actualPositionY = robot.getY();

        int horizontalDistance = toX - actualPositionX;
        int verticalDistance = toY - actualPositionY;

        if (horizontalDistance > 0) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        } else if (horizontalDistance < 0) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        }

        if (verticalDistance > 0) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        } else if (verticalDistance < 0) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        }

        while (robot.getX() != toX || robot.getY() != toY) {
            robot.stepForward();
        }
    }
}

