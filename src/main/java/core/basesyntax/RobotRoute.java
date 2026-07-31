package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            if (robot.getX() > toX && robot.getDirection() != Direction.LEFT) {
                switch (robot.getDirection()) {
                    case UP:
                        robot.turnLeft();
                        break;
                    case DOWN:
                        robot.turnRight();
                        break;
                    case RIGHT:
                        robot.turnLeft();
                        robot.turnLeft();
                        break;
                    default:
                        break;
                }
            }

            if (robot.getX() < toX && robot.getDirection() != Direction.RIGHT) {
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
                    default:
                        break;
                }
            }
            robot.stepForward();
        }

        while (robot.getY() != toY) {
            if (robot.getY() > toY && robot.getDirection() != Direction.DOWN) {
                switch (robot.getDirection()) {
                    case UP:
                        robot.turnLeft();
                        robot.turnLeft();
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

            if (robot.getY() < toY && robot.getDirection() != Direction.UP) {
                switch (robot.getDirection()) {
                    case RIGHT:
                        robot.turnLeft();
                        break;
                    case DOWN:
                        robot.turnLeft();
                        robot.turnLeft();
                        break;
                    case LEFT:
                        robot.turnRight();
                        break;
                    default:
                        break;
                }
            }
            robot.stepForward();
        }
    }
}
