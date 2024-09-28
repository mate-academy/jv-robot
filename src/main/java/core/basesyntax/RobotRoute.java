package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        while (robot.getX() != toX) {

            if (robot.getX() > toX && robot.getDirection() == Direction.LEFT) {
                robot.stepForward();
            } else if (robot.getX() > toX && robot.getDirection() != Direction.LEFT) {
                switch (robot.getDirection()) {
                    case UP :
                        robot.turnLeft();
                        break;
                    case RIGHT:
                        robot.turnRight();
                        robot.turnRight();
                        break;
                    case DOWN :
                        robot.turnRight();
                        break;
                    default:
                        break;
                }
            } else if (robot.getX() < toX && robot.getDirection() == Direction.RIGHT) {
                robot.stepForward();
            } else {
                switch (robot.getDirection()) {
                    case UP:
                        robot.turnRight();
                        break;
                    case LEFT:
                        robot.turnLeft();
                        robot.turnLeft();
                        break;
                    case DOWN:
                        robot.turnLeft();
                        break;
                    default:
                        break;
                }
            }
        }

        while (robot.getY() != toY) {
            if (robot.getY() < toY && robot.getDirection() == Direction.UP) {
                robot.stepForward();
            } else if (robot.getY() < toY && robot.getDirection() != Direction.UP) {
                switch (robot.getDirection()) {
                    case DOWN:
                        robot.turnRight();
                        robot.turnRight();
                        break;
                    case LEFT:
                        robot.turnLeft();
                        break;
                    case RIGHT:
                        robot.turnRight();
                        break;
                    default:
                        break;
                }
            } else if (robot.getY() > toY && robot.getDirection() == Direction.DOWN) {
                robot.stepForward();
            } else {
                switch (robot.getDirection()) {
                    case UP:
                        robot.turnRight();
                        robot.turnRight();
                        break;
                    case LEFT:
                        robot.turnLeft();
                        break;
                    case RIGHT:
                        robot.turnRight();
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
