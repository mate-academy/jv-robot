package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        if (!(robot.getX() == toX & robot.getY() == toY)) {
            int startX = robot.getX();
            int startY = robot.getY();
            if (startX <= toX & startY <= toY) {
                switch (robot.getDirection()) {
                    case LEFT:
                        robot.turnRight();
                        while (robot.getY() != toY) {
                            robot.stepForward();
                        }
                        robot.turnRight();
                        while (robot.getX() != toX) {
                            robot.stepForward();
                        }
                        break;
                    case RIGHT:
                        while (robot.getX() != toX) {
                            robot.stepForward();
                        }
                        robot.turnLeft();
                        while (robot.getY() != toY) {
                            robot.stepForward();
                        }
                        break;
                    case UP:
                        while (robot.getY() != toY) {
                            robot.stepForward();
                        }
                        robot.turnRight();
                        while (robot.getX() != toX) {
                            robot.stepForward();
                        }
                        break;
                    case DOWN:
                        robot.turnLeft();
                        while (robot.getX() != toX) {
                            robot.stepForward();
                        }
                        robot.turnLeft();
                        while (robot.getY() != toY) {
                            robot.stepForward();
                        }
                        break;
                }
            }
            if (startX >= toX & startY >= toY) {
                switch (robot.getDirection()) {
                    case LEFT:
                        while (robot.getX() != toX) {
                            robot.stepForward();
                        }
                        robot.turnLeft();
                        while (robot.getY() != toY) {
                            robot.stepForward();
                        }
                        break;
                    case RIGHT:
                        robot.turnRight();
                        while (robot.getY() != toY) {
                            robot.stepForward();
                        }
                        robot.turnRight();
                        while (robot.getX() != toX) {
                            robot.stepForward();
                        }
                        break;
                    case UP:
                        robot.turnLeft();
                        while (robot.getX() != toX) {
                            robot.stepForward();
                        }
                        robot.turnLeft();
                        while (robot.getY() != toY) {
                            robot.stepForward();
                        }
                        break;
                    case DOWN:
                        while (robot.getY() != toY) {
                            robot.stepForward();
                        }
                        robot.turnLeft();
                        while (robot.getX() != toX) {
                            robot.stepForward();
                        }
                        break;
                }
            }
            if (startX >= toX & startY <= toY) {
                switch (robot.getDirection()) {
                    case LEFT:
                        while (robot.getX() != toX) {
                            robot.stepForward();
                        }
                        robot.turnRight();
                        while (robot.getY() != toY) {
                            robot.stepForward();
                        }
                        break;
                    case RIGHT:
                        robot.turnLeft();
                        while (robot.getY() != toY) {
                            robot.stepForward();
                        }
                        robot.turnLeft();
                        while (robot.getX() != toX) {
                            robot.stepForward();
                        }
                        break;
                    case UP:
                        while (robot.getY() != toY) {
                            robot.stepForward();
                        }
                        robot.turnLeft();
                        while (robot.getX() != toX) {
                            robot.stepForward();
                        }
                        break;
                    case DOWN:
                        robot.turnLeft();
                        while (robot.getX() != toX) {
                            robot.stepForward();
                        }
                        robot.turnRight();
                        while (robot.getY() != toY) {
                            robot.stepForward();
                        }
                        break;
                }
            }
            if (startX <= toX & startY >= toY) {
                switch (robot.getDirection()) {
                    case LEFT:
                        robot.turnLeft();
                        while (robot.getY() != toY) {
                            robot.stepForward();
                        }
                        robot.turnLeft();
                        while (robot.getX() != toX) {
                            robot.stepForward();
                        }
                        break;
                    case RIGHT:
                        while (robot.getX() != toX) {
                            robot.stepForward();
                        }
                        robot.turnRight();
                        while (robot.getY() != toY) {
                            robot.stepForward();
                        }
                        break;
                    case UP:
                        robot.turnRight();
                        while (robot.getX() != toX) {
                            robot.stepForward();
                        }
                        robot.turnRight();
                        while (robot.getY() != toY) {
                            robot.stepForward();
                        }
                        break;
                    case DOWN:
                        while (robot.getY() != toY) {
                            robot.stepForward();
                        }
                        robot.turnLeft();
                        while (robot.getX() != toX) {
                            robot.stepForward();
                        }
                        break;
                }
            }
        }
    }
}
