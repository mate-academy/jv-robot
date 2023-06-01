package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction robotDirection = robot.getDirection();
        int posX = robot.getX();
        int posY = robot.getY();
        int distanceX = toX - posX;
        int distanceY = toY - posY;

        changeDirectionX(robot, distanceX);
        for (int i = 0; i < Math.abs(distanceX); i++) {
            robot.stepForward();
        }

        changeDirectionY(robot, distanceY);
        for (int i = 0; i < Math.abs(distanceY); i++) {
            robot.stepForward();
        }
    }

    private void changeDirectionX(Robot robot, int distanceX) {

        if (distanceX > 0) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }

        if (distanceX < 0) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        }
    }

    private void changeDirectionY(Robot robot, int distanceY) {

        if (distanceY > 0) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        }

        if (distanceY < 0) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        }
    }
}
