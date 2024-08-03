package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            if (robot.getX() > toX) {
                faceLeft(robot);
            } else {
                faceRight(robot);
            }
            robot.stepForward();
        }

        while (robot.getY() != toY) {
            if (robot.getY() > toY) {
                faceDown(robot);
            } else {
                faceUp(robot);
            }
            robot.stepForward();
        }
    }

    private void faceUp(Robot robot) {
        faceLeft(robot);
        robot.turnRight();
    }

    private void faceDown(Robot robot) {
        faceLeft(robot);
        robot.turnLeft();
    }

    private void faceRight(Robot robot) {
        faceLeft(robot);
        robot.turnLeft();
        robot.turnLeft();
    }

    private void faceLeft(Robot robot) {
        switch (robot.getDirection()) {
            case UP -> robot.turnLeft();
            case RIGHT -> {
                robot.turnLeft();
                robot.turnLeft();
            }
            case DOWN -> robot.turnRight();
            default -> {

            }
        }
    }
}
