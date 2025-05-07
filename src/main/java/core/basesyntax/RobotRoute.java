package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        setCorrectXDirection(robot, toX);
        while (robot.getX() != toX) {
            robot.stepForward();
        }

        setCorrectYDirection(robot, toY);
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void setCorrectXDirection(Robot robot, int toX) {
        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        } else if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        }
    }

    private void setCorrectYDirection(Robot robot, int toY) {
        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
        } else if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        }
    }
}
