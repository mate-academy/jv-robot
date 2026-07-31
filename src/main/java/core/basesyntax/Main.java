package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.DOWN, 10, 8);
        RobotRoute robotRoute = new RobotRoute();
        robotRoute.moveRobot(robot, -2, 4);
    }
}
