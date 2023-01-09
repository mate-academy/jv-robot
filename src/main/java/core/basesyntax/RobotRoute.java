package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        int differenceX = robot.getX() - toX;
        int differenceY = robot.getY() - toY;
        int diffX = Math.abs(robot.getX() - toX);
        int diffY = Math.abs(robot.getY() - toY);

        if (differenceX > 0) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    break;
                case DOWN: case RIGHT:
                    while (!robot.getDirection().equals(Direction.LEFT)) {
                        robot.turnRight();
                    }
                    break;
                case LEFT: default:
                    break;
            }
            for (int i = 0; i < diffX; i++) {
                robot.stepForward();
            }

            if (differenceY > 0) {
                robot.turnLeft();
                for (int i = 0; i < diffY; i++) {
                    robot.stepForward();
                }
            } else if (differenceY < 0) {
                robot.turnRight();
                for (int i = 0; i < diffY; i++) {
                    robot.stepForward();
                }
            }
        } else if (differenceX < 0) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnRight();
                    break;
                case DOWN: case LEFT:
                    while (!robot.getDirection().equals(Direction.RIGHT)) {
                        robot.turnLeft();
                    }
                    break;
                case RIGHT: default:
                    break;
            }
            for (int i = 0; i < diffX; i++) {
                robot.stepForward();
            }

            if (differenceY > 0) {
                robot.turnRight();
                for (int i = 0; i < diffY; i++) {
                    robot.stepForward();
                }
            } else if (differenceY < 0) {
                robot.turnLeft();
                for (int i = 0; i < diffY; i++) {
                    robot.stepForward();
                }
            }

        } else {
            if (differenceY < 0) {
                switch (robot.getDirection()) {
                    case LEFT:
                        robot.turnRight();
                        break;
                    case DOWN: case RIGHT:
                        while (!robot.getDirection().equals(Direction.LEFT)) {
                            robot.turnLeft();
                        }
                        break;
                    case UP: default:
                        break;
                }
                for (int i = 0; i < diffY; i++) {
                    robot.stepForward();
                }
            } else if (differenceY > 0) {
                switch (robot.getDirection()) {
                    case RIGHT:
                        robot.turnLeft();
                        break;
                    case UP: case LEFT:
                        while (!robot.getDirection().equals(Direction.RIGHT)) {
                            robot.turnLeft();
                        }
                        break;
                    case DOWN: default:
                        break;
                }
                for (int i = 0; i < diffY; i++) {
                    robot.stepForward();
                }
            }
        }
    }
}
