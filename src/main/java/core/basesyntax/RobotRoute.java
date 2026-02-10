package core.basesyntax;

public class RobotRoute {

    private void firstUp(Robot robot, Direction currentDirection) {
        if (currentDirection == Direction.LEFT) {
            robot.turnRight();
        }
        if (currentDirection == Direction.RIGHT) {
            robot.turnLeft();
        }
        if (currentDirection == Direction.DOWN) {
            robot.turnRight();
            robot.turnRight();
        }
    }

    private void firstDown(Robot robot, Direction currentDirection) {
        if (currentDirection == Direction.LEFT) {
            robot.turnLeft();
        }
        if (currentDirection == Direction.RIGHT) {
            robot.turnRight();
        }
        if (currentDirection == Direction.UP) {
            robot.turnRight();
            robot.turnRight();
        }
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        int xway = toX - robot.getX();
        int yway = toY - robot.getY();
        Direction currentDirection = robot.getDirection();

        if (xway > 0 && yway > 0) {
            firstUp(robot, currentDirection);

            for (int i = 0; i < yway; i++) {
                robot.stepForward();
            }

            robot.turnRight();

            for (int i = 0; i < xway; i++) {
                robot.stepForward();
            }
        }

        if (xway < 0 && yway < 0) {
            firstDown(robot, currentDirection);

            for (int i = 0; i > yway; i--) {
                robot.stepForward();
            }

            robot.turnRight();

            for (int i = 0; i > xway; i--) {
                robot.stepForward();
            }
        }

        if (xway < 0 && yway > 0) {
            firstUp(robot, currentDirection);

            for (int i = 0; i < yway; i++) {
                robot.stepForward();
            }

            robot.turnLeft();

            for (int i = 0; i > xway; i--) {
                robot.stepForward();
            }
        }

        if (xway > 0 && yway < 0) {
            firstDown(robot, currentDirection);

            for (int i = 0; i > yway; i--) {
                robot.stepForward();
            }

            robot.turnLeft();

            for (int i = 0; i < xway; i++) {
                robot.stepForward();
            }
        }

        if (xway == 0) {
            if (yway >= 0) {
                firstUp(robot, currentDirection);
                for (int i = 0; i < yway; i++) {
                    robot.stepForward();
                }
            } else {
                firstDown(robot, currentDirection);
                for (int i = 0; i > yway; i--) {
                    robot.stepForward();
                }
            }
        }

        if (yway == 0) {
            if (xway >= 0) {
                firstUp(robot, currentDirection);
                robot.turnRight();
                for (int i = 0; i < xway; i++) {
                    robot.stepForward();
                }
            } else {
                firstUp(robot, currentDirection);
                robot.turnLeft();
                for (int i = 0; i > xway; i--) {
                    robot.stepForward();
                }
            }
        }
    }
}
