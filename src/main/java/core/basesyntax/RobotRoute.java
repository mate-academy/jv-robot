package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() == toX && robot.getY() > toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
        if (robot.getX() == toX && robot.getY() < toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
        if (robot.getX() > toX && robot.getY() == toY) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }
        if (robot.getX() < toX && robot.getY() == toY) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            }
            while (robot.getY() != toX) {
                robot.stepForward();
            }
        }
        if (robot.getX() > toX && robot.getY() > toY) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
            robot.turnLeft();
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
        if (robot.getX() > toX && robot.getY() < toY) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
            robot.turnRight();
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
        if (robot.getX() < toX && robot.getY() < toY) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
            robot.turnRight();
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
        if (robot.getX() < toX && robot.getY() > toY) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
            robot.turnRight();
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }

    public static void main(String[] args) {
        Robot robot = new Robot(Direction.UP, 1, 1);
        RobotRoute robotRoute = new RobotRoute();
        robotRoute.moveRobot(robot, 7, -3);
    }
}
