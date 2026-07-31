package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.LEFT, 12, 5);
        RobotRoute robotRoute = new RobotRoute();
        robotRoute.moveRobot(robot, 25, -16);
    }
}
