package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.DOWN, 5, -7);
        RobotRoute robotRoute = new RobotRoute();
        robotRoute.moveRobot(robot, -3, -5);
    }
}
