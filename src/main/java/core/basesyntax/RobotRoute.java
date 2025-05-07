package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        int i = robot.getX();
        int j = robot.getY();
        if (toX >= i) {
            if (toY >= j) {
                do {
                    do {
                        if (j == toY) {
                            break;
                        }
                        if (robot.getDirection() == Direction.UP) {
                            robot.stepForward();
                            j++;
                        } else {
                            robot.turnRight();
                        }
                    } while (j < toY);
                    if (robot.getDirection() == Direction.RIGHT) {
                        robot.stepForward();
                        i++;
                    } else {
                        robot.turnRight();
                    }
                } while (i < toX);
            } else {
                do {
                    do {
                        if (j == toY) {
                            break;
                        }
                        if (robot.getDirection() == Direction.DOWN) {
                            robot.stepForward();
                            j--;
                        } else {
                            robot.turnRight();
                        }
                    } while (j > toY);
                    if (robot.getDirection() == Direction.RIGHT) {
                        robot.stepForward();
                        i++;
                    } else {
                        robot.turnLeft();
                    }

                } while (i < toX);
            }
        } else {
            if (toY >= j) {
                do {
                    do {
                        if (j == toY) {
                            break;
                        }
                        if (robot.getDirection() == Direction.UP) {
                            robot.stepForward();
                            j++;
                        } else {
                            robot.turnRight();
                        }
                    } while (j < toY);
                    if (robot.getDirection() == Direction.LEFT) {
                        robot.stepForward();
                        i--;
                    } else {
                        robot.turnLeft();
                    }
                } while (i > toX);

            } else {
                do {
                    do {
                        if (j == toY) {
                            break;
                        }
                        if (robot.getDirection() == Direction.DOWN) {
                            robot.stepForward();
                            j--;
                        } else {
                            robot.turnRight();
                        }
                    } while (j > toY);
                    if (robot.getDirection() == Direction.LEFT) {
                        robot.stepForward();
                        i--;
                    } else {
                        robot.turnLeft();
                    }
                } while (i > toX);

            }
        }
    }
}
