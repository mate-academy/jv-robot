package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() != toX && robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                System.out.println("turn to LEFT");
                robot.turnLeft();
            }
            while (robot.getX() != toX) {
                System.out.println("Step forward");
                robot.stepForward();
            }
        }
        if (robot.getX() != toX && robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                System.out.println("turn to RIGHT");
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                System.out.println("Step forward");
                robot.stepForward();
            }
        }
        if (robot.getY() != toY && robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                System.out.println("turn to LEFT");
                robot.turnLeft();
            }
            while (robot.getY() != toY) {
                System.out.println("Step forward");
                robot.stepForward();
            }
        }
        if (robot.getY() != toY && robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                System.out.println("turn to LEFT");
                robot.turnLeft();
            }
            while (robot.getY() != toY) {
                System.out.println("Step forward");
                robot.stepForward();
            }
        }
    }
}
