package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        // *** Move UP + LEFT SQUARE ***
        if (toX <= robot.getX() && toY >= robot.getY()) {
            switch (robot.getDirection()) {
                case DOWN:
                    robot.turnRight();
                    while (toX < robot.getX()) {
                        robot.stepForward();
                    }
                    robot.turnRight();
                    while (toY > robot.getY()) {
                        robot.stepForward();
                    }
                case RIGHT:
                    robot.turnLeft();
                    while (toY > robot.getY()) {
                        robot.stepForward();
                    }
                    robot.turnLeft();
                    while (toX < robot.getX()) {
                        robot.stepForward();
                    }
                case UP:
                    while (toY > robot.getY()) {
                        robot.stepForward();
                    }
                    robot.turnLeft();
                    while (toX < robot.getX()) {
                        robot.stepForward();
                    }
                case LEFT:
                    while (toX < robot.getX()) {
                        robot.stepForward();
                    }
                    robot.turnRight();
                    while (toY > robot.getY()) {
                        robot.stepForward();
                    }
                default:
            }
        }
        // *** Move UP + RIGHT SQUARE ***
        if (toX >= robot.getX() && toY >= robot.getY()) {
            switch (robot.getDirection()) {
                case DOWN:
                    robot.turnLeft();
                    while (toX > robot.getX()) {
                        robot.stepForward();
                    }
                    robot.turnLeft();
                    while (toY > robot.getY()) {
                        robot.stepForward();
                    }
                case RIGHT:
                    robot.turnLeft();
                    while (toY > robot.getY()) {
                        robot.stepForward();
                    }
                    robot.turnRight();
                    while (toX > robot.getX()) {
                        robot.stepForward();
                    }
                case UP:
                    while (toY > robot.getY()) {
                        robot.stepForward();
                    }
                    robot.turnRight();
                    while (toX > robot.getX()) {
                        robot.stepForward();
                    }
                case LEFT:
                    robot.turnRight();
                    while (toY > robot.getY()) {
                        robot.stepForward();
                    }
                    robot.turnRight();
                    while (toX > robot.getX()) {
                        robot.stepForward();
                    }
                default:
            }
        }
        // *** Move BOTTOM + RIGHT SQUARE ***
        if (toX >= robot.getX() && toY <= robot.getY()) {
            switch (robot.getDirection()) {
                case DOWN:
                    while (toY < robot.getY()) {
                        robot.stepForward();
                    }
                    robot.turnLeft();
                    while (toX > robot.getX()) {
                        robot.stepForward();
                    }
                case RIGHT:
                    while (toX > robot.getX()) {
                        robot.stepForward();
                    }
                    robot.turnRight();
                    while (toY < robot.getY()) {
                        robot.stepForward();
                    }
                case UP:
                    robot.turnRight();
                    while (toX > robot.getX()) {
                        robot.stepForward();
                    }
                    robot.turnRight();
                    while (toY < robot.getY()) {
                        robot.stepForward();
                    }
                case LEFT:
                    robot.turnLeft();
                    while (toY < robot.getY()) {
                        robot.stepForward();
                    }
                    robot.turnLeft();
                    while (toX > robot.getX()) {
                        robot.stepForward();
                    }
                default:
            }
        }
        // *** Move BOTTOM + LEFT SQUARE ***
        if (toX <= robot.getX() && toY <= robot.getY()) {
            switch (robot.getDirection()) {
                case DOWN:
                    while (toY < robot.getY()) {
                        robot.stepForward();
                    }
                    robot.turnRight();
                    while (toX < robot.getX()) {
                        robot.stepForward();
                    }
                case RIGHT:
                    robot.turnRight();
                    while (toY < robot.getY()) {
                        robot.stepForward();
                    }
                    robot.turnRight();
                    while (toX < robot.getX()) {
                        robot.stepForward();
                    }
                case UP:
                    robot.turnLeft();
                    while (toX < robot.getX()) {
                        robot.stepForward();
                    }
                    robot.turnLeft();
                    while (toY < robot.getY()) {
                        robot.stepForward();
                    }
                case LEFT:
                    while (toX < robot.getX()) {
                        robot.stepForward();
                    }
                    robot.turnLeft();
                    while (toY < robot.getY()) {
                        robot.stepForward();
                    }
                default:
            }
        }
    }
}
