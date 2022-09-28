package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        changeDirectionX(robot, toX);
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        changeDirectionY(robot, toY);
        while (robot.getY() != toY) {
            robot.stepForward();
        }

    }

    private void changeDirectionY(Robot robot, int toY) {
        if (toY > robot.getY()) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
        }
        if (toY < robot.getY()) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        }
    }

    private void changeDirectionX(Robot robot, int toX) {
        if (toX > robot.getX()) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            }
        }
        if (toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        }
    }
}
