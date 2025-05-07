package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        System.out.println(new StringBuilder().append("Johny now on X:")
                .append(robot.getX())
                .append(" and Y:")
                .append(robot.getY())
                .append(".\n His direction is ")
                .append(robot.getDirection())
                .append(".\n He need get to X:")
                .append(toX).append(" and Y:")
                .append(toY)
                .append("."));
        moveToRightX(robot, toX);
        moveToRightY(robot, toY);
        System.out.println("Johny in a right place!");
    }

    private void moveToRightX(Robot robot, int toX) {
        while (robot.getX() != toX) {
            if (robot.getX() < toX) {
                while (!robot.getDirection().equals(Direction.RIGHT)) {
                    robot.turnRight();
                    System.out.println("Johny turn right. Current direction is "
                            + robot.getDirection());
                }
                robot.stepForward();
                System.out.println("Johny step forward. Current X coordinate is "
                        + robot.getX());
            }
            if (robot.getX() > toX) {
                while (!robot.getDirection().equals(Direction.LEFT)) {
                    robot.turnLeft();
                    System.out.println("Johny turn left. Current direction is "
                            + robot.getDirection());
                }
                robot.stepForward();
                System.out.println("Johny step forward. Current X coordinate is "
                        + robot.getX());
            }
        }
    }

    private void moveToRightY(Robot robot, int toY) {
        while (robot.getY() != toY) {
            if (robot.getY() < toY) {
                while (!robot.getDirection().equals(Direction.UP)) {
                    robot.turnLeft();
                    System.out.println("Johny turn left. Current direction is "
                            + robot.getDirection());
                }
                robot.stepForward();
                System.out.println("Johny step forward. Current Y coordinate is "
                        + robot.getY());
            }
            if (robot.getY() > toY) {
                while (!robot.getDirection().equals(Direction.DOWN)) {
                    robot.turnLeft();
                    System.out.println("Johny turn right. Current direction is "
                            + robot.getDirection());
                }
                robot.stepForward();
                System.out.println("Johny step forward. Current Y coordinate is "
                        + robot.getY());
            }
        }
    }
}
