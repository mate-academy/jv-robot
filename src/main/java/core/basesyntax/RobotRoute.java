package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        if (x > toX) {
            robotDirection(robot, Direction.LEFT);
        } else {
            robotDirection(robot, Direction.RIGHT);
        }
        movingX(robot,toX);
        int y = robot.getY();
        if (y > toY) {
            robotDirection(robot, Direction.DOWN);
        } else {
            robotDirection(robot, Direction.UP);
        }
        movingY(robot,toY);
    }

    public void robotDirection(Robot robot, Direction direction) {
        if (robot.getDirection() != direction) {
            robot.turnLeft();
            robotDirection(robot,direction);
        }
    }

    public void movingX(Robot robot, int toX) {
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    public void movingY(Robot robot, int toY) {
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
