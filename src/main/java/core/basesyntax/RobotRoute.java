package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() == toX && robot.getY() == toY) {
            System.out.println("Robot on the position");
        }
        if (robot.getX() > toX) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnRight();
                    break;
                case RIGHT:
                    for (int i = 0; i <= 2; i++) {
                        robot.turnRight();
                    }
                    break;
                default:
                    break;
            }
            for (int position = robot.getX(); position >= toX; position--) {
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
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
                    for (int i = 0; i <= 2; i++) {
                        robot.turnRight();
                    }
                    break;
                default:
                    break;
            }
            for (int position = robot.getX(); position <= toX; position++) {
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            }
        }
        if (robot.getY() > toY) {
            switch (robot.getDirection()) {
                case LEFT:
                    robot.turnLeft();
                    break;
                case RIGHT:
                    robot.turnRight();
                    break;
                case UP:
                    for (int i = 0; i <= 2; i++) {
                        robot.turnRight();
                    }
                    break;
                default:
                    break;
            }
            for (int position = robot.getY(); position >= toY; position--) {
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        }
        if (robot.getY() < toY) {
            switch (robot.getDirection()) {
                case LEFT:
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    break;
                case DOWN:
                    for (int i = 0; i <= 2; i++) {
                        robot.turnRight();
                    }
                    break;
                default:
                    break;
            }
            for (int position = robot.getY(); position <= toY; position++) {
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        }
    }
}
