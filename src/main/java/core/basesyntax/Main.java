package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int actualX = 2;
        int actualY = 2;

        int expectedX = 1;
        int expectedY = 4;

        Robot robot = new Robot(Direction.UP, actualX, actualY);
        new RobotRoute().moveRobot(robot, expectedX, expectedY );

        System.out.println("Final X " +robot.getX());
        System.out.println("Final Y " +robot.getY());
    }
}
