package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.RIGHT, 4, 3);
        RobotRoute robotRoute = new RobotRoute();
        robotRoute.moveRobot(robot, 9, 10);

        System.out.println(robot.getX());
        System.out.println(robot.getY());
    }
}
