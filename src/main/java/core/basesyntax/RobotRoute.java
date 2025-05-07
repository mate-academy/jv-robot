package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Robot r = robot;

        if (r.getX() == toX && r.getY() < toY) {
            while (r.getY() < toY) {
                r.stepForward();
            }
        }

        if (r.getY() > toY && r.getX() > toX && r.getDirection() == Direction.UP) {
            r.turnLeft();
        } else if (r.getY() > toY && r.getX() > toX && r.getDirection() == Direction.RIGHT) {
            r.turnRight();
        } else if (r.getY() > toY && r.getX() < toX && r.getDirection() == Direction.LEFT) {
            r.turnLeft();
        } else if (r.getY() > toY && r.getX() < toX && r.getDirection() == Direction.UP) {
            r.turnRight();
        } else if (r.getY() < toY && r.getX() < toX && r.getDirection() == Direction.DOWN) {
            r.turnLeft();
        } else if (r.getY() < toY && r.getX() < toX && r.getDirection() == Direction.LEFT) {
            r.turnRight();
        } else if (r.getY() < toY && r.getX() > toX && r.getDirection() == Direction.RIGHT) {
            r.turnLeft();
        } else if (r.getY() < toY && r.getX() > toX && r.getDirection() == Direction.DOWN) {
            r.turnRight();
        }

        if (r.getY() > toY && r.getX() > toX && r.getDirection() == Direction.LEFT) {
            while (r.getX() > toX) {
                r.stepForward();
            }
            r.turnLeft();
            while (r.getY() > toY) {
                r.stepForward();
            }
        } else if (r.getY() > toY && r.getX() > toX && r.getDirection() == Direction.DOWN) {
            while (r.getY() > toY) {
                r.stepForward();
            }
            r.turnRight();
            while (r.getX() > toX) {
                r.stepForward();
            }
        } else if (r.getY() > toY && r.getX() < toX && r.getDirection() == Direction.DOWN) {
            while (r.getY() > toY) {
                r.stepForward();
            }
            r.turnLeft();
            while (r.getX() < toX) {
                r.stepForward();
            }
        } else if (r.getY() > toY && r.getX() < toX && r.getDirection() == Direction.RIGHT) {
            while (r.getX() < toX) {
                r.stepForward();
            }
            r.turnRight();
            while (r.getY() > toY) {
                r.stepForward();
            }
        } else if (r.getY() < toY && r.getX() < toX && r.getDirection() == Direction.RIGHT) {
            while (r.getX() < toX) {
                r.stepForward();
            }
            r.turnLeft();
            while (r.getY() < toY) {
                r.stepForward();
            }
        } else if (r.getY() < toY && r.getX() < toX && r.getDirection() == Direction.UP) {
            while (r.getY() < toY) {
                r.stepForward();
            }
            r.turnRight();
            while (r.getX() < toX) {
                r.stepForward();
            }
        } else if (r.getY() < toY && r.getX() > toX && r.getDirection() == Direction.UP) {
            while (r.getY() < toY) {
                r.stepForward();
            }
            r.turnLeft();
            while (r.getX() > toX) {
                r.stepForward();
            }
        } else if (r.getY() < toY && r.getX() > toX && r.getDirection() == Direction.LEFT) {
            while (r.getX() > toX) {
                r.stepForward();
            }
            r.turnRight();
            while (r.getY() < toY) {
                r.stepForward();
            }
        }
    }
}
