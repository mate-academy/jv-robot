package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Robot first = new Robot(Direction.DOWN, 3, 8);

        RobotRoute robotRoute = new RobotRoute();
        int targetX = 5;
        int targetY = 3;

        robotRoute.moveRobot(first, targetX, targetY);

        System.out.println("Robot's final position: (" + first.getX() + ", " + first.getY() + ")");
    }
}
