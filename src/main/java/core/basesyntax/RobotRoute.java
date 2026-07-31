package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            turnRobotTo(robot, Direction.RIGHT);
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        } else if (robot.getX() > toX) {
            turnRobotTo(robot, Direction.LEFT);
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        }

        if (robot.getY() < toY) {
            turnRobotTo(robot, Direction.UP);
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        } else if (robot.getY() > toY) {
            turnRobotTo(robot, Direction.DOWN);
            while (robot.getY() > toY) {
                robot.stepForward();
            }
        }
    }

    private void turnRobotTo(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            switch (robot.getDirection()) {
                case UP:
                    if (targetDirection == Direction.LEFT) {
                        robot.turnLeft();
                    } else if (targetDirection == Direction.RIGHT) {
                        robot.turnRight();
                    } else {
                        robot.turnLeft();
                    }
                    break;
                case RIGHT:
                    if (targetDirection == Direction.UP) {
                        robot.turnLeft();
                    } else if (targetDirection == Direction.DOWN) {
                        robot.turnRight();
                    } else {
                        robot.turnRight();
                    }
                    break;
                case DOWN:
                    if (targetDirection == Direction.RIGHT) {
                        robot.turnLeft();
                    } else if (targetDirection == Direction.LEFT) {
                        robot.turnRight();
                    } else {
                        robot.turnLeft();
                    }
                    break;
                case LEFT:
                    if (targetDirection == Direction.DOWN) {
                        robot.turnLeft();
                    } else if (targetDirection == Direction.UP) {
                        robot.turnRight();
                    } else {
                        robot.turnRight();
                    }
                    break;
                default:
                    throw new IllegalStateException("Unexpected direction: "
                            + robot.getDirection());
            }
        }
    }
}
