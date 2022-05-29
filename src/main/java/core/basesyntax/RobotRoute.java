package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction direction = robot.getDirection();
        int x = robot.getX();
        int y = robot.getY();
        int vectorX = toX - x;
        int vectorY = toY - y;
        if (vectorX != 0) {
            Direction goX = (vectorX > 0) ? Direction.RIGHT : Direction.LEFT;
            if (!direction.equals(goX)) {
                if (goX == Direction.LEFT) {
                    switch (direction) {
                        case UP:
                            robot.turnLeft();
                            break;
                        case DOWN:
                            robot.turnRight();
                            break;
                        case RIGHT:
                            robot.turnLeft();
                            robot.turnLeft();
                            break;
                        default:
                            break;
                    }
                } else {
                    switch (direction) {
                        case UP:
                            robot.turnRight();
                            break;
                        case DOWN:
                            robot.turnLeft();
                            break;
                        case LEFT:
                            robot.turnLeft();
                            robot.turnLeft();
                            break;
                        default:
                            break;
                    }
                }
            }
            for (int i = 0; i < Math.abs(vectorX); i++) {
                robot.stepForward();
            }
        }
        direction = robot.getDirection();
        if (vectorY != 0) {
            Direction goY = (vectorY > 0) ? Direction.UP : Direction.DOWN;
            if (!direction.equals(goY)) {
                if (goY == Direction.UP) {
                    switch (direction) {
                        case LEFT:
                            robot.turnRight();
                            break;
                        case DOWN:
                            robot.turnLeft();
                            robot.turnLeft();
                            break;
                        case RIGHT:
                            robot.turnLeft();
                            break;
                        default:
                            break;
                    }
                } else {
                    switch (direction) {
                        case LEFT:
                            robot.turnLeft();
                            break;
                        case UP:
                            robot.turnLeft();
                            robot.turnLeft();
                            break;
                        case RIGHT:
                            robot.turnRight();
                            break;
                        default:
                            break;
                    }
                }
            }
            for (int i = 0; i < Math.abs(vectorY); i++) {
                robot.stepForward();
            }
        }

    }
}
