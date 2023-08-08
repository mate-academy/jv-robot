package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        RobotRoute route = new RobotRoute();
        route.checkDirectionX(robot, toX);
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        route.checkDirectionY(robot, toY);
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private Robot checkDirectionX(Robot robot, int toX) {
        Direction direction = robot.getX() < toX ? Direction.values()[3] : Direction.values()[2];
        while (robot.getDirection() != direction) {
            robot.turnRight();
        }
        return robot;
    }

    private Robot checkDirectionY(Robot robot, int toY) {
        Direction direction = robot.getY() < toY ? Direction.values()[0] : Direction.values()[1];
        while (robot.getDirection() != direction) {
            robot.turnRight();
        }
        return robot;
    }
}
