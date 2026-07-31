package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        System.out.println("Robot moves to position (X: " + toX + ", Y: " + toY + ")");
        int currentX = robot.getX();
        int currentY = robot.getY();

        if (currentX != toX) {
            movementX(robot, toX);
        }
        if (currentY != toY) {
            movementY(robot, toY);
        }
    }

    private void movementX(Robot robot, int toX) {
        int currentX = robot.getX();

        if (currentX > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (robot.getX() > toX) {
                robot.stepForward();
            }

        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getX() < toX) {
                robot.stepForward();
            }

        }
    }

    private void movementY(Robot robot, int toY) {
        int currentY = robot.getY();

        if (currentY < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (robot.getY() < toY) {
                robot.stepForward();
            }

        } else {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            while (robot.getY() > toY) {
                robot.stepForward();
            }

        }
    }
}
