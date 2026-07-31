package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int distanceX = robot.getX() < toX ? toX - robot.getX() : robot.getX() - toX;
        if (robot.getX() < toX && !robot.getDirection().equals(Direction.RIGHT)) {
            switch (robot.getDirection()) {
                case UP :
                    robot.turnRight();
                    break;
                case DOWN :
                    robot.turnLeft();
                    break;
                default:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
            }
        } else if (robot.getX() > toX && !robot.getDirection().equals(Direction.LEFT)) {
            switch (robot.getDirection()) {
                case UP :
                    robot.turnLeft();
                    break;
                case DOWN :
                    robot.turnRight();
                    break;
                default:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
            }
        }
        for (int i = 0; i < distanceX; i++) {
            robot.stepForward();
        }

        int distanceY = robot.getY() < toY ? toY - robot.getY() : robot.getY() - toY;
        if (robot.getY() < toY && !robot.getDirection().equals(Direction.UP)) {
            switch (robot.getDirection()) {
                case LEFT:
                    robot.turnRight();
                    break;
                case RIGHT :
                    robot.turnLeft();
                    break;
                default:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
            }
        } else if (robot.getY() > toY && !robot.getDirection().equals(Direction.DOWN)) {
            switch (robot.getDirection()) {
                case LEFT :
                    robot.turnLeft();
                    break;
                case RIGHT :
                    robot.turnRight();
                    break;
                default:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
            }
        }
        for (int j = 0; j < distanceY; j++) {
            robot.stepForward();
        }
    }
}
