package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {

        if (robot.getX() > toX) {

            turnRobot(robot, Direction.LEFT);

            while (robot.getX() != toX) {
                robot.stepForward();
            }
        } else if (robot.getX() < toX) {
            turnRobot(robot, Direction.RIGHT);
            while (robot.getX() != toX) {
                robot.stepForward();
            }

        }
        if (robot.getY() > toY) {
            turnRobot(robot, Direction.DOWN);
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        } else if (robot.getY() < toY) {
            turnRobot(robot, Direction.UP);
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }

    public void turnRobot(Robot robot,Direction targetDirection) {

        int trgDir = targetDirection.ordinal();

        while (!robot.getDirection().equals(targetDirection)) {
            int actDir = robot.getDirection().ordinal();
            int diff = ((trgDir - actDir) + 4) % 4;

            switch (diff) {
                case 1: robot.turnRight();
                break;
                case 2: robot.turnLeft();
                    robot.turnLeft();
                break;
                case 3: robot.turnLeft();
                break;
                default:
                    break;
            }
        }
    }
}
