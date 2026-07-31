package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Robot robby = new Robot(Direction.DOWN, 2, 3);
        RobotRoute robotRoute = new RobotRoute();
        robotRoute.moveRobot(robby, 2, 3);
    }
}
