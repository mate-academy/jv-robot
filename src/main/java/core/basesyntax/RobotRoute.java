package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int fromX = robot.getX();
        Direction need = (fromX > toX ? Direction.LEFT : Direction.RIGHT);
        robotRouteX(need, robot);
        for (int i = 0; i < Math.abs(toX - fromX); i++) {
            robot.stepForward();
        }

        int fromY = robot.getY();
        need = (fromY > toY ? Direction.DOWN : Direction.UP);
        robotRouteY(need, robot);
        for (int i = 0; i < Math.abs(toY - fromY); i++) {
            robot.stepForward();
        }
    }

    public void robotRouteX(Direction need, Robot robot) {
        if (need != robot.getDirection()) {
            switch (robot.getDirection()) {
                case UP:
                    if (need == Direction.LEFT) {
                        robot.turnLeft();
                    } else {
                        robot.turnRight();
                    }
                    break;
                case DOWN:
                    if (need == Direction.LEFT) {
                        robot.turnRight();
                    } else {
                        robot.turnLeft();
                    }
                    break;
                default:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
            }
        }
    }

    public void robotRouteY(Direction need, Robot robot) {
        switch (robot.getDirection()) {
            case RIGHT:
                if (need == Direction.UP) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
                break;
            case LEFT:
                if (need == Direction.UP) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
                break;
            default:
                break;
        }
    }

}
