package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if(robot.getX() != toX) {
            Direction way = (robot.getX() < toX) ? Direction.RIGHT : Direction.LEFT;
            writeWay(robot, way);
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }
        if(robot.getY() != toY) {
            Direction way = (robot.getY() < toY) ? Direction.UP : Direction.DOWN;
            writeWay(robot, way);
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }

    private void writeWay(Robot robot, Direction way) {
        if(robot.getDirection() != way) {
            robot.turnRight();
            writeWay(robot, way);
        }

    }
}
