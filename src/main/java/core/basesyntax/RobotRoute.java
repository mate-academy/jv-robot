package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX < robot.getX()) {
            robot.goLeft(toX);
        } else if (toX > robot.getX()) {
            robot.goRight(toX);
        }
        if (toY < robot.getY()) {
            robot.goDown(toY);
        } else if (toY > robot.getY()) {
            robot.goUp(toY);
        }
    }
}
