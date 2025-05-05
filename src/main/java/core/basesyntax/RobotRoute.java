package core.basesyntax;

import java.util.Random;

public class RobotRoute {
    private static final int COORDINATE_SIZE = 100;
    private final Random random = new Random();

    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        Direction courseX = toX > robot.getX() ? Direction.LEFT : Direction.RIGHT;
        while (robot.getDirection() != courseX) {
            robot.turnRight();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        Direction courseY = toY > robot.getY() ? Direction.UP : Direction.DOWN;
        while (robot.getDirection() != courseY) {
            robot.turnLeft();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    public Robot getRandomRobot() {
        int randomCoordinateX = random.nextInt(COORDINATE_SIZE);
        int randomCoordinateY = random.nextInt(COORDINATE_SIZE);
        int randomIndexDirection = random.nextInt(Direction.values().length);
        Direction randomDirection = Direction.values()[randomIndexDirection];
        return new Robot(randomDirection, randomCoordinateX, randomCoordinateY);
    }
    
    public static void main(String[] args) {
        RobotRoute robotRoute = new RobotRoute();
        Robot robot = robotRoute.getRandomRobot();
        System.out.println("Robot started: Direction - " + robot.getDirection().name()
                + " X = " + robot.getX() + " Y = " + robot.getY());
        robotRoute.moveRobot(robot, 88, 4);
        System.out.println("Robot finished: Direction - " + robot.getDirection().name()
                + " X = " + robot.getX() + " Y = " + robot.getY());
    }
}
