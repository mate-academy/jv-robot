package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        int stepY = toY - robot.getY();
        Direction direction = robot.getDirection();

        if (stepY > 0) {
            switch (direction) {
                case RIGHT:
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case LEFT:
                    robot.turnRight();
                    break;
                default:
                    break;
            }
        }

        if (stepY < 0) {
            switch (direction) {
                case RIGHT:
                    robot.turnRight();
                    break;
                case UP:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnLeft();
                    break;
                default:
                    break;
            }
        }

        while (toY != robot.getY()) {
            robot.stepForward();
        }

        direction = robot.getDirection();
        int stepX = toX - robot.getX();

        if (stepX > 0) {
            switch (direction) {
                case UP:
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnLeft();
                    break;
                default:
                    break;
            }
        }

        if (stepX < 0) {
            switch (direction) {
                case UP:
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnRight();
                    break;
                default:
                    break;
            }
        }

        while (toX != robot.getX()) {
            robot.stepForward();
        }
    }
}
