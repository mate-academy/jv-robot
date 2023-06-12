package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveRobotAlongXAsis(robot, toX);
        moveRobotAlongYAsis(robot, toY);

    }

    public void moveRobotAlongXAsis(Robot robot, int toX) {
        int initialX = robot.getX();
        if (initialX < toX) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnRight();
                    break;
                case RIGHT:
                    break;
                case DOWN:
                    robot.turnLeft();
                    break;
                case LEFT:
                    for (int i = 0; i < 2; i++) {
                        robot.turnLeft();
                    }
                    break;
            }
        } else if (initialX > toX) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    break;
                case RIGHT:
                    for (int i = 0; i < 2; i++) {
                        robot.turnRight();
                    }
                    break;
                case DOWN:
                    robot.turnRight();
                    break;
                case LEFT:
                    break;
            }
        }
        for (int i = 0; i < Math.abs(initialX - toX); i++) {
            robot.stepForward();
        }
    }

    public void moveRobotAlongYAsis(Robot robot, int toY) {
        int initialY = robot.getY();
        if (initialY - toY < 0) {
            switch (robot.getDirection()) {
                case UP:
                    break;
                case RIGHT:
                    robot.turnLeft();
                    break;
                case DOWN:
                    for (int i = 0; i < 2; i++) {
                        robot.turnRight();
                    }
                    break;
                case LEFT:
                    robot.turnRight();
                    break;
            }
        } else if (initialY - toY > 0) {
            switch (robot.getDirection()) {
                case UP: //
                    for (int i = 0; i < 2; i++) {
                        robot.turnRight();
                    }
                    break;
                case RIGHT:
                    robot.turnRight();
                    break;
                case DOWN: //
                    break;
                case LEFT:
                    robot.turnLeft();
                    break;
            }
        }
        for (int i = 0; i < Math.abs(initialY - toY); i++) {
            robot.stepForward();
        }

    }
}
