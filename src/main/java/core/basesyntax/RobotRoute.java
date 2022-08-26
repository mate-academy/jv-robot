package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        this.moveRobotX(robot, toX);
        this.moveRobotY(robot, toY);
    }

    private void moveRobotX(Robot robot, int toX) {

        int steps = Math.abs(robot.getX() - toX);
        Direction direction = robot.getDirection();

        if (robot.getX() > toX) {
            switch (direction) {
                case UP -> robot.turnLeft();
                case RIGHT -> {
                    for (int i = 0; i < 2; i++) {
                        robot.turnLeft();
                    }
                }
                case DOWN -> robot.turnRight();
            }

        } else if (robot.getX() < toX) {
            switch (direction) {
                case UP -> robot.turnRight();
                case LEFT -> {
                    for (int i = 0; i < 2; i++) {
                        robot.turnLeft();
                    }
                }
                case DOWN -> robot.turnLeft();
            }
        }

        for (int i = 0; i < steps; i++) {
            robot.stepForward();
        }
    }

    private void moveRobotY(Robot robot, int toY) {

        int steps = Math.abs(robot.getY() - toY);
        Direction direction = robot.getDirection();

        if (robot.getY() > toY) {
            switch (direction) {
                case RIGHT -> robot.turnRight();
                case UP -> {
                    for (int i = 0; i < 3; i++) {
                        robot.turnLeft();
                    }
                }
                case LEFT -> robot.turnLeft();
            }

        } else if (robot.getY() < toY) {
            switch (direction) {
                case RIGHT -> robot.turnLeft();
                case DOWN -> {
                    for (int i = 0; i < 3; i++) {
                        robot.turnLeft();
                    }
                }
                case LEFT -> robot.turnRight();
            }
        }

        for (int i = 0; i < steps; i++) {
            robot.stepForward();
        }
    }
}
