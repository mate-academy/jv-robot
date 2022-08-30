package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        System.out.println("Initial robot direction: " + robot.getDirection()
                + "  X: " + robot.getX() + "  Y: " + robot.getY());
        System.out.println("Destination:  X: " + toX + "  Y: " + toY);

        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
                System.out.println("Robot turned, adjusting direction: " + robot.getDirection());
            }

            while (robot.getX() != toX) {
                robot.stepForward();
                System.out.println("Adjusting position: X: " + robot.getX());
            }

        } else if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
                System.out.println("Robot turned, adjusting direction: " + robot.getDirection());
            }

            while (robot.getX() != toX) {
                robot.stepForward();
                System.out.println("Adjusting position: X: " + robot.getX());
            }
        }
        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
                System.out.println("Robot turned, adjusting direction: " + robot.getDirection());
            }
            while (robot.getY() != toY) {
                robot.stepForward();
                System.out.println("Adjusting position: Y: " + robot.getY());
            }

        } else if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
                System.out.println("Robot turned, adjusting direction: " + robot.getDirection());
            }
            while (robot.getY() != toY) {
                robot.stepForward();
                System.out.println("Adjusting position: Y: " + robot.getY());
            }

        }
        System.out.println("Final robot position X: " + robot.getX() + "  Y: " + robot.getY());

    }
}


