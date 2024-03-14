package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        boolean forwardsOrBackwards = toX > robot.getX();
        if (forwardsOrBackwards) {
            rotate(robot, Direction.RIGHT);
            traverse(robot, toX - robot.getX());
        } else {
            rotate(robot, Direction.LEFT);
            traverse(robot, robot.getX() - toX);
        }

        boolean upwardsOrDownwards = toY > robot.getY();
        if (upwardsOrDownwards) {
            rotate(robot, Direction.UP);
            traverse(robot, toY - robot.getY());
        } else {
            rotate(robot, Direction.DOWN);
            traverse(robot, robot.getY() - toY);
        }
    }

    private void rotate(Robot robot, Direction direction) {
        do {
            robot.turnRight();
        } while (robot.getDirection() != direction);
    }

    private void traverse(Robot robot, int distance) {
        for (int i = 0; i < distance; i++) {
            robot.stepForward();
        }
    }
}
