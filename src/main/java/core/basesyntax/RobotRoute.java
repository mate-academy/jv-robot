package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        switch (robot.getDirection()) {
            case RIGHT:
                if (robot.getY() > toY) { //  First example
                    robot.turnRight();
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    if (robot.getX() > toX) {
                        robot.turnRight();
                    }
                    if (robot.getX() < toX) {
                        robot.turnLeft();
                    }
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                }
                if (robot.getY() < toY) { //  Second example
                    robot.turnLeft();
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    if (robot.getX() > toX) {
                        robot.turnRight();
                    }
                    if (robot.getX() < toX) {
                        robot.turnLeft();
                    }
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                }
                if (robot.getY() == toY) { //  Third example
                    if (robot.getX() > toX) {
                        robot.turnRight();
                        robot.turnRight();
                    }
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                }
                break;
            case LEFT:
                if (robot.getY() > toY) {
                    robot.turnLeft();
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    if (robot.getX() > toX) {
                        robot.turnLeft();
                    }
                    if (robot.getX() < toX) {
                        robot.turnRight();
                    }
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                }
                if (robot.getY() < toY) {
                    robot.turnRight();
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    if (robot.getX() > toX) {
                        robot.turnLeft();
                    }
                    if (robot.getX() < toX) {
                        robot.turnRight();
                    }
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                }
                if (robot.getY() == toY) {
                    if (robot.getX() < toX) {
                        robot.turnRight();
                        robot.turnRight();
                    }
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                }
                break;
            case UP:
                if (robot.getY() > toY) {
                    robot.turnLeft();
                    robot.turnLeft();
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    if (robot.getX() > toX) {
                        robot.turnRight();
                    }
                    if (robot.getX() < toX) {
                        robot.turnLeft();
                    }
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                }
                if (robot.getY() < toY) {
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    if (robot.getX() > toX) {
                        robot.turnLeft();
                    }
                    if (robot.getX() < toX) {
                        robot.turnRight();
                    }
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                }
                if (robot.getY() == toY) {
                    if (robot.getX() > toX) {
                        robot.turnLeft();
                    }
                    if (robot.getX() < toX) {
                        robot.turnRight();
                    }
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                }
                break;
            case DOWN:
                if (robot.getY() > toY) {
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    if (robot.getX() > toX) {
                        robot.turnRight();
                    }
                    if (robot.getX() < toX) {
                        robot.turnLeft();
                    }
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                }
                if (robot.getY() < toY) {
                    robot.turnRight();
                    robot.turnRight();
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    if (robot.getX() > toX) {
                        robot.turnLeft();
                    }
                    if (robot.getX() < toX) {
                        robot.turnRight();
                    }
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                }
                if (robot.getY() == toY) {
                    if (robot.getX() > toX) {
                        robot.turnRight();
                    }
                    if (robot.getX() < toX) {
                        robot.turnLeft();
                    }
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                }
                break;
            default:
                System.out.println("You in home");
        }

    }
}
