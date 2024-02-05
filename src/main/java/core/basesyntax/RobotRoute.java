package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX > robot.getX()) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case RIGHT:
                    break;
            }
            while (toX != robot.getX()) {
                robot.stepForward();
            }
        } else if (toX < robot.getX()) {

            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnRight();
                    break;
                case LEFT:
                    break;
                case RIGHT:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
            }
            while (toX != robot.getX()) {
                robot.stepForward();
            }
        }
        if (toY > robot.getY()) {
            switch (robot.getDirection()) {
                case UP:
                    break;
                case DOWN:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    break;
            }
            while (toY != robot.getY()) {
                robot.stepForward();
            }
        } else if (toY < robot.getY()) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case DOWN:
                    break;
                case LEFT:
                    robot.turnLeft();
                    break;
                case RIGHT:
                    robot.turnRight();
                    break;
            }
            while (toY != robot.getY()) {
                robot.stepForward();
            }
        }
    }
}
