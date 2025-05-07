package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        while (robot.getX() != toX) {
            if (robot.getX() < toX) {
                if (robot.getDirection().equals(Direction.RIGHT)) {
                    robot.stepForward();
                } else {
                    robot.turnRight();
                }
            }

            if (robot.getX() > toX) {
                if (robot.getDirection().equals(Direction.LEFT)) {
                    robot.stepForward();
                } else {
                    robot.turnRight();
                }
            }
        }

        while (robot.getY() != toY) {
            if (robot.getY() < toY) {
                if (robot.getDirection().equals(Direction.UP)) {
                    robot.stepForward();
                } else {
                    robot.turnRight();
                }
            }

            if (robot.getY() > toY) {
                if (robot.getDirection().equals(Direction.DOWN)) {
                    robot.stepForward();
                } else {
                    robot.turnRight();
                }
            }
        }
    }
}
