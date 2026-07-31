package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        System.out.print(robot.getDirection() + "\n");
        moveRobotToX(robot, toX, toY);
        moveRobotToy(robot, toX, toY);
    }

    private void moveRobotToX(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            for (int i = 0; i < 3; i++) {
                if (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                } else {
                    break;
                }
            }
            for (int i = robot.getX(); i < toX; i++) {
                robot.stepForward();
                System.out.println(robot.getX() + " " + robot.getY());
            }
        }

        if (robot.getX() > toX) {
            for (int i = 0; i < 3; i++) {
                if (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                } else {
                    break;
                }
            }
            for (int i = robot.getX(); i > toX; i--) {
                robot.stepForward();
                System.out.println(robot.getX() + " " + robot.getY());
            }
        }
    }

    private void moveRobotToy(Robot robot, int toX, int toY) {
        if (robot.getY() < toY) {
            for (int i = 0; i < 3; i++) {
                if (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                } else {
                    break;
                }
            }
            for (int i = robot.getY(); i < toY; i++) {
                robot.stepForward();
                System.out.println(robot.getX() + " " + robot.getY());
            }
        }

        if (robot.getY() > toY) {
            for (int i = 0; i < 3; i++) {
                if (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                } else {
                    break;
                }
            }
            for (int i = robot.getY(); i > toY; i--) {
                robot.stepForward();
                System.out.println(robot.getX() + " " + robot.getY());
            }
        }
    }
}
