package core.basesyntax;

public class RobotRoute {

    private void changeDirection(Robot robot, Direction targetDirection) {
        while (!robot.getDirection().equals(targetDirection)) {
            robot.turnLeft();
        }
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        int robotX = robot.getX();
        int robotY = robot.getY();

        if (robotX != toX || robotY != toY) {
            if (robotX < toX) {
                changeDirection(robot, Direction.RIGHT);
            } else if (robotX > toX) {
                changeDirection(robot, Direction.LEFT);
            }

            while (robot.getX() != toX) {
                robot.stepForward();
            }

            if (robotY < toY) {
                changeDirection(robot, Direction.UP);
            } else if (robotY > toY) {
                changeDirection(robot, Direction.DOWN);
            }

            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }
}
