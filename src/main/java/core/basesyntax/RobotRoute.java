package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();
        if (x > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }

        } else if (x < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            }
        }

        while (toX != robot.getX()) {
            robot.stepForward();
        }

        if (y > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        } else if (y < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
        }

        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }
}





