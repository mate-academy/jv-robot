package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        putOnRightDirectionX(robot, toX, robot.getDirection());
        moveX(robot, toX);
        putOnRightDirectionY(robot, toY, robot.getDirection());
        moveY(robot, toY);
    }

    public void putOnRightDirectionX(Robot robot, int toX, Direction direction) {
        if (toX > robot.getX()) {
            switch (direction) {
                case UP:
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                default:
                    break;
            }
        }
        if (toX < robot.getX()) {
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
        }
    }

    public void moveX(Robot robot, int toX) {
        if (toX > robot.getX()) {
            for (int i = robot.getX();i < toX;i++) {
                robot.stepForward();
            }
        }
        if (toX < robot.getX()) {
            for (int i = robot.getX();i > toX;i--) {
                robot.stepForward();
            }
        }
    }

    public void putOnRightDirectionY(Robot robot, int toY, Direction direction) {
        if (toY > robot.getY()) {
            switch (direction) {
                default:
                    break;
                case DOWN:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case LEFT:
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    break;
            }
        }
        if (toY < robot.getY()) {
            switch (direction) {
                case UP:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                default:
                    break;
                case RIGHT:
                    robot.turnRight();
                    break;
                case LEFT:
                    robot.turnLeft();
                    break;
            }
        }
    }

    public void moveY(Robot robot, int toY) {
        if (toY > robot.getY()) {
            for (int i = robot.getY();i < toY;i++) {
                robot.stepForward();
            }
        }
        if (toY < robot.getY()) {
            for (int i = robot.getY();i > toY;i--) {
                robot.stepForward();
            }
        }
    }
}

