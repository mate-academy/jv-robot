package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            turnToDirection("right", robot);
            getToX(toX, robot);
        } else if (robot.getX() > toX) {
            turnToDirection("left", robot);
            getToX(toX, robot);
        }

        if (robot.getY() < toY) {
            turnToDirection("up", robot);
            getToY(toY, robot);
        } else if (robot.getY() > toY) {
            turnToDirection("down", robot);
            getToY(toY, robot);
        }
    }

    private void turnToDirection(String str, Robot robot) {
        switch (Direction.valueOf(str.toUpperCase())) {
            case LEFT:
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
                break;
            case RIGHT:
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnLeft();
                }
                break;
            case DOWN:
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();
                }
                break;
            case UP:
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
                break;
            default:
                break;
        }
    }

    private void getToX(int x, Robot robot) {
        while (robot.getX() != x) {
            robot.stepForward();
        }
    }

    private void getToY(int y, Robot robot) {
        while (robot.getY() != y) {
            robot.stepForward();
        }
    }
}
