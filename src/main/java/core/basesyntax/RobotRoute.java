package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int x = toX - robot.getX();
        int y = toY - robot.getY();

        if (x > 0) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            for (int i = 0; i < x; i++) {
                robot.stepForward();
            }
        } else if (x < 0) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            for (int i = 0; i > x; i--) {
                robot.stepForward();
            }
        }

        if (y > 0) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
            for (int i = 0; i < y; i++) {
                robot.stepForward();
            }
        } else if (y < 0) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            for (int i = 0; i > y; i--) {
                robot.stepForward();
            }
        }
    }

    public static void main(String[] args) {
        Robot robot = new Robot(
                Direction.values()[(int) (Math.random() * Direction.values().length)],
                (int) (Math.random() * 100), (int) (Math.random() * 100));
        RobotRoute route = new RobotRoute();
        route.moveRobot(robot, 10, 5);

        System.out.println("Robot destination on X: " + robot.getX() + ", Y: " + robot.getY()
                + ". Direction is " + robot.getDirection());
    }
}
