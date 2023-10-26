package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            setDirection(robot, Direction.LEFT);
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        } else if (robot.getX() < toX) {
            setDirection(robot, Direction.RIGHT);
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (robot.getY() > toY) {
            setDirection(robot, Direction.DOWN);
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        } else if (robot.getY() < toY) {
            setDirection(robot, Direction.UP);
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }

    }

    public void setDirection(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnLeft();
        }
    }
}
