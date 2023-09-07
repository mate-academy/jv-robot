package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Robot igor = new Robot(Direction.UP, 5, 5);

        RobotRoute nextRout = new RobotRoute();
        nextRout.moveRobot(igor, 6,8);
    }
}
