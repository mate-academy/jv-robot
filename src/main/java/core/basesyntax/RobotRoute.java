package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here
        int initialX = robot.getX();
        robot.stepForward();
        //totheLEEEFTt
        if (robot.getX() < toX) {
            if (robot.getX() > initialX) {
                while (robot.getX() != toX) {
                    robot.stepForward();
                    robot.getX();
                }
            } else {
                do {
                    robot.turnLeft();
                    robot.stepForward();
                    robot.getX();
                }
                while (robot.getX() < initialX);
                while (robot.getX() != toX) {
                    robot.stepForward();
                    robot.getX();
                }
            }
            moveRobotAlongYLeft(robot, toY);
        }
        //ttheRIGHT
        if (robot.getX() > toX) {
            if (robot.getX() < initialX) {
                while (robot.getX() != toX) {
                    robot.stepForward();
                    robot.getX();
                }
            } else {
                do {
                    robot.turnLeft();
                    robot.stepForward();
                    robot.getX();
                }
                while (robot.getX() > initialX);
                while (robot.getX() != toX) {
                    robot.stepForward();
                    robot.getX();
                }
            }
            moveRobotAlongYRight(robot, toY);
        }
        robot.getDirection();
    }
    public void moveRobotAlongYRight(Robot robot, int toY) {
        if (robot.getY() > toY) {
            robot.turnLeft();
            while (robot.getY() > toY ) {
                robot.stepForward();
                robot.getY();
            }
        }
        if (robot.getY() < toY) {
            robot.turnRight();
            while (robot.getY() < toY ) {
                robot.stepForward();
                robot.getY();
            }
        }

    }
    public void moveRobotAlongYLeft(Robot robot, int toY) {
        if (robot.getY() > toY) {
            robot.turnRight();
            while (robot.getY() > toY ) {
                robot.stepForward();
                robot.getY();
            }
        }
        if (robot.getY() < toY) {
            robot.turnLeft();
            while (robot.getY() < toY ) {
                robot.stepForward();
                robot.getY();
            }
        }

    }
    //public void moveRobotAlongXLeft(Robot robot, int toY) {

    //}
}
