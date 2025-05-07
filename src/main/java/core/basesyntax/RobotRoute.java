package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        do {
            switch (robot.getDirection()) {
                case UP:
                    if (robot.getX() < toX) {
                        robot.turnRight();
                    }
                    if (robot.getX() > toX) {
                        robot.turnLeft();
                    }
                    break;
                case LEFT:
                    if (robot.getY() < toY) {
                        robot.turnRight();
                    }
                    if (robot.getY() > toY) {
                        robot.turnLeft();
                    }
                    break;
                case DOWN:
                    if (robot.getX() < toX) {
                        robot.turnLeft();
                    }
                    if (robot.getX() > toX) {
                        robot.turnRight();
                    }
                    break;
                case RIGHT:
                    if (robot.getY() < toY) {
                        robot.turnLeft();
                    }
                    if (robot.getY() > toY) {
                        robot.turnRight();
                    }
                    break;
                default:
                    break;
            }
            robot.stepForward();
        } while (robot.getX() != toX || robot.getY() != toY);
    }
}
