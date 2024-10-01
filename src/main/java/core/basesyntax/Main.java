package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int startX = 1;
        int startY = 1;
        Robot robot = new Robot(Direction.DOWN, startX, startY);

        int expectedX = 5;
        int expectedY = -5;
        RobotRoute robotRoute = new RobotRoute();

        System.out.println("Method is runing...");
        robotRoute.moveRobot(robot, expectedX, expectedY);

        System.out.println("current x before move: " + robot.getX());
        System.out.println("current y before move: " + robot.getY());
    }
}
