package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        RobotRoute robotRoute = new RobotRoute();
        robotRoute.findDirectionByXAxis(robot, toX, toY);
        robotRoute.moveXAxis(robot, toX, toY);
        robotRoute.findDirectionByYAxis(robot, toX, toY);
        robotRoute.moveYAxis(robot, toX, toY);

    }

    private void findDirectionByXAxis(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
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
        }
        if (robot.getX() < toX) {
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
        }
    }

    private void findDirectionByYAxis(Robot robot, int toX, int toY) {
        if (robot.getY() > toY) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case RIGHT:
                    robot.turnRight();
                    break;
                case LEFT:
                    robot.turnLeft();
                    break;
                default:
                    break;
            }
        }
        if (robot.getY() < toY) {
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
        }
    }

    private void moveXAxis(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    private void moveYAxis(Robot robot, int toX, int toY) {
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
