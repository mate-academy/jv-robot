package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();

        int stepToX = toX - x;
        int stepToY = toY - y;

        Direction directionToX = null;
        if (stepToX > 0) {
            directionToX = Direction.RIGHT;
        } else if (stepToX < 0) {
            directionToX = Direction.LEFT;
        }

        Direction directionToY = null;
        if (stepToY > 0) {
            directionToY = Direction.UP;
        } else if (stepToY < 0) {
            directionToY = Direction.DOWN;
        }

        if (directionToX != null) {
            switch (robot.getDirection()) {
                case UP:
                    if (directionToX.equals(Direction.RIGHT)) {
                        robot.turnRight();
                    } else {
                        robot.turnLeft();
                    }
                    break;
                case DOWN:
                    if (directionToX.equals(Direction.RIGHT)) {
                        robot.turnLeft();
                    } else {
                        robot.turnRight();
                    }
                    break;
                case RIGHT:
                    if (directionToX.equals(Direction.LEFT)) {
                        robot.turnLeft();
                        robot.turnLeft();
                    }
                    break;
                case LEFT:
                    if (directionToX.equals(Direction.RIGHT)) {
                        robot.turnRight();
                        robot.turnRight();
                    }
                    break;
                default:
                    break;
            }
            for (int i = 0; i < Math.abs(stepToX); i++) {
                robot.stepForward();
            }
        }
        if (directionToY != null) {
            switch (robot.getDirection()) {
                case UP:
                    if (directionToY.equals(Direction.DOWN)) {
                        robot.turnRight();
                        robot.turnRight();
                    }
                    break;
                case DOWN:
                    if (directionToY.equals(Direction.UP)) {
                        robot.turnRight();
                        robot.turnRight();
                    }
                    break;
                case RIGHT:
                    if (directionToY.equals(Direction.UP)) {
                        robot.turnLeft();
                    } else {
                        robot.turnRight();
                    }
                    break;
                case LEFT:
                    if (directionToY.equals(Direction.UP)) {
                        robot.turnRight();
                    } else {
                        robot.turnLeft();
                    }
                    break;
                default:
                    break;
            }
            for (int i = 0; i < Math.abs(stepToY); i++) {
                robot.stepForward();
            }
        }
    }
}
