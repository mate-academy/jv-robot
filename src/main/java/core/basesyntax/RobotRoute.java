package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        while (robot.getX() != toX || robot.getY() != toY) {
            switch (robot.getDirection()) {
                case UP:
                    while (robot.getY() < toY) {
                        robot.stepForward();
                    }
                    break;
                case LEFT:
                    while (robot.getX() > toX) {
                        robot.stepForward();
                    }
                    break;
                case DOWN:
                    while (robot.getY() > toY) {
                        robot.stepForward();
                    }
                    break;
                case RIGHT:
                    while (robot.getX() < toX) {
                        robot.stepForward();
                    }
                    break;
                default:
                    break;
            }
            robot.turnLeft();
        }
    }
}
