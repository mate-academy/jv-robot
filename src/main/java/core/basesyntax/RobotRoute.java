package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();
        int stepsToMake;

        if (currentX != toX) {
            if (currentX < toX) {
                // need move to the left
                robot.changeDirection(Direction.RIGHT);
                stepsToMake = (toX - currentX);
            } else {
                // need to move to the right
                robot.changeDirection(Direction.LEFT);
                stepsToMake = (currentX - toX);
            }

            robot.stepForward(stepsToMake);
        }

        if (currentY != toY) {
            if (currentY < toY) {
                // need move up
                robot.changeDirection(Direction.UP);
                stepsToMake = (toY - currentY);
            } else {
                // need to move down
                robot.changeDirection(Direction.DOWN);
                stepsToMake = (currentY - toY);
            }

            robot.stepForward(stepsToMake);
        }
    }
}
