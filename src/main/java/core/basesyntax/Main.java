package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        RobotRoute robotRoute = new RobotRoute();
        Robot robot = new Robot(Direction.UP, 1, 1);
        robotRoute.moveRobot(robot, 3,5);
    }
}
