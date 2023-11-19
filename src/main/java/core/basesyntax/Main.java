package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        RobotRoute robotRoute = new RobotRoute();
        Robot robot = new Robot(Direction.valueOf("UP"),12,-4);

        robotRoute.moveRobot(robot,12,16);

    }
}
