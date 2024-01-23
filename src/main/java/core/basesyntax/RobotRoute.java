package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();
        Direction currentDirection = robot.getDirection();

        //Determine how far a robot from its destination
        int deltaX = toX - currentX;
        int deltaY = toY - currentY;

        //Determine required directions
        Direction xDirection = null;
        if (deltaX > 0) {
            xDirection = Direction.RIGHT;
        } else {
            xDirection = Direction.LEFT;
        }

        Direction yDirection = null;
        if (deltaY > 0) {
            yDirection = Direction.DOWN;
        } else {
            yDirection = Direction.UP;
        }

        //rotate a robot till it faces a right X direction
        while (currentDirection != xDirection) {
            robot.turnRight();
        }

        //step forward till it in right X coordinates
        while (currentX != toX) {
            robot.stepForward();
        }

        //rotate a robot till it faces a right Y direction
        while (currentDirection != yDirection) {
            robot.turnLeft();
        }

        //step forward till it in right Y coordinates
        while (currentY != toY) {
            robot.stepForward();
        }
    }
}
