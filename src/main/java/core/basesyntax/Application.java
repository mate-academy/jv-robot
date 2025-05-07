package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int startX = 4;
        int startY = 3;
        Direction startDirection = Direction.RIGHT;
        int toX = -2;
        int toY = -2;
        Robot robot = new Robot(startDirection,startX,startY);
        System.out.println(robot);
        RobotRoute robotRoute = new RobotRoute();
        robotRoute.moveRobot(robot,toX,toY);
        System.out.println(robot);
    }
}
