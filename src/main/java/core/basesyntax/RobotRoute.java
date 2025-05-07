package core.basesyntax;

public class RobotRoute {
    public static void main(String[] args) {
        RobotRoute route = new RobotRoute();
        Robot robot = new Robot(Direction.RIGHT,0,0);
        route.moveRobot(robot,4,4);
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        Direction desiredXDirection = robot.getX() > toX ? Direction.LEFT : Direction.RIGHT;
        Direction desiredYDirection = robot.getY() > toY ? Direction.DOWN : Direction.UP;
        while (!desiredXDirection.equals(robot.getDirection())) {
            robot.turnLeft();
        }
        while (!(toX == robot.getX())) {
            robot.stepForward();
        }
        while (!desiredYDirection.equals(robot.getDirection())) {
            robot.turnRight();
        }
        while (!(toY == robot.getY())) {
            robot.stepForward();
        }
    }
}
