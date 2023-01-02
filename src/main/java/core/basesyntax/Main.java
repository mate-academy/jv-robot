package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.RIGHT, 3, 3);
        RobotRoute route = new RobotRoute();
        route.moveRobot(robot, -4, -3);
    }
}
