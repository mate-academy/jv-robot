package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        correctPositionByX(robot, toX);
        correctPositionByY(robot, toY);
    }

    public void correctPositionByX(Robot robot, int toX) {
        if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        } else if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    public void correctPositionByY(Robot robot, int toY) {
        if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        } else if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
