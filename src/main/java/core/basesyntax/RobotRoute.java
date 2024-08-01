package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getDirection() != Direction.UP) {
            robot.turnRight();
        }
        System.out.println("TARGET POSITION COORDINATES: x = " + toX + " y = " + toY);

        if (toY > robot.getY()) {
            while (robot.getY() < toY) {
                robot.stepForward();
            }
            System.out.println("Now robot is turn " + robot.getDirection());
        } else if (toY < robot.getY()) {
            robot.turnRight();
            robot.turnRight();
            while (robot.getY() > toY) {
                robot.stepForward();
            }
            System.out.println("Now robot is turn " + robot.getDirection());
        }

        System.out.println("ROBOT COORDINATES: x = " + robot.getX() + " y = " + robot.getY());

        while (robot.getDirection() != Direction.RIGHT) {
            robot.turnRight();
        }

        if (toX > robot.getX()) {
            while (robot.getX() < toX) {
                robot.stepForward();
            }
            System.out.println("Now robot is turn " + robot.getDirection());
        } else if (toX < robot.getX()) {
            robot.turnLeft();
            robot.turnLeft();
            while (robot.getX() > toX) {
                robot.stepForward();
            }
            System.out.println("Now robot is turn " + robot.getDirection());
        }

        System.out.println("ROBOT COORDINATES: x = " + robot.getX() + " y = " + robot.getY());
    }
}
