package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() == toX && robot.getY() == toY) {
            System.out.println("robot already in the home position");
        } else {
            while (robot.getX() != toX) {
                if (toX > robot.getX()) {
                    if (robot.getDirection() == Direction.UP) {
                        robot.turnRight();
                    } else if (robot.getDirection() == Direction.DOWN) {
                        robot.turnLeft();
                    } else if (robot.getDirection() == Direction.LEFT) {
                        robot.turnLeft();
                        robot.turnLeft();
                    } else {
                        robot.stepForward();
                    }
                } else if (toX < robot.getX()) {
                    if (robot.getDirection() == Direction.UP) {
                        robot.turnLeft();
                    } else if (robot.getDirection() == Direction.DOWN) {
                        robot.turnRight();
                    } else if (robot.getDirection() == Direction.RIGHT) {
                        robot.turnLeft();
                        robot.turnLeft();
                    } else {
                        robot.stepForward();
                    }
                    robot.stepForward();
                } else {
                    robot.stepForward();
                }
            }
            while (robot.getY() != toY) {
                if (toY > robot.getY()) {
                    if (robot.getDirection() == Direction.LEFT) {
                        robot.turnRight();
                    } else if (robot.getDirection() == Direction.RIGHT) {
                        robot.turnLeft();
                    } else if (robot.getDirection() == Direction.DOWN) {
                        robot.turnLeft();
                        robot.turnLeft();
                    } else {
                        robot.stepForward();
                    }
                }
                if (toY < robot.getY()) {
                    if (robot.getDirection() == Direction.LEFT) {
                        robot.turnLeft();
                    } else if (robot.getDirection() == Direction.RIGHT) {
                        robot.turnRight();
                    } else if (robot.getDirection() == Direction.UP) {
                        robot.turnLeft();
                        robot.turnLeft();
                    } else {
                        robot.stepForward();
                    }
                }
            }
        }
    }
}
