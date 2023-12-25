package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here
        if (toX > 0 && toY > 0) {
            goToFirstQuadrant(robot, toX, toY);
        }
        if (toX > 0 && toY < 0) {
            goToSecondQuadrant(robot, toX, toY);
        }
        if (toX < 0 && toY < 0) {
            goToThirdQuadrant(robot, toX, toY);
        }
        if (toX < 0 && toY > 0) {
            goToFourthQuadrant(robot, toX, toY);
        }
        else new Robot(robot.getDirection(), toX, toY);
    }

    private void goFromByX(Robot robot, int toX) {
        int startX = robot.getX();
        if (startX < toX) {
            for (int i = startX; i < toX; i++ ) {
                robot.stepForward();
            }
        }
        if (startX > toX) {
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
        }
        if (startY > toY) {
            for (int i = startY; i > toY; i-- ) {
                robot.stepForward();
            }
        }
    }

    private void goToFirstQuadrant(Robot robot, int toX, int toY) {
        int startY = robot.getY();
        turnRight(robot);
        goFromByX(robot, toX);
        //тернарный оператор
        if (startY <= toY) {
            robot.turnLeft();
        }
        if (startY > toY) {
            robot.turnRight();
        }
        goFromByY(robot, toY);
    }

    private void goToSecondQuadrant(Robot robot, int toX, int toY) {
        int startY = robot.getY();
        turnRight(robot);
        goFromByX(robot, toX);
        if (startY <= toY) {
            robot.turnLeft();
        }
        if (startY > toY) {
            robot.turnRight();
        }
        goFromByY(robot, toY);
    }

    private void goToThirdQuadrant(Robot robot, int toX, int toY) {
        int startY = robot.getY();
        turnLeft(robot);
        goFromByX(robot, toX);
        if (startY <= toY) {
            robot.turnRight();
        }
        if (startY > toY) {
            robot.turnLeft();
        }
        goFromByY(robot, toY);
    }

    private void goToFourthQuadrant(Robot robot, int toX, int toY) {
        int startY = robot.getY();
        turnLeft(robot);
        goFromByX(robot, toX);
        if (startY <= toY) {
            robot.turnRight();
        }
        if (startY > toY) {
            robot.turnLeft();
        }
        goFromByY(robot, toY);
    }

    //использовать свитч кейс
    private void turnLeft(Robot robot) {
        if (robot.getDirection() == Direction.UP) {
            robot.turnLeft();
        }
        if (robot.getDirection() == Direction.RIGHT) {
            for (int i = 0; i < 2; i++) {
                robot.turnLeft();
            }
        }
        if (robot.getDirection() == Direction.DOWN) {
            for (int i = 0; i < 3; i++) {
                robot.turnLeft();
            }
        }
    }

    private void turnRight(Robot robot) {
        if (robot.getDirection() == Direction.UP) {
            robot.turnRight();
        }
        if (robot.getDirection() == Direction.LEFT) {
            for (int i = 0; i < 2; i++) {
                robot.turnRight();
            }
        }
        if (robot.getDirection() == Direction.DOWN) {
            for (int i = 0; i < 3; i++) {
                robot.turnRight();
            }
        }
    }
}
