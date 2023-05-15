package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX > robot.getX() && toY > robot.getY()) {
            turnRobotRight(robot);
            for (int i = robot.getX(); i < toX; i++) {
                robot.stepForward();
            }
            turnRobotUp(robot);
            for (int i = robot.getY(); i < toY; i++) {
                robot.stepForward();
            }
        } else if (toX < robot.getX() && toY < robot.getY()) {
            turnRobotLeft(robot);
            for (int i = robot.getX(); i > toX; i--) {
                robot.stepForward();
            }
            turnRobotDown(robot);
            for (int i = robot.getY(); i > toY; i--) {
                robot.stepForward();
            }
        } else if (toX >= robot.getX() && toY <= robot.getY()) {
            turnRobotRight(robot);
            for (int i = robot.getX(); i < toX; i++) {
                robot.stepForward();
            }
            turnRobotDown(robot);
            for (int i = robot.getY(); i > toY; i--) {
                robot.stepForward();
            }
        } else if (toX <= robot.getX() && toY >= robot.getY()) {
            turnRobotLeft(robot);
            for (int i = robot.getX(); i > toX; i--) {
                robot.stepForward();
            }
            turnRobotUp(robot);
            for (int i = robot.getY(); i < toY; i++) {
                robot.stepForward();
            }
        }
        System.out.println(robot.getX() + " " + robot.getY());
    }

    private void turnRobotRight(Robot robot) {
        while (robot.getDirection() != Direction.RIGHT ) {
            robot.turnRight();
        }
    }

    private void turnRobotLeft(Robot robot) {
        while (robot.getDirection() != Direction.LEFT ) {
            robot.turnLeft();
        }
    }

    private void turnRobotUp(Robot robot) {
        while (robot.getDirection() != Direction.UP ) {
            robot.turnLeft();
        }
    }

    private void turnRobotDown(Robot robot) {
        while (robot.getDirection() != Direction.DOWN ) {
            robot.turnRight();
        }
    }
}
