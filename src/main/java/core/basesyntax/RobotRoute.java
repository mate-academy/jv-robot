package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int actualX = robot.getX();
        int actualY = robot.getY();
        if(actualY == toY && actualX == toX) {
            return;
        }
        defineHorizontalDirection(robot, actualX, toX);
        moveStepsForward(robot, Math.sqrt(Math.pow(toX - actualX, 2)));
        defineVerticalDirection(robot, actualY, toY);
        moveStepsForward(robot, Math.sqrt(Math.pow(toY - actualY, 2)));
    }
    private void moveStepsForward(Robot robot, double numberOfSteps){
        for (int i = 0 ; i < numberOfSteps; i++) {
            robot.stepForward();
        }
    }

    private void defineHorizontalDirection(Robot robot, int currentX, int toX){
        if(currentX < toX) {
            turnToDirection(robot, Direction.RIGHT);
        } else if (currentX > toX) {
            turnToDirection(robot, Direction.LEFT);
        }
    }

    private void defineVerticalDirection(Robot robot, int currentY, int toY){
        if(currentY < toY) {
            turnToDirection(robot, Direction.UP);
        } else if (currentY > toY) {
            turnToDirection(robot, Direction.DOWN);
        }
    }

    private void turnToDirection(Robot robot, Direction direction) {
        while(robot.getDirection() != direction) {
            robot.turnRight();
        }
    }
}
