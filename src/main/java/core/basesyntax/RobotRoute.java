package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        if (robot.getY() == toY && robot.getX() == toX) {
            System.out.println("Robot is at home");
        }

        if (robot.getY() > toY) {
            robotGoesDown(robot, toX, toY);
            if (robot.getX() == toX) {
                System.out.println("Robot is at home");
            } else {
                fromUpToX(robot, toX);
            }
        } else {
            robotGoesUp(robot, toX, toY);
            if (robot.getX() == toX) {
                System.out.println("Robot is at home");
            } else {
                fromDownToX(robot, toX);
            }
        }
    }

    public void robotGoesDown(Robot robot, int toX, int toY) {
        if (robot.getDirection() == Direction.DOWN) {
            while (robot.getY() > toY) {
                robot.stepForward();
            }
        } else if (robot.getDirection() == Direction.LEFT) {
            robot.turnLeft();
            while (robot.getY() > toY) {
                robot.stepForward();
            }
        } else if (robot.getDirection() == Direction.RIGHT) {
            robot.turnRight();
            while (robot.getY() > toY) {
                robot.stepForward();
            }
        } else {
            robot.turnRight();
            robot.turnRight();
            while (robot.getY() > toY) {
                robot.stepForward();
            }
        }
    }

    public void fromUpToX(Robot robot, int toX) {
        if (robot.getX() > toX) {
            robot.turnRight();
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        } else {
            robot.turnLeft();
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        }
    }

    public void robotGoesUp(Robot robot, int toX, int toY) {
        if (robot.getDirection() == Direction.UP) {
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        } else if (robot.getDirection() == Direction.LEFT) {
            robot.turnRight();
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        } else if (robot.getDirection() == Direction.RIGHT) {
            robot.turnLeft();
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        } else {
            robot.turnRight();
            robot.turnRight();
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        }
    }

    public void fromDownToX(Robot robot, int toX) {
        if (robot.getX() > toX) {
            robot.turnLeft();
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        } else {
            robot.turnRight();
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        }
    }
}
