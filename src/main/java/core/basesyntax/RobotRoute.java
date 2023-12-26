package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here
        int startY = robot.getY();
        if (toX > 0) {
            turnRight(robot);
            goFromByX(robot, toX);
            if (startY <= toY) {
                robot.turnLeft();
            } else {
                robot.turnRight();
            }
            goFromByY(robot, toY);
        } else if (toX < 0) {
            turnLeft(robot);
            goFromByX(robot, toX);
            if (startY <= toY) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
            goFromByY(robot, toY);
        } else new Robot(robot.getDirection(), toX, toY);
    }

    private void goFromByX(Robot robot, int toX) {
        int startX = robot.getX();
        if (startX < toX) {
            for (int i = startX; i < toX; i++ ) {
                robot.stepForward();
            }
        } else if (startX > toX) {
            for (int i = startX; i > toX; i-- ) {
                robot.stepForward();
            }
        }
    }

    private void goFromByY(Robot robot, int toY) {
        int startY = robot.getY();
        if (startY < toY) {
            for (int i = startY; i < toY; i++ ) {
                robot.stepForward();
            }
        } else if (startY > toY) {
            for (int i = startY; i > toY; i-- ) {
                robot.stepForward();
            }
        }
    }

    private void turnLeft(Robot robot) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnLeft();
                break;
            case RIGHT:
                for (int i = 0; i < 2; i++) {
                    robot.turnLeft();
                }
                break;
            case DOWN:
                for (int i = 0; i < 3; i++) {
                    robot.turnLeft();
                }
                break;
        }
    }

    private void turnRight(Robot robot) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnRight();
                break;
            case LEFT:
                for (int i = 0; i < 2; i++) {
                    robot.turnRight();
                }
                break;
            case DOWN:
                for (int i = 0; i < 3; i++) {
                    robot.turnRight();
                }
                break;
        }
    }
}
