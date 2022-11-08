package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        turnRobotAlongX(robot, toX);

        while (robot.getX() != toX) {
            robot.stepForward();
        }

        turnRobotAlongY(robot, toY);

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void turnRobotAlongX(Robot robot, int toX) {
        if (robot.getX() > toX) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnRight();
                    break;
                default:
                    break;
            }
        } else {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnRight();
                    break;
                case LEFT:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnLeft();
                    break;
                default:
                    break;
            }
        }
    }

    private void turnRobotAlongY(Robot robot, int toY) {
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
        } else {
            switch (robot.getDirection()) {
                case RIGHT:
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                default:
                    break;
            }
        }
    }
}
