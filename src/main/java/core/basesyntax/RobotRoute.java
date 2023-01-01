package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int diffX = robot.getX() - toX;
        if (robot.getX() > toX) {
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
                    robot.turnRight();
                    robot.turnLeft();
            }
        } else if (robot.getX() < toX) {
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
                    robot.turnRight();
                    robot.turnLeft();
            }
        }
        for (int i = 0; i < Math.abs(diffX); i++) {
            robot.stepForward();
        }
        if (robot.getY() > toY) {
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
                    robot.turnRight();
                    robot.turnLeft();
            }
        } else if (robot.getY() < toY) {
            switch (robot.getDirection()) {
                case DOWN:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    break;
                default:
                    robot.turnRight();
                    robot.turnLeft();
            }
        }
        int diffY = robot.getY() - toY;
        for (int i = 0; i < Math.abs(diffY); i++) {
            robot.stepForward();
        }
    }

    public static void main(String[] args) {
        Robot robot = new Robot(Direction.UP, 4, 3);
        RobotRoute robotRoute = new RobotRoute();
        robotRoute.moveRobot(robot, 0, 0);
        System.out.println(robot);
    }
}
