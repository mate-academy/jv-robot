package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        while (!(robot.getY() == toY)) {
            if (toY > robot.getY()) {
                switch (robot.getDirection()) {
                    case UP : robot.stepForward();
                        break;
                    case LEFT, DOWN : robot.turnRight();
                        break;
                    case RIGHT : robot.turnLeft();
                        break;
                    default: break;
                }
            } else if (toY < robot.getY()) {
                switch (robot.getDirection()) {
                    case DOWN : robot.stepForward();
                        break;
                    case LEFT, UP : robot.turnLeft();
                        break;
                    case RIGHT : robot.turnRight();
                        break;
                    default: break;
                }
            }
        }

        while (!(robot.getX() == toX)) {
            if (toX > robot.getX()) {
                switch (robot.getDirection()) {
                    case DOWN : robot.turnLeft();
                        break;
                    case LEFT, UP : robot.turnRight();
                        break;
                    case RIGHT : robot.stepForward();
                        break;
                    default: break;
                }
            } else if (toX < robot.getX()) {
                switch (robot.getDirection()) {
                    case DOWN : robot.turnRight();
                        break;
                    case RIGHT, UP : robot.turnLeft();
                        break;
                    case LEFT : robot.stepForward();
                        break;
                    default: break;
                }
            }
        }
    }
}
