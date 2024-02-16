package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        goToDesignatedX(robot, toX);
        goToDesignatedY(robot, toY);
    }

    private void goToDesignatedX(Robot robot, int toX) {
        if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            }
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    private void goToDesignatedY(Robot robot, int toY) {
        if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        } else {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
