package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() - toX > 0 && robot.getY() - toY > 0) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            System.out.println(robot.getDirection());
            while (robot.getX() != toX) {
                robot.stepForward();
            }
            System.out.println(robot.getX());


            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            System.out.println(robot.getDirection());
            while (robot.getY() != toY) {
                robot.stepForward();
            }
            System.out.println(robot.getX());
        } else if (robot.getX() - toX > 0 && robot.getY() - toY < 0) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            System.out.println(robot.getDirection());
            while (robot.getX() != toX) {
                robot.stepForward();
            }
            System.out.println(robot.getX());


            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
            System.out.println(robot.getDirection());
            while (robot.getY() != toY) {
                robot.stepForward();
            }
            System.out.println(robot.getX());
        } else if (robot.getX() - toX < 0 && robot.getY() - toY < 0) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            }
            System.out.println(robot.getDirection());
            while (robot.getX() != toX) {
                robot.stepForward();
            }
            System.out.println(robot.getX());


            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
            System.out.println(robot.getDirection());
            while (robot.getY() != toY) {
                robot.stepForward();
            }
            System.out.println(robot.getX());
        } else if (robot.getX() - toX < 0 && robot.getY() - toY > 0) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            }
            System.out.println(robot.getDirection());
            while (robot.getX() != toX) {
                robot.stepForward();
            }
            System.out.println(robot.getX());

            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            System.out.println(robot.getDirection());
            while (robot.getY() != toY) {
                robot.stepForward();
            }
            System.out.println(robot.getX());
        } else if (robot.getX() - toX == 0 && robot.getY() - toY < 0) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
            System.out.println(robot.getDirection());
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }
}