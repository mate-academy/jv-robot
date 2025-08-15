package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX > robot.getX()) {
            turnRobotRight(robot);
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        } else if (toX < robot.getX()) {
            turnRobotLeft(robot);
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (toY > robot.getY()) {
            turnRobotUp(robot);
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        } else if (toY < robot.getY()) {
            turnRobotDown(robot);
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }

    private void turnRobotRight(Robot robot) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnRight();
                break;
            case LEFT:
                robot.turnRight();
                robot.turnRight();
                break;
            case DOWN:
                robot.turnLeft();
                break;
            default:
                break;
        }
    }

    private void turnRobotLeft(Robot robot) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnLeft();
                break;
            case RIGHT:
                robot.turnRight();
                robot.turnRight();
                break;
            case DOWN:
                robot.turnRight();
                break;
            default:
                break;
        }
    }

    private void turnRobotUp(Robot robot) {
        switch (robot.getDirection()) {
            case LEFT:
                robot.turnRight();
                break;
            case RIGHT:
                robot.turnLeft();
                break;
            case DOWN:
                robot.turnLeft();
                robot.turnLeft();
                break;
            default:
                break;
        }
    }

    private void turnRobotDown(Robot robot) {
        switch (robot.getDirection()) {
            case LEFT:
                robot.turnLeft();
                break;
            case RIGHT:
                robot.turnRight();
                break;
            case UP:
                robot.turnLeft();
                robot.turnLeft();
                break;
            default:
                break;
        }
    }
}
