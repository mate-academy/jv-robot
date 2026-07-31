package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        if (currentX > toX) {
            moveRobotByXAxis(robot, toX, Direction.LEFT);
            if (currentY > toY) {
                moveRobotByYAxis(robot, toY, Direction.DOWN);
            } else if (currentY < toY) {
                moveRobotByYAxis(robot, toY, Direction.UP);
            }
        } else if (currentX < toX) {
            moveRobotByXAxis(robot, toX, Direction.RIGHT);
            if (currentY > toY) {
                moveRobotByYAxis(robot, toY, Direction.DOWN);
            } else if (currentY < toY) {
                moveRobotByYAxis(robot, toY, Direction.UP);
            }
        } else {
            if (currentY > toY) {
                moveRobotByYAxis(robot, toY, Direction.DOWN);
            } else if (currentY < toY) {
                moveRobotByYAxis(robot, toY, Direction.UP);
            }
        }
    }

    private void moveRobotByXAxis(Robot robot, int toX, Direction direction) {
        if (robot.getDirection() != direction) {
            do {
                robot.turnLeft();
            } while (robot.getDirection() != direction);
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    private void moveRobotByYAxis(Robot robot, int toY, Direction direction) {
        if (robot.getDirection() != direction) {
            do {
                robot.turnLeft();
            } while (robot.getDirection() != direction);
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
