package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        System.out.println("Start position " + robot.getX() + " "
                + robot.getY() + ". Direction of view: " + robot.getDirection());

        if (robot.getY() != toY) {
            while (robot.getDirection() != ((robot.getY() < toY) ? Direction.UP
                    : Direction.DOWN)) {
                robot.turnLeft();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
        if (robot.getX() != toX) {
            while (robot.getDirection() != ((robot.getX() < toX) ? Direction.RIGHT
                    : Direction.LEFT)) {
                robot.turnLeft();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        System.out.println("End position " + robot.getX() + " "
                + robot.getY() + ". Direction of view: " + robot.getDirection());
    }
}
