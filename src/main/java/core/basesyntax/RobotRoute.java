package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveX(robot,toX);
        moveY(robot,toY);
    }

    public static void moveY(Robot robot, int toY) {
        while (robot.getY() != toY) {
            if (robot.getY() > toY) {
                if (robot.getDirection() == Direction.DOWN) {
                    robot.stepForward();
                } else if (robot.getDirection() == Direction.LEFT) {
                    robot.turnLeft();
                } else if (robot.getDirection() == Direction.RIGHT) {
                    robot.turnRight();
                } else {
                    robot.turnRight();
                    robot.turnRight();
                }
            } else {
                if (robot.getDirection() == Direction.UP) {
                    robot.stepForward();
                } else if (robot.getDirection() == Direction.DOWN) {
                    robot.turnRight();
                    robot.turnRight();
                } else if (robot.getDirection() == Direction.RIGHT) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }

            }
        }
    }

    public static void moveX(Robot robot,int toX) {
        while (robot.getX() != toX) {
            if (robot.getX() < toX) {
                if (robot.getDirection() == Direction.RIGHT) {
                    robot.stepForward();
                } else if (robot.getDirection() == Direction.DOWN) {
                    robot.turnLeft();
                } else if (robot.getDirection() == Direction.LEFT) {
                    robot.turnLeft();
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
            } else {
                if (robot.getDirection() == Direction.LEFT) {
                    robot.stepForward();
                } else if (robot.getDirection() == Direction.DOWN) {
                    robot.turnRight();
                } else if (robot.getDirection() == Direction.RIGHT) {
                    robot.turnLeft();
                    robot.turnLeft();
                } else {
                    robot.turnLeft();
                }

            }

        }
    }
}
