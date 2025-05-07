package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int step = 0;
        if (robot.getX() < toX) {
            step = toX - robot.getX();
            switch (robot.getDirection()) {
                case UP:
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                default:
                    break;
            }
            for (int i = 0; i < step; i++) {
                robot.stepForward();
            }
        } else if (robot.getX() > toX) {
            step = robot.getX() - toX;
            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                default:
                    break;
            }
            for (int i = 0; i < step; i++) {
                robot.stepForward();

            }
        }
        if (robot.getY() < toY) {
            step = toY - robot.getY();
            switch (robot.getDirection()) {
                case RIGHT:
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case LEFT:
                    robot.turnRight();
                    break;
                default:
                    break;
            }
            for (int i = 0; i < step; i++) {
                robot.stepForward();
            }
        } else if (robot.getY() > toY) {
            step = robot.getY() - toY;
            switch (robot.getDirection()) {
                case UP:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnRight();
                    break;
                case LEFT:
                    robot.turnLeft();
                    break;
                default:
                    break;
            }
            for (int i = 0; i < step; i++) {
                robot.stepForward();
            }
        }

        if (robot.getX() == toX && robot.getY() == toY) {
            System.out.println("I'm at home!");
        } else {
            System.out.println("Still not at home!!!");
        }
    }
}
