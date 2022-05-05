package core.basesyntax;

public class main {
    public static void main(String[] args) {
        Robot bob = new Robot(Direction.UP, 0, 0);
        RobotRoute.moveRobot(bob, -5, 2);
        System.out.println(bob.getDirection() + " (" + bob.getX() + ", " + bob.getY() + ")");
    }
}
