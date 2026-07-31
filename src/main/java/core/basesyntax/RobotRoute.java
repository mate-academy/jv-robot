package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int distanceX = toX - robot.getX();
        int distanceY = toY - robot.getY();

        if (distanceX > 0) {
            robot.stepTo(Direction.RIGHT, distanceX);
        } else {
            robot.stepTo(Direction.LEFT, distanceX);
        }

        if (distanceY > 0) {
            robot.stepTo(Direction.UP,distanceY);
        } else {
            robot.stepTo(Direction.DOWN, distanceY);
        }

    }
}
