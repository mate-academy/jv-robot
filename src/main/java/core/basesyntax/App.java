package core.basesyntax;

public class App {
    public static void main(String[] args) {
        final int startX = -5;
        final int startY = 4;
        final int expectedX = -3;
        final int expectedY = 12;
        Robot robot = new Robot(Direction.UP, startX, startY);
        RobotRoute route = new RobotRoute();
        route.moveRobot(robot, expectedX, expectedY);
        System.out.println("X: " + robot.getX() + ", Y: " + robot.getY() + " Dir: " + robot.getDirection());
    }
}
