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
        Direction horizontalDirection = deltaX > 0 ? Direction.RIGHT : Direction.LEFT;
        Direction verticalDirection = deltaY > 0 ? Direction.UP : Direction.DOWN;

        //rotate a robot till it faces a right X direction
        while (currentDirection != horizontalDirection) {
            robot.turnRight();
        }

        //step forward till it in right X coordinates
        while (currentX != toX) {
            robot.stepForward();
        }

        //rotate a robot till it faces a right Y direction
        while (currentDirection != verticalDirection) {
            robot.turnLeft();
        }

        //step forward till it in right Y coordinates
        while (currentY != toY) {
            robot.stepForward();
        }
    }
}
