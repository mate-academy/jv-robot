package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        RobotRoute route = new RobotRoute();
        if (toX > 0 && toY > 0) {
            route.moveRobotToFirstQuadrant(robot, toX, toY);
        } else if (toX < 0 && toY > 0) {
            route.moveRobotToSecondQuadrant(robot, toX, toY);
        } else if (toX > 0 && toY < 0) {
            route.moveRobotToThirdQuadrant(robot, toX, toY);
        } else if (toX < 0 && toY < 0) {
            route.moveRobotToFourthQuadrant(robot, toX, toY);
        }
        System.out.println(robot.getX() + " " + robot.getY());
    }

    private void moveRobotToFirstQuadrant(Robot robot, int coordinateX, int coordinateY) {
        while (robot.getDirection() != Direction.RIGHT) {
            robot.turnRight();
        }
        while (robot.getX() != coordinateX) {
            robot.stepForward();
        }
        robot.turnLeft();
        while (robot.getY() != coordinateY) {
            robot.stepForward();
        }
    }

    private void moveRobotToSecondQuadrant(Robot robot, int coordinateX, int coordinateY) {
        while (robot.getDirection() != Direction.LEFT) {
            robot.turnLeft();
        }
        while (robot.getX() != coordinateX) {
            robot.stepForward();
        }
        robot.turnRight();
        while (robot.getY() != coordinateY) {
            robot.stepForward();
        }
    }

    private void moveRobotToThirdQuadrant(Robot robot, int coordinateX, int coordinateY) {
        while (robot.getDirection() != Direction.RIGHT) {
            robot.turnLeft();
        }
        while (robot.getX() != coordinateX) {
            robot.stepForward();
        }
        robot.turnRight();
        while (robot.getY() != coordinateY) {
            robot.stepForward();
        }
    }

    private void moveRobotToFourthQuadrant(Robot robot, int coordinateX, int coordinateY) {
        while (robot.getDirection() != Direction.LEFT) {
            robot.turnLeft();
        }
        while (robot.getX() != coordinateX) {
            robot.stepForward();
        }
        robot.turnLeft();
        while (robot.getY() != coordinateY) {
            robot.stepForward();
        }
    }
}
