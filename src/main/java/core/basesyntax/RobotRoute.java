package core.basesyntax;

import java.util.Random;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        System.out.println("Move robot from [" + robot.getX() + ", " + robot.getY()
                + "] to [" + toX + ", " + toY + "]");

        moveByAxis(robot, Axis.AXIS_X, toX);
        moveByAxis(robot, Axis.AXIS_Y, toY);

        System.out.println("Final position: [" + robot.getX() + ", " + robot.getY() + "]");
    }

    private static void moveByAxis(Robot robot, Axis axis, int finalPosition) {
        Direction direction;
        int shift;
        if (axis == Axis.AXIS_X) {
            direction = (robot.getX() >= finalPosition) ? Direction.LEFT : Direction.RIGHT;
            shift = Math.abs(robot.getX() - finalPosition);
        } else {
            direction = (robot.getY() >= finalPosition) ? Direction.DOWN : Direction.UP;
            shift = Math.abs(robot.getY() - finalPosition);
        }

        while (!direction.equals(robot.getDirection())) {
            robot.turnLeft();
        }

        for (int i = 0; i < shift; i++) {
            robot.stepForward();
            System.out.println("One step " + direction + ": ["
                    + robot.getX() + ", " + robot.getY() + "]");
        }
    }

    public static void main(String[] args) {
        // the area is from -50 to 50 - according to your tests, it should be enough
        int areaLimit = 50;

        int direction = new Random().nextInt(4);

        Robot robot = new Robot(Direction.values()[direction],
                getRandomInt(areaLimit), getRandomInt(areaLimit));

        RobotRoute route = new RobotRoute();
        route.moveRobot(robot, getRandomInt(areaLimit), getRandomInt(areaLimit));
    }

    private static int getRandomInt(int areaLimit) {
        int size = (areaLimit + 1) * 2;
        int shift = areaLimit - 1;
        return new Random().nextInt(size) - shift;
    }
}
