package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        if (robot.getX() == toX && robot.getY() == toY) {
            return;
        }
        if (robot.getX() == toX) {
            robot = new RobotRoute().moveToY(robot, toY);
        } else if (robot.getY() == toY) {
            robot = new RobotRoute().moveToX(robot, toX);
        } else {
            robot = new RobotRoute().moveToY(robot, toY);
            robot = new RobotRoute().moveToX(robot, toX);
        }
    }

    private Robot moveToX(Robot robot, int x) {
        RobotRoute robotRoute = new RobotRoute();
        robot = robotRoute.setRightDirectionForX(robot, x);
        while (robot.getX() != x) {
            robot.stepForward();
        }
        return robot;
    }

    private Robot moveToY(Robot robot, int y) {
        RobotRoute robotRoute = new RobotRoute();
        robot = robotRoute.setRightDirectionForY(robot, y);
        while (robot.getY() != y) {
            robot.stepForward();
        }
        return robot;
    }

    private Robot setRightDirectionForY(Robot robot, int coordinate) {
        if (robot.getY() < coordinate && !robot.getDirection().equals(Direction.UP)) {
            switch (robot.getDirection()) {
                case DOWN:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    break;
                default:
                    break;
            }
            return robot;
        }
        if (robot.getY() > coordinate && !robot.getDirection().equals(Direction.DOWN)) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnLeft();
                    break;
                case RIGHT:
                    robot.turnRight();
                    break;
                default:
                    break;
            }
            return robot;
        }
        return robot;
    }

    private Robot setRightDirectionForX(Robot robot, int coordinate) {
        if (robot.getX() < coordinate && !robot.getDirection().equals(Direction.RIGHT)) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                default:
                    break;
            }
            return robot;
        }
        if (robot.getX() > coordinate && !robot.getDirection().equals(Direction.LEFT)) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                default:
                    break;
            }
            return robot;
        }
        return robot;
    }
}
