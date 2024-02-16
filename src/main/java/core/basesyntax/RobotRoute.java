package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getY() != toY || robot.getX() != toX) {
            if (robot.getX() > toX) {
                moveRobotLeft(robot, toX);
            } else if (robot.getX() < toX) {
                moveRobotRight(robot, toX);
            }

            if (robot.getY() > toY) {
                moveRobotDown(robot, toY);
            } else if (robot.getY() < toY) {
                moveRobotUp(robot, toY);
            }
        }
    }

    private void moveRobotUp(Robot robot, int toY) {
        switch (robot.getDirection()) {
            case UP -> {
            }
            case DOWN -> {
                robot.turnRight();
                robot.turnRight();
            }
            case LEFT -> robot.turnRight();
            case RIGHT -> robot.turnLeft();
            default -> System.out.println("Robot has no direction!");
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private static void moveRobotDown(Robot robot, int toY) {
        switch (robot.getDirection()) {
            case UP -> {
                robot.turnRight();
                robot.turnRight();
            }
            case DOWN -> {
            }
            case LEFT -> robot.turnLeft();
            case RIGHT -> robot.turnRight();
            default -> System.out.println("Robot has no direction!");
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private static void moveRobotRight(Robot robot, int toX) {
        switch (robot.getDirection()) {
            case UP -> robot.turnRight();
            case DOWN -> robot.turnLeft();
            case LEFT -> {
                robot.turnLeft();
                robot.turnLeft();
            }
            case RIGHT -> {
            }
            default -> System.out.println("Robot has no direction!");
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    private void moveRobotLeft(Robot robot, int toX) {
        switch (robot.getDirection()) {
            case UP -> robot.turnLeft();
            case DOWN -> robot.turnRight();
            case LEFT -> {
            }
            case RIGHT -> {
                robot.turnRight();
                robot.turnRight();
            }
            default -> System.out.println("Robot has no direction!");
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }
}
