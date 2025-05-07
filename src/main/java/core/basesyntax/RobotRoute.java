package core.basesyntax;

public class RobotRoute {
    public static void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        int diffX = toX - currentX;
        int diffY = toY - currentY;

        while (diffX != 0 || diffY != 0) {
            if (diffX > 0) {
                turnAndMove(robot, Direction.RIGHT);
                diffX--;
            } else if (diffX < 0) {
                turnAndMove(robot, Direction.LEFT);
                diffX++;
            }

            if (diffY > 0) {
                turnAndMove(robot, Direction.UP);
                diffY--;
            } else if (diffY < 0) {
                turnAndMove(robot, Direction.DOWN);
                diffY++;
            }
        }
    }

    private static void turnAndMove(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnRight();
        }
        robot.stepForward();
    }

    public static void main(String[] args) {
        Robot robot = new Robot(Direction.RIGHT, 0, 0);
        int toX = 3;
        int toY = 4;

        System.out.println("Initial position: X = " + robot.getX() + ", Y = " + robot.getY());
        moveRobot(robot, toX, toY);
        System.out.println("Final position: X = " + robot.getX() + ", Y = " + robot.getY());
    }
}
