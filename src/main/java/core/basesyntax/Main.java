package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.UP, 3,5);
        RobotRoute robotRoute = new RobotRoute();
        robotRoute.moveRobot(robot, 1,2);
    }
}
