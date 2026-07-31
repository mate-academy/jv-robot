package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        System.out.println(robot.getDirection() + " " + robot.getX() + " " + robot.getY());
        while (robot.getX() != toX) {
            if (robot.getX() > toX) {
                while (!robot.getDirection().equals(Direction.LEFT)) {
                    if (robot.getDirection().equals(Direction.DOWN)) {
                        robot.turnRight();
                    } else {
                        robot.turnLeft();
                    }
                    System.out.println(robot.getDirection());
                }
                robot.stepForward();
                System.out.println("x = " + robot.getX());
            }
            if (robot.getX() < toX) {
                while (!robot.getDirection().equals(Direction.RIGHT)) {
                    if (robot.getDirection().equals(Direction.DOWN)) {
                        robot.turnLeft();
                    } else {
                        robot.turnRight();
                    }
                    System.out.println(robot.getDirection());
                }
                robot.stepForward();
                System.out.println("x = " + robot.getX());
            }
        }
        System.out.println(robot.getDirection() + " " + robot.getX() + " " + robot.getY());
        while (robot.getY() != toY) {
            if (robot.getY() > toY) {
                while (!robot.getDirection().equals(Direction.DOWN)) {
                    if (robot.getDirection().equals(Direction.RIGHT)) {
                        robot.turnRight();
                    } else {
                        robot.turnLeft();
                    }
                    System.out.println(robot.getDirection());
                }
                robot.stepForward();
                System.out.println("y = " + robot.getY());
            }
            if (robot.getY() < toY) {
                while (!robot.getDirection().equals(Direction.UP)) {
                    if (robot.getDirection().equals(Direction.RIGHT)) {
                        robot.turnLeft();
                    } else {
                        robot.turnRight();
                    }
                    System.out.println(robot.getDirection());
                }
                robot.stepForward();
                System.out.println("y = " + robot.getY());
            }
        }
    }
}
