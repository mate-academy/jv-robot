package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //turning to X
        if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        } else if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }
        //going to X
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        //turning to Y
        if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
        } else if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        }
        //going to Y
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}

