package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getDirection() == Direction.UP) {
            if (robot.getX() > toX) {
                robot.turnLeft();
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            } else if (robot.getX() < toX) {
                robot.turnRight();
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            }
        } else if (robot.getDirection() == Direction.DOWN) {
            if (robot.getX() > toX) {
                robot.turnRight();
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            } else if (robot.getX() < toX) {
                robot.turnLeft();
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            }
        } else if (robot.getDirection() == Direction.RIGHT) {
            if (robot.getX() > toX) {
                robot.turnRight();
                robot.turnRight();
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            } else if (robot.getX() < toX) {
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            }

        } else if (robot.getDirection() == Direction.LEFT) {
            if (robot.getX() > toX) {
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            } else if (robot.getX() < toX) {
                robot.turnLeft();
                robot.turnLeft();
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            }

        }
        if (robot.getDirection() == Direction.UP) {
            if (robot.getY() > toY) {
                robot.turnLeft();
                robot.turnLeft();
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            } else if (robot.getY() < toY) {
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        } else if (robot.getDirection() == Direction.DOWN) {
            if (robot.getY() > toY) {
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            } else if (robot.getY() < toY) {
                robot.turnLeft();
                robot.turnLeft();
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        } else if (robot.getDirection() == Direction.RIGHT) {
            if (robot.getY() > toY) {
                robot.turnRight();
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            } else if (robot.getY() < toY) {
                robot.turnLeft();
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }

        } else if (robot.getDirection() == Direction.LEFT) {
            if (robot.getY() > toY) {
                robot.turnLeft();
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            } else if (robot.getY() < toY) {
                robot.turnRight();
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }

        }
    }
}
