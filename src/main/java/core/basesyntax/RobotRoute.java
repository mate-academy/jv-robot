package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        findRightX(robot, toX);
        findRightY(robot, toY);
    }

    private void findRightX(Robot robot, int toX) {
        while (robot.getX() != toX) {
            if (robot.getX() > toX) {
                findRightDirection(robot, Direction.LEFT);
            } else {
                findRightDirection(robot, Direction.RIGHT);
            }
            robot.stepForward();
        }
    }

    private void findRightY(Robot robot, int toY) {
        while (robot.getY() != toY) {
            if (robot.getY() > toY) {
                findRightDirection(robot, Direction.DOWN);
            } else {
                findRightDirection(robot, Direction.UP);
            }
            robot.stepForward();
        }
    }

    private void findRightDirection(Robot robot, Direction correct) {
        while (robot.getDirection() != correct) {
            robot.turnLeft();
        }
    }

    public static void main(String[] args) {
        Robot robot = new Robot(Direction.UP, 1, 1);
        int toX = 0;
        int toY = 0;
        RobotRoute route = new RobotRoute();
        route.moveRobot(robot, toX, toY);
        System.out.println("Finding the route...");
        if (robot.getX() == toX && robot.getY() == toY) {
            System.out.println("The route found!");
        }
    }
}
