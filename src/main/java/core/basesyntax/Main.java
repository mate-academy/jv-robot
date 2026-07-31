package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        Robot robot = new Robot(Direction.RIGHT,5,-5);
        RobotRoute robotRoute = new RobotRoute();
        robotRoute.moveRobot(robot,-6,4);
    }
}
