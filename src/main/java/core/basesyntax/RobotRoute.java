package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        robotMovesHorizontal(robot, toX, toY);
        robotMovesVertical(robot, toX, toY);
    }

    private void robotMovesVertical(Robot robot, int toX, int toY) {
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

    public void robotMovesHorizontal(Robot robot, int toX, int toY) {
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
}
