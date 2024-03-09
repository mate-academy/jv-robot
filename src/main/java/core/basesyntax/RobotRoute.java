package core.basesyntax;

public class RobotRoute {
    public static void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here
        while (robot.getX() != toX || robot.getY() != toY) {
            if (robot.getX() != toX && robot.getY() == toY) {
                if (robot.getX() < toX)  {
                    switch (robot.getDirection()) {
                        case UP:
                            robot.turnRight();
                            break;
                        case DOWN:
                            robot.turnLeft();
                            break;
                        case LEFT:
                            robot.turnRight();
                            break;
                        case RIGHT:
                            robot.stepForward();
                            break;
                    }
                } else {
                    switch (robot.getDirection()) {
                        case UP:
                            robot.turnLeft();
                            break;
                        case DOWN:
                            robot.turnRight();
                            break;
                        case LEFT:
                            robot.stepForward();
                            break;
                        case RIGHT:
                            robot.turnRight();
                            break;
                    }
                }
            } else if (robot.getX() == toX && robot.getY() != toY) {
                if (robot.getY() < toY)  {
                    switch (robot.getDirection()) {
                        case UP:
                            robot.stepForward();
                            break;
                        case DOWN:
                            robot.turnLeft();
                            break;
                        case LEFT:
                            robot.turnRight();
                            break;
                        case RIGHT:
                            robot.turnLeft();
                            break;
                    }
                } else {
                    switch (robot.getDirection()) {
                        case UP:
                            robot.turnLeft();
                            break;
                        case DOWN:
                            robot.stepForward();
                            break;
                        case LEFT:
                            robot.turnLeft();
                            break;
                        case RIGHT:
                            robot.turnRight();
                            break;
                    }
                }
            } else {
                if (robot.getX() < toX && robot.getY() < toY)  {
                    switch (robot.getDirection()) {
                        case UP:
                            robot.stepForward();
                            break;
                        case DOWN:
                            robot.turnLeft();
                            break;
                        case LEFT:
                            robot.turnRight();
                            break;
                        case RIGHT:
                            robot.stepForward();
                            break;
                    }
                } else if (robot.getX() > toX && robot.getY() > toY) {
                    switch (robot.getDirection()) {
                        case UP:
                            robot.turnLeft();
                            break;
                        case DOWN:
                            robot.stepForward();
                            break;
                        case LEFT:
                            robot.stepForward();
                            break;
                        case RIGHT:
                            robot.turnRight();
                            break;
                    }
                } else if (robot.getX() > toX && robot.getY() < toY) {
                    switch (robot.getDirection()) {
                        case UP:
                            robot.turnLeft();
                            break;
                        case DOWN:
                            robot.stepForward();
                            break;
                        case LEFT:
                            robot.stepForward();
                            break;
                        case RIGHT:
                            robot.turnRight();
                            break;
                    }
                } else {
                    switch (robot.getDirection()) {
                        case UP:
                            robot.turnLeft();
                            break;
                        case DOWN:
                            robot.stepForward();
                            break;
                        case LEFT:
                            robot.stepForward();
                            break;
                        case RIGHT:
                            robot.turnRight();
                            break;
                    }
                }
            }
        }
    }
}
