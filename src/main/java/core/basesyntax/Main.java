package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.UP, 0, 0);
        RobotRoute robotRoute = new RobotRoute();
        robotRoute.moveRobot(robot, 0, 0);

    }
}
