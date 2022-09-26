package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int xd = robot.getX();
        int xy = robot.getY();

        if (xd >= toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (xd != toX) {
                robot.stepForward();
                xd--;
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (xd != toX) {
                robot.stepForward();
                xd++;
            }
        }

        if (xy >= toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            while (xy != toY) {
                robot.stepForward();
                xy--;
            }

        } else {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (xy != toY) {
                robot.stepForward();
                xy++;
            }

        }

    }

}



