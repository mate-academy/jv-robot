package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        moveToX(robot, toX);
        moveToY(robot, toY);
    }

    public void moveToX(Robot robot, int toX) {
        while (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            robot.stepForward();
        }

        while (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            robot.stepForward();
        }
    }

    public void moveToY(Robot robot, int toY) {
        while (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            robot.stepForward();
        }

        while (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
            robot.stepForward();
        }
    }
}
