package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction robotDirection = robot.getDirection();

        robotDirection = this.moveRobotByX(robot, robotDirection, toX);
        this.moveRobotByY(robot, robotDirection, toY);
    }

    private Direction moveRobotByX(Robot robot, Direction robotDirection, int toX) {
        if (toX > robot.getX()) {
            robotDirection = turnRobot(robot, Direction.RIGHT);
        } else if (toX < robot.getX()) {
            robotDirection = turnRobot(robot, Direction.LEFT);
        }

        while (toX != robot.getX()) {
            robot.stepForward();
        }

        return robotDirection;
    }

    private Direction moveRobotByY(Robot robot, Direction robotDirection, int toY) {
        if (toY > robot.getY()) {
            robotDirection = turnRobot(robot, Direction.UP);
        } else if (toY < robot.getY()) {
            robotDirection = turnRobot(robot, Direction.DOWN);
        }

        while (toY != robot.getY()) {
            robot.stepForward();
        }

        return robotDirection;
    }

    private Direction turnRobot(Robot robot, Direction direction) {
        Direction robotDirection = robot.getDirection();

        while (robotDirection != direction) {
            robot.turnRight();
            robotDirection = robot.getDirection();
        }

        return robotDirection;
    }
}
