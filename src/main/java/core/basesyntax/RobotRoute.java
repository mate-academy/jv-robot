package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction direction = robot.getDirection();
        int startX = robot.getX();
        int startY = robot.getY();

        if (startX > toX) {
            switch (direction) {
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
                case LEFT:
                default:
                    break;
            }
            while (toX < robot.getX()) {
                robot.stepForward();
            }
        }

        if(startX < toX) {
            switch (direction) {
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
                default:
                    break;
            }
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        }

        if(startY > toY) {
            switch (direction) {
                case RIGHT:
                    robot.turnRight();
                    break;
                case LEFT:
                    robot.turnLeft();
                    break;
                case UP:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case DOWN:
                default:
                    break;
            }
            while (robot.getY() > toY) {
                robot.stepForward();
            }
        }

        if (startY < toY) {
            switch (direction) {
                case RIGHT:
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case UP:
                default:
                    break;
            }
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        }

        if (startX == toX && startY == toY) {
            System.out.println("I'm home!");
        }

    }
}
