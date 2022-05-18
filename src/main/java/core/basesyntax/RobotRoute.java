package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        // turn to X
        if (robot.getX() > toX) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
                robot.turnRight();
            }
        } else if (robot.getX() < toX) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
                robot.turnRight();
            }
        }
        // move to X
        if (robot.getX() > toX) {
            for (int i = robot.getX(); i > toX; i--) {
                robot.stepForward();
            }
        } else if (robot.getX() < toX) {
            for (int i = robot.getX(); i < toX; i++) {
                robot.stepForward();
            }
        }
        // turn to Y
        if (robot.getY() < toY) {
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
                robot.turnRight();
            }
        } else if (robot.getY() > toY) {
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
                robot.turnRight();
            }
        }
        // move to Y
        if (robot.getY() > toY) {
            for (int i = robot.getY(); i > toY; i--) {
                robot.stepForward();
            }
        } else if (robot.getY() < toY) {
            for (int i = robot.getY(); i < toY; i++) {
                robot.stepForward();
            }
        }
        //turning to X
        if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        } else if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }
        //going to X
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        //turning to Y
        if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
        } else if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        }
        //going to Y
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}

