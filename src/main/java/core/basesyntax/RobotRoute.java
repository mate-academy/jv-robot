package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        Direction currentDirection = robot.getDirection();
        int directionToMatchX = toX - robot.getX();
        int directionToMatchY = toY - robot.getY();

        if (directionToMatchX < 0) {
            while (!robot.getDirection().name().equals("LEFT")) {
                if (robot.getDirection().name().equals("UP")) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
            }
        } else if (directionToMatchX > 0) {
            while (!robot.getDirection().name().equals("RIGHT")) {
                if (robot.getDirection().name().equals("DOWN")) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
            }
        }

        while (toX != robot.getX()) {
            robot.stepForward();
        }

        if (directionToMatchY < 0) {
            while (!robot.getDirection().name().equals("DOWN")) {
                if (robot.getDirection().name().equals("LEFT")) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
            }
        } else if (directionToMatchY > 0) {
            while (!robot.getDirection().name().equals("UP")) {
                if (robot.getDirection().name().equals("RIGHT")) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
            }
        }

        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }
}
