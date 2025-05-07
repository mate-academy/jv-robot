package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX > robot.getX()) {
            changRobotDirection(robot, Direction.RIGHT);
        } else if (toX < robot.getX()) {
            changRobotDirection(robot, Direction.RIGHT);
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        if (toY > robot.getY()) {
            changRobotDirection(robot, Direction.UP);
        } else if (toY < robot.getY()) {
            changRobotDirection(robot, Direction.DOWN);
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    public void changRobotDirection(Robot robot, Direction targerDirection) {
        switch (robot.getDirection()) {
            case UP:
                changeUpDirection(robot, targerDirection);
                break;
            case DOWN:
                changeDownDirection(robot, targerDirection);
                break;
            case RIGHT:
                changeRightDirection(robot, targerDirection);
                break;
            case LEFT:
                changeLeftDirection(robot, targerDirection);
                break;
            default:
                break;
        }
    }

    public void changeUpDirection(Robot robot, Direction targerDirection) {
        switch (targerDirection) {
            case RIGHT:
                robot.turnRight();
                break;
            case LEFT:
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

    public void changeDownDirection(Robot robot, Direction targerDirection) {
        switch (targerDirection) {
            case RIGHT:
                robot.turnLeft();
                break;
            case LEFT:
                robot.turnRight();
                break;
            case UP:
                robot.turnRight();
                robot.turnRight();
                break;
            default:
                break;
        }
    }

    public void changeRightDirection(Robot robot, Direction targerDirection) {
        switch (targerDirection) {
            case UP:
                robot.turnLeft();
                break;
            case DOWN:
                robot.turnRight();
                break;
            case LEFT:
                robot.turnRight();
                robot.turnRight();
                break;
            default:
                break;
        }
    }

    public void changeLeftDirection(Robot robot, Direction targerDirection) {
        switch (targerDirection) {
            case UP:
                robot.turnRight();
                break;
            case DOWN:
                robot.turnLeft();
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
