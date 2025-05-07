package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        while (robot.getX() != toX || robot.getY() != toY) {
            System.out.println("x: " + robot.getX() + '\'' + "y: " + robot.getY());
            if (robot.getX() < toX) {
                System.out.println("Move right");
                turnRobot(robot, Direction.RIGHT);
                robot.stepForward();
            }
            if (robot.getY() < toY) {
                System.out.println("Move up");
                turnRobot(robot, Direction.UP);
                robot.stepForward();
            }
            if (robot.getX() > toX) {
                System.out.println("Move left");
                turnRobot(robot, Direction.LEFT);
                robot.stepForward();
            }
            if (robot.getY() > toY) {
                System.out.println("Move down");
                turnRobot(robot, Direction.DOWN);
                robot.stepForward();
            }
        }
    }

    private void turnRobot(Robot robot, Direction direction) {
        Direction robotDirection = robot.getDirection();
        if (!direction.equals(robotDirection)) {
            if (direction.equals(Direction.LEFT)) {
                if (robotDirection.equals(Direction.UP)) {
                    robot.turnLeft();
                } else if (robotDirection.equals(Direction.DOWN)) {
                    robot.turnRight();
                } else if (robotDirection.equals(Direction.RIGHT)) {
                    robot.turnRight();
                    robot.turnRight();
                }
            }
            if (direction.equals(Direction.RIGHT)) {
                if (robotDirection.equals(Direction.UP)) {
                    robot.turnRight();
                } else if (robotDirection.equals(Direction.DOWN)) {
                    robot.turnLeft();
                } else if (robotDirection.equals(Direction.LEFT)) {
                    robot.turnRight();
                    robot.turnRight();
                }
            }
            if (direction.equals(Direction.DOWN)) {
                if (robotDirection.equals(Direction.UP)) {
                    robot.turnLeft();
                    robot.turnLeft();
                } else if (robotDirection.equals(Direction.LEFT)) {
                    robot.turnRight();
                } else if (robotDirection.equals(Direction.RIGHT)) {
                    robot.turnRight();
                }
            }
            if (direction.equals(Direction.UP)) {
                if (robotDirection.equals(Direction.DOWN)) {
                    robot.turnLeft();
                    robot.turnLeft();
                } else if (robotDirection.equals(Direction.LEFT)) {
                    robot.turnRight();
                } else if (robotDirection.equals(Direction.RIGHT)) {
                    robot.turnLeft();
                }
            }
        }
    }
}
