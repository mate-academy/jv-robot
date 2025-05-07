package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();
        if (x != toX || y != toY) {
            Direction direction = robot.getDirection();
            System.out.println("Robot's current direction: " + direction);
            if (toX > x) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
                for (int i = x; i < toX; i++) {
                    robot.stepForward();
                    System.out.println("x: " + robot.getX());
                }
            } else if (toX < x) {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
                for (int i = x; i > toX; i--) {
                    robot.stepForward();
                    System.out.println("x: " + robot.getX());
                }
            }

            if (toY > y) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
                for (int i = y; i < toY; i++) {
                    robot.stepForward();
                    System.out.println("y: " + robot.getY());
                }
            } else if (toY < y) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();
                }
                for (int i = 0; i < Math.abs(toY - y); i++) {
                    robot.stepForward();
                    System.out.println("y: " + robot.getY());
                }
            }
        }
        System.out.println("Final x: " + robot.getX());
        System.out.println("Final y: " + robot.getY());
    }
}
