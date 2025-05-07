package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() != toX) {
            if (toX < robot.getX()) {
                robot.changeDirectionToLeft();
            } else if (toX > robot.getX()) {
                robot.changeDirectionToRight();
            }
            do {
                robot.stepForward();
            } while (robot.getX() != toX);
        }
        if (robot.getY() != toY) {
            if (toY < robot.getY()) {
                robot.changeDirectionToDown();
            } else if (toY > robot.getY()) {
                robot.changeDirectionToUp();
            }
            do {
                robot.stepForward();
            } while (robot.getY() != toY);
        }
    }
}
