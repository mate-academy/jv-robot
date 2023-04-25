package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Robot TestRobot = new Robot(Direction.UP, 2, 3);
        RobotRoute RobotRoute = new RobotRoute();
        RobotRoute.moveRobot(TestRobot, -2, -4);
    }
}
