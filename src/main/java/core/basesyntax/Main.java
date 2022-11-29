package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Robot steven = new Robot(Direction.UP, 5, -9);
        RobotRoute toGoal = new RobotRoute();
        toGoal.moveRobot(steven, -2, 3);
        System.out.println(steven);
    }
}
