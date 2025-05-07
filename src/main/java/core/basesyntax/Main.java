package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Robot testRobot = new Robot(Direction.UP,5,3);
        RobotRoute robotRoute = new RobotRoute();
        robotRoute.moveRobot(testRobot,4,5);
    }
}
