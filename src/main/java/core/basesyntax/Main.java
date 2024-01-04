package org.example;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.LEFT, 45, 40);
        RobotRoute robotRoute = new RobotRoute();
        int targetX = 23;
        int targetY = 50;
        robotRoute.moveRobot(robot, targetX, targetY);
        System.out.println("Робот досяг цільової позиції: (" + robot.getX() + ", "
                + robot.getY() + ")");
    }
}
