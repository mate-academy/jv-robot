package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            if (robot.getX() < toX) {
                if (robot.getDirection() != Direction.RIGHT) {
                    switch (robot.getDirection()) {
                        case UP:
                            robot.turnRight();
                            break;
                        case LEFT:
                            robot.turnRight();
                            robot.turnRight();
                            break;
                        case DOWN:
                            robot.turnLeft();
                            break;
                        default:
                            break;
                    }
                }

                robot.stepForward();
            } else {
                if (robot.getDirection() != Direction.LEFT) {
                    switch (robot.getDirection()) {
                        case UP:
                            robot.turnLeft();
                            break;
                        case RIGHT:
                            robot.turnRight();
                            robot.turnRight();
                            break;
                        case DOWN:
                            robot.turnRight();
                            break;
                        default:
                            break;
                    }
                }

                robot.stepForward();
            }
        }

        while (robot.getY() != toY) {
            if (robot.getY() < toY) {
                if (robot.getDirection() != Direction.UP) {
                    switch (robot.getDirection()) {
                        case RIGHT:
                            robot.turnLeft();
                            break;
                        case LEFT:
                            robot.turnRight();
                            break;
                        case DOWN:
                            robot.turnRight();
                            robot.turnRight();
                            break;
                        default:
                            break;
                    }
                }

                robot.stepForward();
            } else {
                if (robot.getDirection() != Direction.DOWN) {
                    switch (robot.getDirection()) {
                        case LEFT:
                            robot.turnLeft();
                            break;
                        case RIGHT:
                            robot.turnRight();
                            break;
                        case UP:
                            robot.turnRight();
                            robot.turnRight();
                            break;
                        default:
                            break;
                    }
                }

                robot.stepForward();
            }
        }
    }
}
