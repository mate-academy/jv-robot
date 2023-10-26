package core.basesyntax;

public class Check {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.DOWN, 0, 0);
        RobotRoute robotRoute = new RobotRoute();
        robotRoute.moveRobot(robot, 2, 3);
        System.out.println(robot.getX());
        System.out.println(robot.getY());

    }
}
