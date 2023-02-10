package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        // *** Move UP + LEFT SQUARE ****
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
                    break;
                case RIGHT:
                    robot.turnLeft();
                    while (toY > robot.getY()) {
                        robot.stepForward();
                    }
                    robot.turnLeft();
                    while (toX < robot.getX()) {
                        robot.stepForward();
                    }
                    break;
                case UP:
                    while (toY > robot.getY()) {
                        robot.stepForward();
                    }
                    robot.turnLeft();
                    while (toX < robot.getX()) {
                        robot.stepForward();
                    }
                    break;
                case LEFT:
                    while (toX < robot.getX()) {
                        robot.stepForward();
                    }
                    robot.turnRight();
                    while (toY > robot.getY()) {
                        robot.stepForward();
                    }
                    break;
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
                    break;
                case RIGHT:
                    robot.turnLeft();
                    while (toY > robot.getY()) {
                        robot.stepForward();
                    }
                    robot.turnRight();
                    while (toX > robot.getX()) {
                        robot.stepForward();
                    }
                    break;
                case UP:
                    while (toY > robot.getY()) {
                        robot.stepForward();
                    }
                    robot.turnRight();
                    while (toX > robot.getX()) {
                        robot.stepForward();
                    }
                    break;
                case LEFT:
                    robot.turnRight();
                    while (toY > robot.getY()) {
                        robot.stepForward();
                    }
                    robot.turnRight();
                    while (toX > robot.getX()) {
                        robot.stepForward();
                    }
                    break;
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
                    break;
                case RIGHT:
                    while (toX > robot.getX()) {
                        robot.stepForward();
                    }
                    robot.turnRight();
                    while (toY < robot.getY()) {
                        robot.stepForward();
                    }
                    break;
                case UP:
                    robot.turnRight();
                    while (toX > robot.getX()) {
                        robot.stepForward();
                    }
                    robot.turnRight();
                    while (toY < robot.getY()) {
                        robot.stepForward();
                    }
                    break;
                case LEFT:
                    robot.turnLeft();
                    while (toY < robot.getY()) {
                        robot.stepForward();
                    }
                    robot.turnLeft();
                    while (toX > robot.getX()) {
                        robot.stepForward();
                    }
                    break;
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
                    break;
                case RIGHT:
                    robot.turnRight();
                    while (toY < robot.getY()) {
                        robot.stepForward();
                    }
                    robot.turnRight();
                    while (toX < robot.getX()) {
                        robot.stepForward();
                    }
                    break;
                case UP:
                    robot.turnLeft();
                    while (toX < robot.getX()) {
                        robot.stepForward();
                    }
                    robot.turnLeft();
                    while (toY < robot.getY()) {
                        robot.stepForward();
                    }
                    break;
                case LEFT:
                    while (toX < robot.getX()) {
                        robot.stepForward();
                    }
                    robot.turnLeft();
                    while (toY < robot.getY()) {
                        robot.stepForward();
                    }
                    break;
                default:
            }
        }
    }
}
