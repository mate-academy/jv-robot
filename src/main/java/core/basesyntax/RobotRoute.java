package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        turnToX(robot, toX);
        stepes(robot, toX);
        turnToY(robot, toY);
        stepes(robot, toY);
    }

    private void turnToX(Robot robot, int toX) {
        if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        } else if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            }
        }
    }

    private void turnToY(Robot robot, int toY) {
        if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        } else if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
        }
    }

    private void stepes(Robot robot, int cord) {
        if (robot.getDirection() == Direction.RIGHT || robot.getDirection() == Direction.LEFT) {
            while (robot.getX() != cord) {
                robot.stepForward();
            }
        } else {
            while (robot.getY() != cord) {
                robot.stepForward();
            }
        }
    }
}


