package fch;

import fch.models.Robot;
import fch.models.RobotRoute;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();

        System.out.println(robot.getDirection());
        System.out.println(robot.getX());
        System.out.println(robot.getY());

        RobotRoute newRoute = new RobotRoute();

        newRoute.moveRobot(robot, 0, 0);

        System.out.println(robot.getDirection());
        System.out.println(robot.getX());
        System.out.println(robot.getY());
    }
}
