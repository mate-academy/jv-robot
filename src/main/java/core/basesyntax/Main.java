package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.UP, 20, -35);
        RobotRoute robotRoute = new RobotRoute();
        robotRoute.moveRobot(robot, 20, 20);
        System.out.println(robot.getX());
        System.out.println(robot.getY());
    }
}
