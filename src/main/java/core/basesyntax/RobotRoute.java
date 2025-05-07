package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        changeDirectionToX(robot, toX);
        int distance = Math.abs(toX - robot.getX());
        for (int i = 0; i < distance; i++) {
            robot.stepForward();
        }
        changeDirectionToY(robot, toY);
        distance = Math.abs(toY - robot.getY());
        for (int i = 0; i < distance; i++) {
            robot.stepForward();
        }
    }

    public void changeDirectionToX(Robot robot, int toX) {
        if (robot.getX() > toX) {
            switch (robot.getDirection()) {
                case DOWN -> robot.turnRight();
                case RIGHT -> {
                    robot.turnLeft();
                    robot.turnLeft();
                }
                case UP -> robot.turnLeft();
                default -> {
                }
            }
        } else if (robot.getX() < toX) {
            switch (robot.getDirection()) {
                case DOWN -> robot.turnLeft();
                case UP -> robot.turnRight();
                case LEFT -> {
                    robot.turnRight();
                    robot.turnRight();
                }
                default -> {
                }
            }
        }
    }

    public void changeDirectionToY(Robot robot, int toY) {
        if (robot.getY() < toY) {
            switch (robot.getDirection()) {
                case DOWN -> {
                    robot.turnRight();
                    robot.turnRight();
                }
                case RIGHT -> robot.turnLeft();
                case LEFT -> robot.turnRight();
                default -> {
                }
            }
        } else if (robot.getY() > toY) {
            switch (robot.getDirection()) {
                case UP -> {
                    robot.turnRight();
                    robot.turnRight();
                }
                case RIGHT -> robot.turnRight();
                case LEFT -> robot.turnLeft();
                default -> {
                }
            }
        }
    }

    public static void main(String[] args) {
        RobotRoute robotRoute = new RobotRoute();
        robotRoute.moveRobot(new Robot(Direction.DOWN, 12, -4), -9, 14);
    }
}
