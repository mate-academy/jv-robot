package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        RobotRoute robotRoute = new RobotRoute();
        Robot myRobot = new Robot(Direction.UP, 5, 7);
        robotRoute.moveRobot(myRobot, -2,-2);
    }
}
