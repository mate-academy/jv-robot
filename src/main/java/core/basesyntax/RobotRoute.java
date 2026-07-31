package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        boolean rightDirectionX = false;
        boolean rightDirectionY = false;
        if (toX != robot.getX() || toY != robot.getY()) {
            if (!rightDirectionX) {
                if (robot.getDirection() != Direction.LEFT
                        && robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
                if (robot.getX() > toX) {
                    rightDirectionX = true;
                }
                if (robot.getX() < toX) {
                    robot.turnRight();
                    robot.turnRight();
                    rightDirectionX = true;
                }
            }
            if (rightDirectionX) {
                while (robot.getX() != toX) {
                    robot.stepForward();
                    if (robot.getX() == -toX) {
                        robot.turnRight();
                        robot.turnRight();
                    }
                }
            }
            if (!rightDirectionY) {
                if (robot.getDirection() != Direction.UP
                        && robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();
                }
                if (robot.getY() > toY) {
                    rightDirectionY = true;
                }
                if (robot.getY() < toY) {
                    robot.turnRight();
                    robot.turnRight();
                    rightDirectionY = true;
                }
            }
            if (rightDirectionY) {
                while (robot.getY() != toY) {
                    robot.stepForward();
                    if (robot.getY() == -toY) {
                        robot.turnRight();
                        robot.turnRight();
                    }
                }
            }
        }
    }
}
