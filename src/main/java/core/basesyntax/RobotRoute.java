package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        while (robot.getX() != toX || robot.getY() != toY) {
            if (robot.getX() != toX) {
                if (toX > robot.getX()) {
                    while (robot.getDirection() != Direction.RIGHT) {
                        robot.turnRight();
                    }
                } else {
                    while (robot.getDirection() != Direction.LEFT) {
                        robot.turnLeft();
                    }
                }
                robot.stepForward();
            }
            if (robot.getY() != toY) {
                if (toY > robot.getY()) {
                    while (robot.getDirection() != Direction.UP) {
                        robot.turnRight();
                    }
                } else {
                    while (robot.getDirection() != Direction.DOWN) {
                        robot.turnLeft();
                    }
                }
                robot.stepForward();
            }
        }
    }
}
