package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() == toX && robot.getY() == toY) {
            return;
        }
        Direction robotDirection = robot.getDirection();
        if (robot.getX() < toX) {

            if(robotDirection == Direction.UP) {
                robot.turnRight();
            }else if (robotDirection == Direction.DOWN) {
                robot.turnLeft();
            }else if (robotDirection == Direction.LEFT) {
                robot.turnLeft();
                robot.turnLeft();
            }

        }else if(robot.getX() > toX) {

            if(robotDirection == Direction.UP) {
                robot.turnLeft();
            }else if (robotDirection == Direction.DOWN) {
                robot.turnRight();
            }else if (robotDirection == Direction.RIGHT) {
                robot.turnLeft();
                robot.turnLeft();
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        robotDirection = robot.getDirection();
        if (robot.getY() < toY) {
            if (robotDirection == Direction.DOWN) {
                robot.turnRight();
                robot.turnRight();
            }else if (robotDirection == Direction.LEFT) {
                robot.turnRight();
            }else if (robotDirection == Direction.RIGHT) {
                robot.turnLeft();
            }
        }
        else if (robot.getY() > toY) {
            if (robotDirection == Direction.DOWN) {
                robot.turnRight();
                robot.turnRight();
            }else if (robotDirection == Direction.LEFT) {
                robot.turnLeft();
            }else if (robotDirection == Direction.RIGHT) {
                robot.turnRight();
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
      //write your solution here
    }
}
