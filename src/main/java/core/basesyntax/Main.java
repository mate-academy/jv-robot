package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Direction[] d = Direction.values();
        java.util.Random r = new java.util.Random();

        Robot robot = new Robot(
                d[r.nextInt(d.length)],
                r.nextInt(100),
                r.nextInt(100)
        );
        System.out.println(robot.getX());
        System.out.println(robot.getY());
        System.out.println(robot.getDirection());

        RobotRoute rr = new RobotRoute();
        rr.moveRobot(robot, 10, -21);

        System.out.println(robot.getX());
        System.out.println(robot.getY());
        System.out.println(robot.getDirection());
    }
}
