package core.basesyntax;

public class RobotRoute {

    // axis weather 'x' or 'y'
    private Direction findNeededDirection(Robot robot, char axis, int destination) {
        Direction neededDirection;
        switch (axis) {
            case 'x': // fined needed direction to move along x
                if (destination < robot.getX()) {
                    neededDirection = Direction.LEFT;
                } else if (destination > robot.getX()) {
                    neededDirection = Direction.RIGHT;
                } else {
                    neededDirection = robot.getDirection();
                }
                break;
            case 'y': // fined needed direction to move along Y
                if (destination < robot.getY()) {
                    neededDirection = Direction.DOWN;
                } else if (destination > robot.getY()) {
                    neededDirection = Direction.UP;
                } else {
                    neededDirection = robot.getDirection();
                }
                break;
            default:
                System.out.println("Wrong parameter: class RobotRoute, method findNeededDirection");
                neededDirection = robot.getDirection();
        }
        return neededDirection;
    }

    private void turnRobot(Robot robot, Direction neededDirection) {
        while (neededDirection != robot.getDirection()) {
            robot.turnLeft();
        }
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        turnRobot(robot, findNeededDirection(robot, 'x', toX));
        while (robot.getX() != toX) { // move
            robot.stepForward();
        }
        turnRobot(robot, findNeededDirection(robot, 'y', toY));
        while (robot.getY() != toY) { // move
            robot.stepForward();
        }
    }
}
