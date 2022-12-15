package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
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
                case LEFT:
                default:
                    break;
            }
            while (toX < robot.getX()) {
                robot.stepForward();
            }
        }

        if (robot.getX() < toX) {
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
                default:
                    break;
            }
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        }

        if (robot.getY() > toY) {
            switch (robot.getDirection()) {
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

        if (robot.getY() < toY) {
            switch (robot.getDirection()) {
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

        if (robot.getX() == toX && robot.getY() == toY) {
            System.out.println("I'm home!");
        }

    }
}
