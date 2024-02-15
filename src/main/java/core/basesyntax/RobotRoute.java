package core.basesyntax;

public class RobotRoute {
    private Robot robot;
    private int toX;
    private int toY;

    public void moveRobot(Robot robot, int toX, int toY) {
        this.robot = robot;
        this.toX = toX;
        this.toY = toY;
        moving();
        moving();
    }

    private void moving() {
        findProperDirection();
        while (toX != robot.getX() && toY != robot.getY()) {
            robot.stepForward();
        }
        findProperDirection();
        while (toX != robot.getX() ^ toY != robot.getY()) {
            robot.stepForward();
        }
    }

    private void findProperDirection() {
        Direction currentDirection = robot.getDirection();
        int currentX = robot.getX();
        int currentY = robot.getY();
        if (toX > currentX) {
            switch (currentDirection) {
                case UP -> robot.turnRight();
                case LEFT -> {
                    robot.turnRight();
                    robot.turnRight();
                }
                case DOWN -> robot.turnLeft();
                default -> { }
            }
        } else if (toY > currentY) {
            switch (currentDirection) {
                case LEFT -> robot.turnRight();
                case RIGHT -> robot.turnLeft();
                case DOWN -> {
                    robot.turnLeft();
                    robot.turnLeft();
                }
                default -> { }
            }
        } else if (toX < currentX) {
            switch (currentDirection) {
                case UP -> robot.turnLeft();
                case DOWN -> robot.turnRight();
                case RIGHT -> {
                    robot.turnRight();
                    robot.turnRight();
                }
                default -> { }
            }
        } else {
            switch (currentDirection) {
                case LEFT -> robot.turnLeft();
                case RIGHT -> robot.turnRight();
                case UP -> {
                    robot.turnLeft();
                    robot.turnLeft();
                }
                default -> { }
            }
        }
    }
}
