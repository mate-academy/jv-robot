package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
        } else if (toX > robot.getX()) {
            while ((robot.getDirection() != Direction.RIGHT)) {
                robot.turnRight();
            }
        } else {
            System.out.println("You don't need to move on X axis");
        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }

        if (toY < robot.getY()) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        } else if (toY > robot.getY()) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        } else {
            System.out.println("You don't need to move on Y axis");
        }

        while (toY != robot.getY()) {
            robot.stepForward();
        }
        System.out.println("You are at [" + robot.getX() + ", " + robot.getY() + "]");
    }
}



