package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX > robot.getX()) {
            while(robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
            if (toY > robot.getY()) {
                robot.turnLeft();
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            } else {
                robot.turnRight();
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        } else {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
            if (toY > robot.getY()) {
                robot.turnRight();
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            } else {
                robot.turnLeft();
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        }
    }
}