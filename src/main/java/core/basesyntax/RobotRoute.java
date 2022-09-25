package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() != toX && robot.getX() > toX) {
            Direction direction = Direction.LEFT;
            robot.setDirection(direction);
        }
        if (robot.getX() != toX && robot.getX() < toX) {
            Direction direction = Direction.RIGHT;
            robot.setDirection(direction);
        }
        int betweenX = Math.abs(robot.getX() - toX);
        for (int i = 0; i < betweenX; i++) {
                robot.stepForward();
            }
        if (robot.getY() != toY && robot.getY() < toY) {
                Direction direction = Direction.UP;
                robot.setDirection(direction);
            }
        if (robot.getY() != toY && robot.getY() > toY) {
                Direction direction = Direction.DOWN;
                robot.setDirection(direction);
            }
            int betweenY = Math.abs(robot.getY() - toY);
            for (int i = 0; i < betweenY; i++) {
                robot.stepForward();
            }
        }
    }
