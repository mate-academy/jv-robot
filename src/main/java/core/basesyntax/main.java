package core.basesyntax;

public class main {
    public static void main(String[] args) {


        Robot robot = new Robot(Direction.UP, 1,1);
        RobotRoute robotRoute =new RobotRoute();
        robotRoute.moveRobot(robot,7,-3);

    }
}
