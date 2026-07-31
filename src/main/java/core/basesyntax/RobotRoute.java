package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        moveRobotToX(robot, toX, toY);
        moveRobottoY(robot, toX, toY);

    }

    public void moveRobottoY(Robot robot, int toYX, int toY) {
        if (toY - robot.getY() > 0) {
            while (!robot.getDirection().equals(Direction.UP)) {
                robot.turnLeft();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        } else if (toY - robot.getY() < 0) {
            while (!robot.getDirection().equals(Direction.UP)) {
                robot.turnLeft();
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    public void moveRobotToX(Robot rob, int toX, int toY) {
        if (toX - rob.getX() > 0) {
            while (!rob.getDirection().equals(Direction.RIGHT)) {
                rob.turnLeft();
            }
            while (rob.getX() != toX) {
                rob.stepForward();
            }
        } else if (toX - rob.getX() < 0) {
            while (!rob.getDirection().equals(Direction.LEFT)) {
                rob.turnLeft();
            }
            while (rob.getX() != toX) {
                rob.stepForward();
            }
        }
    }
}
