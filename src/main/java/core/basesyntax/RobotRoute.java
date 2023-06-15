package core.basesyntax;

import java.util.Random;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        int currentX = robot.getX();
        int currentY = robot.getY();

        System.out.println("Move robot from [" + currentX + ", " + currentY + "] to [" + toX + ", " + toY +"]");

        currentX = moveByAxis(currentX, currentY, Axis.AXIS_X, toX);
        currentY = moveByAxis(currentX, currentY, Axis.AXIS_Y, toY);

        System.out.println("Final position: [" + currentX + ", " + currentY + "]");
    }

    private static int moveByAxis(int currentX, int currentY, Axis axis, int finalPosition) {
        Direction direction;
        int shift;
        if (axis == Axis.AXIS_X) {
            direction = (currentX >= finalPosition) ? Direction.LEFT : Direction.RIGHT;
            shift = Math.abs(currentX - finalPosition);
        } else {
            direction = (currentY >= finalPosition) ? Direction.DOWN : Direction.UP;
            shift = Math.abs(currentY - finalPosition);
        }

        for (int i = 0; i < shift; i++) {
            switch (direction) {
                case UP:
                    currentY++;
                    break;
                case DOWN:
                    currentY--;
                    break;
                case LEFT:
                    currentX--;
                    break;
                case RIGHT:
                    currentX++;
                    break;
            }
            System.out.println("One step " + direction + ": [" + currentX + ", " + currentY + "]");
        }
        return (axis == Axis.AXIS_X) ? currentX : currentY;
    }

    public static void main(String[] args) {
        // the area is from -50 to 50 - according to your tests, it should be enough
        int areaLimit = 50;

        int rDirection = new Random().nextInt(4);

        Robot robot = new Robot(Direction.values()[rDirection], getRandomInt(areaLimit), getRandomInt(areaLimit));

        RobotRoute route = new RobotRoute();
        route.moveRobot(robot, getRandomInt(areaLimit), getRandomInt(areaLimit));
    }

    private static int getRandomInt(int areaLimit) {
        int aSize = (areaLimit + 1) * 2;
        int shift = areaLimit - 1;
        return new Random().nextInt(aSize) - shift;
    }
}
