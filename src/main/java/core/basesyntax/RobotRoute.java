package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() != toX) {
            Direction toDirectionX = (robot.getX() > toX) ? Direction.LEFT : Direction.RIGHT;
            if (toDirectionX == Direction.LEFT) {
                switch (robot.getDirection()) {
                    case RIGHT:
                        robot.turnLeft();
                        robot.turnLeft();
                        break;
                    case UP:
                        robot.turnLeft();
                        break;
                    case DOWN:
                        robot.turnRight();
                        break;
                    default:
                }
            } else { // toDirectionX = Direction.RIGHT
                switch (robot.getDirection()) {
                    case LEFT:
                        robot.turnRight();
                        robot.turnRight();
                        break;
                    case UP:
                        robot.turnRight();
                        break;
                    case DOWN:
                        robot.turnLeft();
                        break;
                    default:
                }
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }
        if (robot.getY() != toY) {
            Direction toDirectionY = (robot.getY() > toY) ? Direction.DOWN : Direction.UP;
            if (toDirectionY == Direction.DOWN) {
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
                }
            } else { // toDirectionX = Direction.UP
                switch (robot.getDirection()) {
                    case DOWN:
                        robot.turnRight();
                        robot.turnRight();
                        break;
                    case LEFT:
                        robot.turnRight();
                        break;
                    case RIGHT:
                        robot.turnLeft();
                        break;
                    default:
                }
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }
}
