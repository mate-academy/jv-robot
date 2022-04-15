package core.basesyntax;

public class RobotRoute {
    public static void main(String[] args) {
        moveRobot(new Robot(Direction.RIGHT, 4, 3), 10, 10);
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        System.out.println(printInfo(robot, toX, toY)
                + " It's starting condition. Robot hasn't move yet.");

        rotateRobotX(robot, toX);
        System.out.println(printInfo(robot, toX, toY) + " It rotated to move along axis X");

        moveRobotX(robot, toX);
        System.out.println(printInfo(robot, toX, toY) + " It reached point X");

        rotateRobotY(robot, toY);
        System.out.println(printInfo(robot, toX, toY) + " It rotated to move along axis Y");

        moveRobotY(robot, toY);
        System.out.println(printInfo(robot, toX, toY) + " It reached final destination.");
    }

    public static void rotateRobotX(Robot robot, int toX) {
        Direction direction;
        int botX = robot.getX();

        if (botX == toX) {
            return;
        }

        if (botX > toX) {
            direction = Direction.LEFT;
        } else {
            direction = Direction.RIGHT;
        }

        while (!direction.equals(robot.getDirection())) {
            robot.turnLeft();
        }
    }

    public static void rotateRobotY(Robot robot, int toY) {
        Direction direction;
        int botY = robot.getY();

        if (botY == toY) {
            return;
        }

        if (botY > toY) {
            direction = Direction.DOWN;
        } else {
            direction = Direction.UP;
        }

        while (!direction.equals(robot.getDirection())) {
            robot.turnLeft();
        }
    }

    public static void moveRobotX(Robot robot, int toX) {
        if (robot.getX() == toX) {
            return;
        }

        while (toX != robot.getX()) {
            robot.stepForward();
        }
    }

    public static void moveRobotY(Robot robot, int toY) {
        if (robot.getY() == toY) {
            return;
        }

        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }

    private static String printInfo(Robot bot, int toX, int toY) {
        return String.format("%s move to {%d, %d}.", bot.printInfo(), toX, toY);
    }
}
