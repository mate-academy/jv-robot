package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int diff_X = robot.getX() - toX;
        int diff_Y = robot.getY() - toY;
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
            }
        }
        for (int i = 0; i < Math.abs(diff_X); i++) {
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
            }
        }
        for (int i = 0; i < Math.abs(diff_Y); i++) {
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
